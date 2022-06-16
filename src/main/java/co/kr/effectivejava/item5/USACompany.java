package co.kr.effectivejava.item5;

public class USACompany extends Company {
    private final String country = "USA";

    @Override
    String checkCompany() {
        return this.country;
    }
}
