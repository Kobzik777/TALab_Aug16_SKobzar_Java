package com.company;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Serhii_Kobzar on 9/13/2016.
 */
public class ArihtmeticOperationTest {

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = Timeout.millis(1000);

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

    @Test //(expected = ArithmeticException.class)
    public void testDiveExeption(){
        ArihtmeticOperation a = new ArihtmeticOperation();
        exp.expect(ArithmeticException.class);
        a.div(4,0);
    }

    @Test (timeout = 1000)
    public void timeTest(){
        ArihtmeticOperation a = new ArihtmeticOperation();
        a.div(4,2);
    }

}