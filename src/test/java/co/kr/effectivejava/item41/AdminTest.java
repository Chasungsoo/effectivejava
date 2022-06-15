package co.kr.effectivejava.item41;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.assertThrows;


@ExtendWith(SpringExtension.class)
class AdminTest {
    User user;
    Admin admin;
    FileOutputStream fileStream;
    ObjectOutputStream objectOutputStream;
    String file;

    @BeforeEach
    void init() throws IOException {
        user = new User();
        admin = new Admin();
        file = "fileName";
        fileStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(fileStream);
    }
    @Test
    @DisplayName("Serializable 마크 인터페이스 사용")
    public void useMarkInterface() throws IOException {
        objectOutputStream.writeObject(admin);
    }

    @Test
    @DisplayName("Serializable 마크 인터페이스 미사용")
    public void unUseMarkInterface() {
        assertThrows(NotSerializableException.class, () -> objectOutputStream.writeObject(user));
    }

    @Test
    @DisplayName("User -> Admin 계정생성 X")
    public void createAdminByUser(){
        assertThrows(CustomException.class, () -> adminCreate(user));
    }

    @Test
    @DisplayName("Admin -> Admin 계정생성 O")
    public void createAdminByAdmin() throws CustomException {
        adminCreate(admin);
    }

    private static void adminCreate(Object o) throws CustomException {
        if (!(o instanceof Creatable)) {
            throw new CustomException();
        }
        System.out.println("관리자 계정 생성!");
    }

}