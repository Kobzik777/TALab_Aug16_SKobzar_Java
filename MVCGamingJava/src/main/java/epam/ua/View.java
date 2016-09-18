package epam.ua;

/**
 * Created by Кобзарь on 18/09/2016.
 */
public class View {

    public static final String VALUE_IS_LOWER = " Your Value is lower then the secret one. Try this diapason: ";
    public static final String VALUE_IS_HIGHER = " Your Value is higher then the secret one. Try this diapason:";
    public static final String VALUE_IS_CORRECT = "You won!";
    public static final String WRONG_DIAPASON = " Your Value is incorrect! Please, choose a value from the diaposon";
    public static final String WRONG_INPUT_INT = " U have to put a number!";
    public static final String INPUT_INT_DATA = " Input INT value = ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void concatAndPrint(String... message) {
        StringBuilder scr = new StringBuilder();
        StringBuilder concatString = null;
        for (String v : message) {
            concatString = scr.append(v);
        }
        printMessage(new String(concatString));
    }
}
