package ro.ulbs.proiectaresoftware.student.lab6;
import org.junit.jupiter.api.*;



public class NewIntCalculatorTest extends ACalculatorTest{
    private NewIntCalculator Test;

    @BeforeEach
    public void Setup(){
        Test.init();
        Assertions.assertNull(Test);
    }
    @Test
    public void addTest(){
        Test.init();
        Test.add(5);
        Assertions.assertEquals(5,Test.result());
    }@Test
    public void subTest(){
        Test.add(10);
        Test.subtract(5);
        Assertions.assertEquals(5,Test.result());
    }@Test
    public void mulTest(){
        Test.add(1);
        Test.multiply(5);
        Assertions.assertEquals(5,Test.result());
    }@Test
    public void divTest(){
        Test.add(10);
        Test.divide(2);
        Assertions.assertEquals(5,Test.result());
    }
}
