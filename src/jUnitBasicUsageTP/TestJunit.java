/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jUnitBasicUsageTP;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author rtafuni
 */
public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }
}
