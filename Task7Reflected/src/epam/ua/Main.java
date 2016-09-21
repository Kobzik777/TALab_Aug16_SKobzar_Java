package epam.ua;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
	// write your code here
        Controller controller = new Controller();
        controller.processUser();

    }
}
