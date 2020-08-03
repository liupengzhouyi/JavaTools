package encrypt.fileIO;

import java.io.*;

/**
 * @文件名 encrypt.fileIO
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/3 - 8:23 下午
 * @修改人和其它信息
 */
public class FileInput {

    public void Input(String path, String information) {
        File f = new File(path);
        FileOutputStream fop = null;
        try {
            fop = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = null;
        try {
            writer = new OutputStreamWriter(fop, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        try {
            writer.append("中文输入");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 写入到缓冲区

        try {
            writer.append("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 换行

        try {
            writer.append("English");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        try {
            fop.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 关闭输出流,释放系统资源

        FileInputStream fip = null;
        try {
            fip = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 构建FileInputStream对象

        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(fip, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (true) {
            try {
                if (!reader.ready()) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                sb.append((char) reader.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 关闭读取流

        try {
            fip.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 关闭输入流,释放系统资源
    }


}
