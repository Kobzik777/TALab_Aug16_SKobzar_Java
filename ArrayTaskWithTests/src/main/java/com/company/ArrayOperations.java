package com.company;

/**
 * Created by Serhii_Kobzar on 9/14/2016.
 */
public class ArrayOperations {



    public static int findCountOfValueInArray(int [] array, int value) {
        int count = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) count++;
        }

        return count;
    }

    public static int [] findIndexesOfArray(int [] array, int value) {
        int countOfValueInArray = findCountOfValueInArray(array, value);
        int [] arr = new int[countOfValueInArray];

        if (countOfValueInArray == 0) return arr;
        else {
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] == value) {
                    arr[j++] = i;
                }
            }
        }

        return arr;
    }
}
