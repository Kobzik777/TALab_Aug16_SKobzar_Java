package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Serhii_Kobzar on 9/14/2016.
 */
public class ArrayOperationsTest {

    int emptyArray[] = {};
    int oneElementArray[]={1};
    int [] moreThenOneResult = {0,5,7};
    int searchingValue = 1;

    @Test
    public void tesFindIndexesOfArrayEmpryArray() throws Exception {
        int[] emptyArrayForTestRes = {};
        int[] res = ArrayOperations.findIndexesOfArray(emptyArray, searchingValue);
        Assert.assertArrayEquals(res,emptyArrayForTestRes);
    }

    @Test
    public void testFindIndexesOfArrayOneElementArrayWithElementIncluded() throws Exception {
        int[] oneElementArraForTest= {1};
        int[] res = ArrayOperations.findIndexesOfArray(oneElementArraForTest, searchingValue);
        Assert.assertEquals(oneElementArray.length,res.length);
    }

    @Test
    public void testFindIndexesOfArrayOneElementArrayWithElementExcluded() throws Exception{
        int[] oneElementArraForTest= {2};
        int[] res = ArrayOperations.findIndexesOfArray(oneElementArraForTest, searchingValue);
        Assert.assertEquals(emptyArray.length,res.length);
    }

    @Test
    public void testFindIndexesOfArrayMoreThenOneElement(){
        int[] moreThenOneTest = {1,2,3,4,5,1,3,1};
        int[] res = ArrayOperations.findIndexesOfArray(moreThenOneTest, searchingValue);
        Assert.assertArrayEquals(res,moreThenOneResult);
    }

    @Test
    public void findCountOfValueInEmptyArray(){
        int[] arrayFroEmtyCount = {};
        int res = ArrayOperations.findCountOfValueInArray(arrayFroEmtyCount, searchingValue);
        Assert.assertEquals(res,0);
    }

    @Test
    public void findCountOfValueInNotEmtyArrayWithoutSearchingElement(){
        int arrayWithElements[] = {2,3,4,5,6,7};
        int res = ArrayOperations.findCountOfValueInArray(arrayWithElements, searchingValue);
        Assert.assertEquals(res,0);
    }

    @Test
    public void findCountOfValueInNotEmtyArrayWithSearchingElement(){
        int arrayWithElements[] = {1,2,3,4,5,6,7,1,1};
        int res = ArrayOperations.findCountOfValueInArray(arrayWithElements, searchingValue);
        Assert.assertEquals(res,3);
    }
}