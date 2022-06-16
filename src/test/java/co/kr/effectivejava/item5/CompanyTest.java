package co.kr.effectivejava.item5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class CompanyTest {

    @Test
    @DisplayName("자원을 직접 명시한 유틸성 클래스(유연하지 못함)")
    public void a() {
        StaticCountryChecker.companyCountry();
    }

    @Test
    @DisplayName("자원을 생성자로 주입하여 다른 결과를 도출하는 유틸성 클래스(유연함)")
    public void b() {
        CountryChecker checker1 = new CountryChecker(new KoreanCompany());
        Assertions.assertThat(checker1.companyCountry()).isEqualTo("KOREA");
        CountryChecker checker2 = new CountryChecker(new USACompany());
        Assertions.assertThat(checker2.companyCountry()).isEqualTo("USA");
    }
}