package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Serhii_Kobzar on 9/13/2016.
 */
public class ArihtmeticOperationTest {

    private ArihtmeticOperation a;
    
    @Before
    public void runT(){
        a = new ArihtmeticOperation();
    }

    @Test
    public void deduct() throws Exception {
        runT();
        double res = a.deduct(7,3);
        Assert.assertEquals(4.0, res, 0);
        a = null;
    }

    @Test
    public void mult() throws Exception {
        runT();
        double res = a.mult(3,7);
        Assert.assertEquals(21.0, res, 0);
        a = null;
    }

    @Test
    public void div() throws Exception {
        runT();
        double res = a.div(4,2);
        Assert.assertEquals(2.0, res, 0);
        a = null;
    }

    @Test
    public void add() throws Exception {
        runT();
        double res = a.add(3,7);
        Assert.assertEquals(10.0, res, 0);
        a = null;
    }

}