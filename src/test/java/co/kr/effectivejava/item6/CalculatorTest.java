package co.kr.effectivejava.item6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class CalculatorTest {
    int value1 = 3;
    int value2 = 5;

    @Test
    @DisplayName("객체를 계속해서 생성하여 사용")
    public void a() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Calculator calculator = new Calculator();
            calculator.plus(value1, value2);
        }
    }

    @Test
    @DisplayName("팩토리 메서드 패턴 사용")
    public void b() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Calculator.plus(value1, value2);
        }
    }

}