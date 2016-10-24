/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jUnitAPI;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author rtafuni
 */
public class TestJunit3 extends TestResult {

    // add the error
    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test) test, t);
    }

    // add the failure
    public synchronized void addFailure(Test test, AssertionFailedError t) {
        super.addFailure((junit.framework.Test) test, t);
    }

    @Test
    public void testAdd() {
        // add any test
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fie", str);
        assertEquals("Junit i working fine", str);
        assertEquals("Junit is orking fine", str);
        assertEquals("Junt is working fine", str);
        assertEquals("Junit is working fine", str);
        assertEquals("Junit is woking fine", str);
        assertEquals("Junt is working fine", str);
    }

    // Marks that the test run should stop.
    public synchronized void stop() {
        //stop the test here
    }
}
