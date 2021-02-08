import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){ calculator = new Calculator("Calculator");}


    @Test
    public void hasName(){
        assertEquals("Calculator", calculator.getName());
    }

    @Test
    public void additionTest1(){
        assertEquals(5, calculator.add(2,3), 0.0);
    }
    @Test
    public void additionTest2(){
        assertEquals(5.5, calculator.add(2.25,3.25), 0.0);
    }

    @Test
    public void subtractTest1(){
        assertEquals(9, calculator.subtract(17, 8));
    }

    @Test
    public void multiplyTest1(){
        assertEquals(12, calculator.multiply(2, 6), 0.0);
    }

    @Test
    public void divideTest1(){
        assertEquals(7, calculator.divide(21, 3), 0.0);
    }
}

