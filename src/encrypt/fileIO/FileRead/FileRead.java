package encrypt.fileIO.FileRead;

import java.io.*;

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
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        //网友推荐更加简洁的写法
        while ((line = br.readLine()) != null) {
            // 一次读入一行数据
            informtion = informtion + line + "\n";
        }
        return informtion;
    }

    public static void main(String[] args) throws IOException {
        String path = "src/encrypt/userInformation/userName.txt";
        FileRead fileRead = new FileRead();
        String information = fileRead.readFile(path);
        System.out.println(information);
    }
}




