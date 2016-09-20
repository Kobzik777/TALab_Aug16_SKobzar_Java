package com.company;

import com.company.Entities.Adress;

import java.util.Scanner;

/**
 * Created by Serhii_Kobzar on 9/20/2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        inputStringWithScanner(sc);
        System.out.println(model.noteBook.toString());

    }

    public void inputStringWithScanner(Scanner sc) {
        //String res;
        String input;
/*
        while (true) {
            view.printMessage(view.INPUT_NAME);
            input = sc.nextLine();
            if (input.matches("[A-Za-z]+")) {
                model.setName(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_MIDDLE);
            input = sc.nextLine();
            if (input.matches("[A-Za-z]+")) {
                model.setMiddleName(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_LAST);
            input = sc.nextLine();
            if (input.matches("[A-Za-z]+")) {
                model.setLastName(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_NICK);
            input = sc.nextLine();
            if (input.matches("^[A-Za-z][A-Za-z0-9_]{1,14}$")) {
                model.setNickName(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_COMMENT);
            input = sc.nextLine();
            if (input.matches("^[^0-9]{1,50}$")) {
                model.setComment(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_HOMEPHONE);
            input = sc.nextLine();
            if (input.matches("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})")) {
                model.setHomePhone(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_FIRSTCELLPHONE);
            input = sc.nextLine();
            if (input.matches("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})")) {
                model.setCellFirst(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_SECONDCELLPHONE);
            input = sc.nextLine();
            if (input.matches("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})")) {
                model.setCellSecond(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }
        while (true) {
            view.printMessage(view.INPUT_EMAIL);
            input = sc.nextLine();
            if (input.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
                model.setEmail(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }
        while (true) {
            view.printMessage(view.INPUT_SKYPE);
            input = sc.nextLine();
            if (input.matches("^[A-Za-z][A-Za-z0-9_]{1,14}$")) {
                model.setSkype(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }
        while (true) {
            view.printMessage(view.INPUT_DATA_REGISTER);
            input = sc.nextLine();
            if (input.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
                model.setRegistrDate(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }
        while (true) {
            view.printMessage(view.INPUT_DATA_CHANGES);
            input = sc.nextLine();
            if (input.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
                model.setChangesDate(input);
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }
        while (true) {
            view.printMessage(view.INPUT_GROUP);
            input = sc.nextLine();
            if (input.matches("(RED)|(BLUE)|(GREEN)")) {
                model.setGroup(Group.valueOf(input));
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }*/
        while (true) {
            view.printMessage(view.INPUT_ADRESS);
            input = sc.nextLine();
            if (input.matches("([0-9]+),([A-Za-z]+),([A-Za-z]+),([A-Za-z][A-Za-z0-9_]+),([A-Za-z][A-Za-z0-9_]+)")) {
                model.setAdres(new Adress(input));
                break;
            } else {
                view.concatAndPrint(view.WRONG_INPUT);
                continue;
            }
        }
        //return res;
    }

}
