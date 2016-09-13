package com.company;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Serhii_Kobzar on 9/13/2016.
 */
public class ArihtmeticOperationTest {

    @Ignore
    @Test
    public void deduct() throws Exception {
        ArihtmeticOperation a = new ArihtmeticOperation();
        double res = a.deduct(7,3);
        Assert.assertEquals(4.0, res, 0);

    }

    @Test
    public void mult() throws Exception {
        ArihtmeticOperation a = new ArihtmeticOperation();
        double res = a.mult(3,7);
        Assert.assertEquals(21.0, res, 0);

    }

    @Test
    public void div() throws Exception {
        ArihtmeticOperation a = new ArihtmeticOperation();
        double res = a.div(4,2);
        Assert.assertEquals(2.0, res, 0);

    }

    @Test
    public void add() throws Exception {
        ArihtmeticOperation a = new ArihtmeticOperation();
        double res = a.add(3,7);
        Assert.assertEquals(10.0, res, 0);

    }

}