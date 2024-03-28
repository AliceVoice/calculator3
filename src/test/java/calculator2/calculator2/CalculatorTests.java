import calculator2.calculator2.CalculatorController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTests {

    @Autowired
    private CalculatorController controller;

    @Test
    public void testWelcome() {
        String result = controller.welcome();
        assertEquals("Добро пожаловать в калькулятор", result);
    }

    @Test
    public void testPlus() {
        String result = controller.plus(1, 2);
        assertEquals("1 + 2 = 3", result);
    }

    @Test
    public void testMinus() {
        String result = controller.minus(5, 3);
        assertEquals("5 - 3 = 2", result);
    }

    @Test
    public void testMultiply() {
        String result = controller.multiply(4, 5);
        assertEquals("4 * 5 = 20", result);
    }

    @Test
    public void testDivide() {
        String result = controller.divide(10, 2);
        assertEquals("10 / 2 = 5", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        controller.divide(1, 0); // Указано значение 0 для проверки исключения
    }
}