package college;
import static org.junit.jupiter.api.Assertions.*;

import org.hibernate.sql.ast.tree.expression.Format;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class formulaTest {

    college.formula formula;

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
    @Order (2)
   protected  void testAdd() {
       // int result = formula.add(3, 7);
        assertEquals(10, formula.add(3, 7));
        assertEquals(10, formula.add(5, 5));
        assertEquals(10, formula.add(8, 2));
        
    }

    @Test
    @Order (1)
    public void testAreaOfCircle() {
        double result = formula.areaOfCircle(1);
        assertEquals(Math.PI, result, 0.0001);
    }
    
    @Order (3)
    @RepeatedTest (3)
    @Test
    public void testpass() {
        double result = formula.password(190);
        assertEquals(190, result);
    }
}
