package Socket.dome;

/**
 * @文件名 Socket.dome
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/18 - 11:15 下午
 * @修改人和其它信息
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 该线程用于从服务器中读入数据
 * @author 王维
 *
 */
public class ClientThread implements Runnable{

    Socket s;
    BufferedReader read;

    public ClientThread(Socket s){
        this.s = s;
        try {
            // 从服务器中读取内容
            read = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    @Override
    public void run() {

        String str = null;
        try {
            while((str = read.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}