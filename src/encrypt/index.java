package encrypt;

import encrypt.fileIO.FileInput.FileInput;
import encrypt.fileIO.FileRead.FileRead;

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
        FileRead fileRead = new FileRead();
        String s = "000";
        s = fileRead.readFile("src/encrypt/userName.txt");
        System.out.println(s);
        writeFile();

        FileInput fileInput = new FileInput();
        fileInput.Input("src/encrypt/userInformation/passwordValue.txt", password);

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

    public static void writeFile() {
        try {
            File writeName = new File("src/encrypt/userName.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write("我会写入文件啦1\r\n"); // \r\n即为换行
                out.write("我会写入文件啦2\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
