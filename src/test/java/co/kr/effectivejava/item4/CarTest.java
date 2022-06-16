package co.kr.effectivejava.item4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class CarTest {

    @Test
    @DisplayName("스태틱 메서드 사용의 좋은 예")
    void a() {
        Car car = new Car();
        Utility.stop(car); //이렇게 사용하면 Utility 인스턴스를 매번 생성하지 않아도됨
    }

    @Test
    @DisplayName("스태틱 메서드 사용의 나쁜 예, + private 기본생성자로 인스턴스 생성 방지")
    void b() {
        Car car = new Car();
        Utility utility = new Utility(); // 기본생성자를 public 으로 생성시 실수로 인스턴스를 계속 생성하는 비용을 예방? 할수없음
        utility.stop(car);
    }
}