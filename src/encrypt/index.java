package encrypt;

import encrypt.fileIO.FileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
        FileRead fileRead = new FileRead();
        String s = "000";
        s = readFile("/Users/liupeng/IdeaProjects/JavaTools/src/encrypt/userName.txt");
        System.out.println(s);


    }

    public static String readFile(String pathname) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathname));
        String line;
        //网友推荐更加简洁的写法
        while ((line = br.readLine()) != null) {
            // 一次读入一行数据
            System.out.println(line);
        }
        return line;
    }
}
