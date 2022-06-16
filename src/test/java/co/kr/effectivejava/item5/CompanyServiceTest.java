package co.kr.effectivejava.item5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
class CompanyServiceTest {
    private CompanyService companyService;

    @BeforeEach
    void init() {
        companyService = new CompanyService(new CompanyMemberChecker());
    }
    @Test
    public void checkCompany() {
        //given
        Company aCompany = new BCompany();
        String s = companyService.checkCompanyMember(aCompany);
        //when
        System.out.println(s);
        //then
    }

}