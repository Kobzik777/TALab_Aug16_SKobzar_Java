package epam.ua;


import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;
/**
 * Created by Кобзарь on 21/09/2016.
 */
public class Controller {

    public void processUser()  throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        InputStream is = Main.class.getResourceAsStream("elements.properties");
        Properties dataProps = new Properties();
        dataProps.load(is);
        is = Main.class.getResourceAsStream("regexps.properties");
        Properties regexProps = new Properties();
        regexProps.load(is);
        Enumeration<String> names = (Enumeration<String>) dataProps.propertyNames();

        String className = "ua.epam.Model";
        Class clazz = Class.forName(className);
        Object obj = clazz.newInstance();

        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = dataProps.getProperty(name);
            if (!value.matches(regexProps.getProperty(name))) {
                System.out.println("Not matches: " + name + "=" + value);
            }
            for (Method method : clazz.getMethods()) {
                // System.out.println(method.getName());
                //  System.out.println("set" + name.substring(0, 1).toUpperCase() +
                //        name.substring(1));
                if (method.getName().equals("set" + name.substring(0, 1).toUpperCase() +
                        name.substring(1))) {
                    if (method.isAnnotationPresent(Ignore.class)) {
                        Ignore annot = method.getAnnotation(Ignore.class);
                        System.out.println(annot.description());

                        break;
                    }
                    if (method.getParameterTypes()[0].isPrimitive()) {
                        if (method.getParameterTypes()[0] == int.class) {
                            method.invoke(obj, Integer.valueOf(value));
                        } else if (method.getParameterTypes()[0] == double.class) {
                            method.invoke(obj, Double.valueOf(value));
                        }
                    } else {//String
                        method.invoke(obj, value);
                    }
                    break;

                }
            }
        }
        System.out.println(obj);
    }
}
