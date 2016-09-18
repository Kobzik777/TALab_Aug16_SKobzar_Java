package epam.ua;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Кобзарь on 18/09/2016.
 */
public class ModelTest {
    Model model = new Model();
    boolean gameIsRunning = true;

    @Test
    public void checkValueWhenValueIsSecretValue() throws Exception {
        boolean res = model.checkValue(model.setSecretValue(), gameIsRunning);
        Assert.assertFalse(res);
    }

    @Test
    public void checkValueWithOverMaxValueInput() throws Exception {
        boolean res = model.checkValue(150, gameIsRunning);
        Assert.assertTrue(res);
    }

    @Test
    public void checkValueWithOverMinValueInput() throws Exception {
        boolean res = model.checkValue(-100, gameIsRunning);
        Assert.assertTrue(res);
    }

    @Test
    public void setSecretValue() throws Exception {

        for(int i =100; i>0; i--) {
            model.setSecretValue();
            if (model.getSecretValue() <= 0 || model.getSecretValue() >= 100) fail();
        }
    }



}