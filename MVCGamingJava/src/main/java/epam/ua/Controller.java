package epam.ua;

import java.util.Scanner;

/**
 * Created by Кобзарь on 18/09/2016.
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
        model.setValue(inputIntValueWithScanner(sc));
        view.concatAndPrint(view.VALUE_IS_CORRECT);
    }

    public int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        boolean gameIsRunning = true;
        model.setSecretValue();
        view.printMessage(view.INPUT_INT_DATA);

        while (gameIsRunning) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT
                        + View.INPUT_INT_DATA);
                sc.next();
            }
            if ((res = sc.nextInt()) <= model.getMinValue() ||
                    res >= model.getMaxValue()) {
                view.printMessage(View.WRONG_DIAPASON
                        + View.INPUT_INT_DATA);
                continue;
            } else  {
                gameIsRunning = model.checkValue(res,gameIsRunning);
            }
        }
        return res;
    }

}
