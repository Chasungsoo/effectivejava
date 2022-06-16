package co.kr.effectivejava.item5;

import java.util.Objects;

public class CountryChecker {
    private final Company company;

    public CountryChecker(Company company) {
        this.company = Objects.requireNonNull(company);
    }

    public String companyCountry() {
        return company.checkCompany();
    }
}
