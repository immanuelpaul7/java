package com.sndevops.eng;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    private String INPUT = "44";
    private boolean isPassed = true;
    // Add more tests
    // Connected , unconfigured track true- Case 1
   @Ignore("ignore test") @Test
    public void testLength() {
        Assert.assertEquals(INPUT,"115");
    }
    
    @Test
    public void testPassed() {
        Assert.assertEquals(isPassed,true);
    }
    @Test
    public void testFailed() {
        Assert.assertFalse(isPassed);
    }
    
    @Test
    public void testFailedFixed() {
        Assert.assertFalse(isPassed);
    }
        @Test
    public void testRegression() {
        Assert.assertTrue(isPassed);
    }
}
