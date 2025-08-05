package com.rohan.college.college;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class formulaTest {

    formula formula;

    @BeforeAll
    void beforeAllTests() {
        System.out.println("Before All Tests");
        formula = new formula(); // Initialize here since we use PER_CLASS
    }

    @AfterAll
    void afterAllTests() {
        System.out.println("After All Tests");
    }

    
    @Test
   protected  void testAdd() {
        int result = formula.add(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testAreaOfCircle() {
        double result = formula.areaOfCircle(1);
        assertEquals(Math.PI, result, 0.0001);
    }
    
    
    @Test
    public void testpass() {
        double result = formula.password(190);
        assertEquals(190, result);
    }
}
