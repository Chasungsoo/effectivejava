package co.kr.effectivejava.item5;

public class KoreanCompany extends Company {
    private final String country = "KOREA";

    @Override
    String checkCompany() {
        return this.country;
    }
}
