package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[] = {2,3,4,5,6,7,8,2};
        int serchingNumber = 2;
        System.out.println(Arrays.toString(ArrayOperations.findIndexesOfArray(array,serchingNumber)));
    }
}
