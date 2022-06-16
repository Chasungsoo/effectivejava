package co.kr.effectivejava.item4;

public class Utility {
// 주석 해제시 private 생성자 이므로 Car에서 상속을 못받음
//    private Utility() {
//    }

    public static void stop(Car car) {
        car.setSpeed(0);
    }
}
