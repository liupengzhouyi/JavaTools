package encrypt.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @文件名 encrypt.fileIO
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/3 - 8:46 下午
 * @修改人和其它信息
 */
public class FileRead {
    public String readFile(String path) throws IOException {
        String informtion = "";
        try {
            String str;
            BufferedReader in = new BufferedReader(new FileReader(path));
            while ((str = in.readLine()) != null) {
                informtion = informtion + str + "/n";
                // System.out.println(str);
            }
            // System.out.println(str);
            informtion = informtion + str + "/n";
        } catch (IOException e) {
        }
        return informtion;
    }

}
