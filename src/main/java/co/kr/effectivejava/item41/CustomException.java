package co.kr.effectivejava.item41;

public class CustomException extends Exception {

    @Override
    public String getMessage() {
        return "유저는 관리자 계정을 만들수 없습니다.";
    }
}
