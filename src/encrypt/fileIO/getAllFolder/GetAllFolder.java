package encrypt.fileIO.getAllFolder;

import java.io.File;
import java.util.ArrayList;

/**
 * @文件名 encrypt.fileIO.getAllFolder
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/15 - 3:45 下午
 * @修改人和其它信息
 */
public class GetAllFolder {

    public ArrayList<File> getFolders(String path) {
        File[] allFiles = new File(path).listFiles();
        ArrayList<File> fileList = new ArrayList<>();
        for (File file : allFiles) {
            if (file.isDirectory()) {
                fileList.add(file);
            }
        }
        return fileList;
    }

    public static void main(String[] args) {
        GetAllFolder getAllFolder = new GetAllFolder();
        ArrayList<File> fileList = getAllFolder.getFolders("src/encrypt/userInformation");
        for (File file : fileList) {
            System.out.println(file.getName());
        }
    }
}
