package co.kr.effectivejava.item34;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class OperationTest {

    @Test
    @DisplayName("열거타입 추상메서드 활용")
    public void a() {
        Arrays.stream(OperationEnum.values()).forEach(op ->
            System.out.println(
                op.name() + " = " + op.apply(AppleEnum.GRANNY_SMITH.getNumber(), AppleEnum.PIPPIN.getNumber())
            )
        );
    }
}