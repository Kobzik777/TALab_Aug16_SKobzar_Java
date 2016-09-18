package epam.ua;

import java.util.Random;

/**
 * Created by Кобзарь on 18/09/2016.
 */
public class Model {


    private int maxValue = 100;
    private int minValue = 0;
    private int value;
    private int secretValue;
    private boolean gameIsRunning = true;

    View view;


    public boolean checkValue(int value, boolean gameIsRunning) {
        if (value <= getMinValue() || value >= getMaxValue()){
            System.out.println(View.WRONG_DIAPASON);
        }
        else {
            if (value == getSecretValue()) {
                gameIsRunning = false;
            } else {
                if (value != getSecretValue()) {
                    if (value < getSecretValue()) {

                        setMinValue(value);
                        System.out.println(View.VALUE_IS_LOWER + getMinValue() + " " + getMaxValue());
                        //System.out.print(getSecretValue());
                        gameIsRunning = true;

                    } else if (value > getSecretValue()) {

                        setMaxValue(value);
                        System.out.println(View.VALUE_IS_HIGHER + getMinValue() + " " + getMaxValue());
                        //System.out.print(getSecretValue());
                        gameIsRunning = true;

                    }
                }
            }
        }
        return gameIsRunning;
    }


    public int setSecretValue() {
        secretValue = (int) (Math.random() * 99 + 1);
        return secretValue;
    }

    public int getSecretValue() {
        return secretValue;
    }


    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
