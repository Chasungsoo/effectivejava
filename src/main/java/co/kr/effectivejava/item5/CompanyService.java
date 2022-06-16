package co.kr.effectivejava.item5;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyMemberChecker companyMemberChecker;
    public String checkCompanyMember(Company company) {
        return companyMemberChecker.isCompanyMember(company);
    }
}
