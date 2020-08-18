package Socket;

/**
 * @文件名 Socket
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/18 - 10:30 下午
 * @修改人和其它信息
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("启动服务器....");

            Socket s = ss.accept();

            System.out.println("客户端:"+s.getInetAddress().getLocalHost()+"已连接到服务器!!!");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            //读取客户端发送来的消息
            String mess = br.readLine();
            System.out.println("客户端："+mess);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(mess+"\n");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}