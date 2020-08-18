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
import java.io.PrintStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException{

        // 创建本机连接，端口号3000
        Socket socket = new Socket("127.0.0.1", 3000);

        // 该流用于读取服务器发来的数据
        PrintStream ps = new PrintStream(socket.getOutputStream());
        String str = null;

        // 该流用于读取键盘的输入内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 该线程用于从服务器中读入数据
        new Thread(new ClientThread(socket)).start();

        // 从键盘中读取数据
        while((str = reader.readLine()) != null){
            ps.println(str+" (from Client)");
        }

        reader.close();
        socket.close();

    }


}