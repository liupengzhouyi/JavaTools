package encrypt.fileIO.createFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @文件名 encrypt.fileIO.createFolder
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/14 - 11:28 下午
 * @修改人和其它信息
 */
public class CreateFolder {

    public void createFolder(String path, String folderName) throws IOException {
        StringBuffer fileBuf =new StringBuffer();
        String filePar = path + "/" + folderName;// 文件夹路径
        File myPath = new File( filePar );
        if ( !myPath.exists()){
            //若此目录不存在，则创建之
            myPath.mkdir();
            System.out.println("创建文件夹路径为："+ filePar);
        }
    }

    public static void main(String[] args) throws IOException {
        CreateFolder createFolder = new CreateFolder();
        createFolder.createFolder("src/encrypt/userInformation", "123");
    }

}
