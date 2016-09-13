package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Serhii_Kobzar on 9/13/2016.
 */
public class ArihtmeticOperationTest {
    @Test
    public void deduct() throws Exception {
        ArihtmeticOperation a = new ArihtmeticOperation();
        double res = a.deduct(7,3);
        if (res != 4) Assert.fail();
    }

    @Test
    public void mult() throws Exception {
        ArihtmeticOperation a = new ArihtmeticOperation();
        double res = a.mult(3,7);
        if (res != 21) Assert.fail();
    }

    @Test
    public void div() throws Exception {
        ArihtmeticOperation a = new ArihtmeticOperation();
        double res = a.div(4,2);
        if (res != 2) Assert.fail();
    }

    @Test
    public void add() throws Exception {
        ArihtmeticOperation a = new ArihtmeticOperation();
        double res = a.add(3,7);
        Assert.assertNotNull(res);
    }

}