package com.company;

/**
 * Created by Serhii_Kobzar on 9/20/2016.
 */
public class View {

    public static final String INPUT_NAME = "Input your name";
    public static final String INPUT_MIDDLE = "Input your middle name";
    public static final String INPUT_LAST = "Input your last name";
    public static final String INPUT_NICK = "Input your nick name";
    public static final String INPUT_COMMENT = "Input your comment";
    public static final String INPUT_GROUP = "Input your group";
    public static final String INPUT_HOMEPHONE = "Input your home phone";
    public static final String INPUT_FIRSTCELLPHONE = "Input your first cell phone";
    public static final String INPUT_SECONDCELLPHONE = "Input your second cell phone";
    public static final String INPUT_EMAIL = "Input your email";
    public static final String INPUT_SKYPE = "Input your skype";
    public static final String INPUT_ADRESS = "Input index, city, street, house number, flat number";
    public static final String INPUT_DATA_REGISTER = "Input registration date dd/mm/yyyy ";
    public static final String INPUT_DATA_CHANGES = "Input last change date dd/mm/yyyy ";
    public static final String WRONG_INPUT = "U have to put a symbol!";
    public static final String INPUT_DATA = "Input INT value = ";

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
