package demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addition() {
        int result;
        result=Calculator.addition(20,17);
        assertEquals(37,result);
    }

    @Test
    public void subtraction() {
        int result;
        result=Calculator.subtraction(203,180);
        assertEquals(23,result);
    }

    @Test
    public void product() {
        int result;
        result=Calculator.product(12,50);
        assertEquals(600,result);
    }

    @Test
    public void division() {
        int result;
        result=Calculator.division(24,5);
        assertEquals(4,result);
    }
}