package encrypt.PasswordEncrypt;

/**
 * @文件名 encrypt
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/3 - 8:15 下午
 * @修改人和其它信息
 */
public class PasswordEncrypt {

    public String PasswordEncrypt(String userName, String password) {
        return (password.hashCode() % 1000) * password.length() + (userName.hashCode() % 560) * userName.length() + "";
    }

}
