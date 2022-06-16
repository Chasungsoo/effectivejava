package co.kr.effectivejava.item5;

import org.springframework.stereotype.Component;

@Component
public class CompanyMemberChecker {
    public String isCompanyMember(Company company) {
        if(company instanceof ACompany) {
            return "ACompany";
        }

        if(company instanceof BCompany) {
            return "BCompany";
        }
        return "notCompany";
    }
}
