package Socket.dome;

/**
 * @文件名 Socket.dome
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/18 - 11:13 下午
 * @修改人和其它信息
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException{

        ServerSocket ss = new ServerSocket(3000);

        // 该缓冲流用于从客户端读入数据
        BufferedReader read = null;

        String str = null;
        while(true){
            // 服务器收到客户端的Socket请求时，服务端也创建一个Socket，如何没有客户端请求，该方法一直处于阻塞状态
            Socket s = ss.accept();
            read  = new BufferedReader(new InputStreamReader(s.getInputStream()));

            // 该线程用于从键盘读取数据，并将数据写入Socket的输出流中
            new Thread(new ServerThread(s)).start();

            while((str = read.readLine())!=null){
                System.out.println(str);
            }

        }

    }

}
