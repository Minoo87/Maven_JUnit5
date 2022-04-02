import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    @DisplayName(" 2 + 1 = 3")

    void addsTwoNumbers(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals (3, calculator.add(2,1),"2 + 1 should be 3");
    }

    @Test
    @DisplayName(" 2 - 1 = 1")

    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1, calculator.subtract(2, 1), "2 - 1 should be 1");
    }
}