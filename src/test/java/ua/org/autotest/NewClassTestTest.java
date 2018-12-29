package ua.org.autotest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NewClassTestTest extends Object {
    @BeforeClass
    public static void testSetup() {
    }

    @AfterClass
    public static void testCleanup() {
        // Teardown for data used by the unit tests
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        NewClassTest tester = new NewClassTest();
        tester.multiply(1000, 5);
    }


    @Test
    public void multiply() {
        NewClassTest tester = new NewClassTest();
        assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
    }

}
