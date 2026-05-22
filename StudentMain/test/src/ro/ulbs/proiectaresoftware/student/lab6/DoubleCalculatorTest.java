package ro.ulbs.proiectaresoftware.student.lab6;
import org.junit.jupiter.api.*;


public class DoubleCalculatorTest extends ACalculatorTest{
    private DoubleCalculator Test;
    @BeforeEach
    public void setup (){
        Test.init();
        Assertions.assertNotNull(Test);
    }
    @Test
    public void addTest(){
        Test.add(20.0);
        Assertions.assertEquals(20.0,Test.result());
    }
    @Test
    public void subTest(){
        Test.subtract(20.0);
        Assertions.assertEquals(-20.0,Test.result());
    }
    @Test
    public void mulTest() {
        Test.add(1.0);
        Test.multiply(5.0);
        Assertions.assertEquals(5.0,Test.result());
    }
    @Test
    public void divTest() {
        Test.add(20.0);
        Test.divide(2.0);
        Assertions.assertEquals(10.0,Test.result());
    }
}
