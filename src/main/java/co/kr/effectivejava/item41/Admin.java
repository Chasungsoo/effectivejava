package co.kr.effectivejava.item41;

import java.io.*;

public class Admin implements Serializable {



    public void test() throws IOException {
        String file = "fileName";

        FileOutputStream fileStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);
        User user = new User();
        objectOutputStream.writeObject(user);
    }
}
