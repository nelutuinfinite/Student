package ro.ulbs.proiectaresoftware.student.lab6;
import org.junit.jupiter.api.*;

public class ACalculatorTest {
    private ACalculator Test;
    @Test
    public void TestClear(){
        Test.clear();
        Assertions.assertNull(Test);
    }
    @Test
    public void rezultatTest(){
        Assertions.assertEquals(Test,Test.result());
    }


}
