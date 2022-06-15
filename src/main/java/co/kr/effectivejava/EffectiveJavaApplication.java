package co.kr.effectivejava;

import co.kr.effectivejava.item41.Admin;
import co.kr.effectivejava.item41.Creatable;
import co.kr.effectivejava.item41.CustomException;
import co.kr.effectivejava.item41.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws CustomException, IOException {
        SpringApplication.run(EffectiveJavaApplication.class, args);

//        Admin admin = new Admin();
//        User user = new User();
//
//        EffectiveJavaApplication.adminCreate(admin);
//
//        EffectiveJavaApplication.adminCreate(user);

    }

    public static void adminCreate(Object o) throws CustomException {
        if (!(o instanceof Creatable)) {
            System.out.println("you cannot use :" + o.getClass().getName() + "   while travelling");
            throw new CustomException();
        }

        System.out.println("you can use :" + o.getClass().getName() + "   while travelling");
    }

}
