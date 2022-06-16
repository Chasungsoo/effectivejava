package co.kr.effectivejava.item5;

public class StaticCountryChecker {
    private static final Company company = new KoreanCompany();

    private StaticCountryChecker() {}

    public static String companyCountry() {
        return company.checkCompany();
    }
}
