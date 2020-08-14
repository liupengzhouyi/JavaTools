package encrypt.userLanding;

import encrypt.PasswordEncrypt.PasswordEncrypt;
import encrypt.fileIO.FileRead.FileRead;

import java.io.IOException;

/**
 * @文件名 encrypt.userLanding
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/3 - 9:22 下午
 * @修改人和其它信息
 */
public class UserLanding {

    public int landing(String userName, String password) throws IOException {
        int key = 0;
        // 查找用户
        String path = "src/encrypt/userInformation/userName.txt";
        FileRead fileRead = new FileRead();
        userName = userName;
        String userNameInformation = fileRead.readFile(path);
        userNameInformation = userNameInformation.substring(0, userNameInformation.length() - 1);
        // 验证用户
        if (userName.equals(userNameInformation)) {
            System.out.println("用户存在");
            // 计算密码
            PasswordEncrypt passwordEncrypt = new PasswordEncrypt();
            password = passwordEncrypt.PasswordEncrypt(userName, password);
            // 读取密码
            path = "src/encrypt/userInformation/passwordValue.txt";
            String passwordInformation = fileRead.readFile(path);
            passwordInformation = passwordInformation.substring(0, passwordInformation.length() - 1);
            if (password.equals(passwordInformation)) {
                System.out.println("登陆成功");
                key = 1;
            } else {
                System.out.println("密码错误");
                System.out.println(password.length());
                System.out.println(passwordInformation.length());
                System.out.println(password + " : " + passwordInformation);
                key = -1;
            }
        } else {
            System.out.println("用户不存在");
            System.out.println(userName.length());
            System.out.println(userNameInformation.length());
            System.out.println(userName + " : " + userNameInformation);
            key = 0;
        }
        return key;
    }


}
