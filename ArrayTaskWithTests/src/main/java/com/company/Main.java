package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[] = {1,2,3,4,5,1,3,1};
        int serchingNumber = 1;
        System.out.println(Arrays.toString(ArrayOperations.findIndexesOfArray(array,serchingNumber)));
    }
}
