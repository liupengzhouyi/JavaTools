package encrypt.savePassword;

import encrypt.fileIO.FileInput.FileInput;
import encrypt.fileIO.createFile.CreateFile;
import encrypt.fileIO.createFolder.CreateFolder;
import encrypt.fileIO.getAllFolder.GetAllFolder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @文件名 encrypt.savePassword
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/16 - 11:10 下午
 * @修改人和其它信息
 */
public class index {

    public static void main(String[] args) throws IOException {

        String passwordName = "LinkedIn";
        String passwordInformation = "刘鹏的 LinkedIn 账户与密码";
        String userID = "liupeng.0@outlook.com";
        String IDPassword = "123456";

        String path = "src/encrypt/userInformation";


        // 获取所有的文件夹名称
        boolean sameFolderKey = false;
        GetAllFolder getAllFolder = new GetAllFolder();
        ArrayList<File> fileList = getAllFolder.getFolders(path);
        for (File file : fileList) {
            System.out.println(passwordName + ": " + file.getName());
            if(passwordName.equals(file.getName())) {
                sameFolderKey = true;
            }
        }

        if(sameFolderKey) {
            System.out.println("有相同的密码，请修改你的密码名称");
        } else {
            System.out.println("密码名称名称具有唯一性，正在初始化文件");
            // 创建密码文件夹
            System.out.println("创建密码文件夹...");
            CreateFolder createFolder = new CreateFolder();
            createFolder.createFolder(path, passwordName);
            System.out.println("创建密码文件夹完成✅");

            // 创建密码描述文件
            System.out.println("创建密码描述文件...");
            CreateFile createFile = new CreateFile();
            createFile.createFile("src/encrypt/userInformation/" + passwordName, "passwordInformation.txt");
            System.out.println("创建密码描述文件完成✅");

            // 写入密码描述文件
            System.out.println("正在写入密码描述文件...");
            String passwordInformationPath = path + "/" + passwordName + "/" + "passwordInformation.txt";
            FileInput fileInput = new FileInput();
            String information = passwordInformation;
            fileInput.Input(passwordInformationPath, information);
            System.out.println("写入密码描述文件完成✅");

            // 创建账户文件
            System.out.println("正在创建账户文件...");
            String passwordIdFilePath = path + "/" + passwordName;
            String passwordIdFileName = passwordName + "ID.txt";
            createFile.createFile(passwordIdFilePath, passwordIdFileName);
            System.out.println("创建账户文件完成✅");


            // 写入账户信息
            System.out.println("正在写入账户信息...");
            String passwordIDInformationPath = passwordIdFilePath + "/" + passwordIdFileName;
            fileInput.Input(passwordIDInformationPath, userID);
            System.out.println("写入账户信息完成✅");


        }









    }
}
