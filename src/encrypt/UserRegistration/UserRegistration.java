package encrypt.UserRegistration;

import encrypt.PasswordEncrypt.PasswordEncrypt;

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



    }

}
