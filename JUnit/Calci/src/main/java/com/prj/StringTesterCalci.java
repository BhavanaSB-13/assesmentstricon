package com.prj;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringTesterCalci {

    @BeforeClass
    public static void show()
    {
        System.out.println("Start");
    }

    @Test
    public void empty()
    {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void singleNumber()
    {
        assertEquals(9, StringCalculator.add("9"));
    }

    @Test
    public void number()
    {
        assertEquals(7, StringCalculator.add("5,2"));
    }

    @Test
    public void numbers()
    {
        assertEquals(8, StringCalculator.add("3,2\n3"));
        assertEquals(10, StringCalculator.add("1\n2,3,4"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbers()
    {
        StringCalculator.add("1,-2,3");
    }
    @AfterClass
    public static void shows()
    {
        System.out.println("End");
    }
}