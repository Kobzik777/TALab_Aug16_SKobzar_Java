/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamingjava;

import java.util.*;

/**
 * @author Кобзарь
 */
public class GamingJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int gamesValue = rand.nextInt(100);
        int countStep = 0;
        int uperBorder = 100;
        int lowerBorder = 0;
        boolean gameIsRunning = true;
        System.out.println(gamesValue);
        Scanner in = new Scanner(System.in);
        try {
            while (gameIsRunning) {

                int playersTurn = in.nextInt();


                if (playersTurn > 100 || playersTurn < 0)
                    throw new IllegalArgumentException("Вы ввели чило не из нужного диапазона. Нельзя так :(");

                if (playersTurn != gamesValue) {
                    if (playersTurn < gamesValue) {
                        if (playersTurn <= lowerBorder) {
                            System.out.println("Вы ввели число меньше минимального значения, введите ещё раз");
                        } else {
                            countStep++;
                            lowerBorder = playersTurn;
                            System.out.println("Шаг " + countStep);
                            System.out.println("Ваше число меньше заданного");
                            System.out.println("Диапозон теперь от " + lowerBorder + " до " + uperBorder);
                        }
                    } else {
                        if (playersTurn >= uperBorder) {
                            System.out.println("Вы ввели число больше максимального значения, введите ещё раз");
                        } else {
                            countStep++;
                            uperBorder = playersTurn;
                            System.out.println("Шаг " + countStep);
                            System.out.println("Ваше число больше заданного заданого");
                            System.out.println("Диапозон теперь от " + lowerBorder + " до " + uperBorder);
                        }
                    }
                } else {
                    if (countStep < 4 && countStep != 0) {
                        countStep++;
                        System.out.println("Ура! Вы угадали число! Это " + gamesValue + "! Вам понадобилось всего " + countStep + " Шагa");
                        gameIsRunning = false;
                    } else {
                        if (countStep >= 4) {
                            countStep++;
                            System.out.println("Ура! Вы угадали число! Это " + gamesValue + "! Вам понадобилось всего " + countStep + " Шагов");
                            gameIsRunning = false;
                        } else {
                            countStep++;
                            System.out.println("O_O! Вы просто гений ! Это " + gamesValue + "! Вам понадобилось всего " + countStep + " Шаг О_О");
                            gameIsRunning = false;
                        }
                    }
                }
            }
        } catch (InputMismatchException exc) {
            System.out.println("АХТУНГ! Вводить необходимо только цифры из диапазона от " + lowerBorder + " до " + uperBorder);

        }
    }


}

