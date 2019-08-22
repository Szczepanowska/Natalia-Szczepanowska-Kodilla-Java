package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
    Logger.getInstance().log("log123");

    String result = Logger.getInstance().getLastLog();

        Assert.assertEquals("log123", result);
    }
}
