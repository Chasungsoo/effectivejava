package co.kr.effectivejava.item34;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Set;

import static co.kr.effectivejava.item34.AppleEnum.FUJI;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class FruitTest {

    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_SMITH = 2;
    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;


    @Test
    @DisplayName("상수명 출력 = 객체형")
    void a() {
        System.out.println("어떤식으로 출력될까? = " + AppleEnum.FUJI);
    }

    @Test
    @DisplayName("상수명 출력 = ToString custom")
    void b() {
        //given
        OrangeEnum blood = OrangeEnum.BLOOD;
        //then
        System.out.println(blood);
    }

    @Test
    @DisplayName("전략 열거 타입")
    void c() {
        //given
        int week = PayrollDay.FRIDAY.pay(30, 5);
        int weekend = PayrollDay.SUNDAY.pay(30, 5);
        //when
        //then
        System.out.println(week);
        System.out.println(weekend);
    }

    @Test
    @DisplayName("정수형 열거타입 타입구분 X")
    void d() {
        callAppleInfo(APPLE_FUJI);
        callAppleInfo(ORANGE_BLOOD);
    }

    @Test
    @DisplayName("Enum 타입 타입구분 O")
    void e() {
        callAppleEnumInfo(FUJI);
//        callAppleEnumInfo(OrangeEnum.BLOOD);
    }

    private int callAppleInfo(int appleValue) {
        return appleValue;
    }
    private int callAppleEnumInfo(AppleEnum appleEnum) {
        return appleEnum.getNumber();
    }

}