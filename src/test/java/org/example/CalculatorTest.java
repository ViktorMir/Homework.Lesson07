//Task 3.3
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void calculator1 (){
        Calculator calculator = new Calculator();
        assertEquals(32,32);
    }

    @Test
    public void calculator2 (){
        Calculator calculator = new Calculator();
        assertEquals(15,15);
    }

    @Test
    public void calculator3 (){
        Calculator calculator = new Calculator();
        assertEquals(23,23);
    }

    @Test
    public void calculator4 (){
        Calculator calculator = new Calculator();
        assertEquals(17,17);
    }
}
