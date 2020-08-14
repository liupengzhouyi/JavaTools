package encrypt;

import encrypt.UserRegistration.UserRegistration;
import encrypt.fileIO.FileInput.FileInput;
import encrypt.fileIO.FileRead.FileRead;
import encrypt.userLanding.UserLanding;

import java.io.*;

/**
 * @文件名 encrypt
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/2 - 9:29 下午
 * @修改人和其它信息
 */
public class index {

    public static void main(String[] args) throws IOException {
        String name = "liupeng";
        String password = "123456";
        String userID = "liupeng.0@outlook.com";
        String IDPassword = "123456";
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.Registration(name, password);

        UserLanding userLanding = new UserLanding();
        userLanding.landing(name, password);

    }
}
