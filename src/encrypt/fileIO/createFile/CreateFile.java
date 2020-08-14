package encrypt.fileIO.createFile;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @文件名 encrypt.fileIO.createFile
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/14 - 11:38 下午
 * @修改人和其它信息
 */
public class CreateFile {

    public void createFile(String path, String name) throws IOException {
        // 文件夹路径存在的情况下
        try {
            FileWriter fw = new FileWriter(path + "/" + name,true);
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        CreateFile createFile = new CreateFile();
        createFile.createFile("src/encrypt/userInformation/123", "name.txt");
    }


}
