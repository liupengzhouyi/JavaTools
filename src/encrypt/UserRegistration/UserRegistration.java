package encrypt.UserRegistration;

import encrypt.PasswordEncrypt.PasswordEncrypt;
import encrypt.fileIO.FileInput.FileInput;

/**
 * @文件名 encrypt
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/3 - 8:09 下午
 * @修改人和其它信息
 */
public class UserRegistration {

    public void Registration(String userName, String password) {
        PasswordEncrypt passwordEncrypt = new PasswordEncrypt();
        password = passwordEncrypt.PasswordEncrypt(userName, password);
        FileInput fileInput = new FileInput();
        fileInput.Input("src/encrypt/userInformation/userName.txt", userName);
        fileInput.Input("src/encrypt/userInformation/passwordValue.txt", password);


    }

}
