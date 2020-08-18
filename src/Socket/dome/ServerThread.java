package Socket.dome;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @文件名 Socket.dome
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/18 - 11:14 下午
 * @修改人和其它信息
 */



public class ServerThread implements Runnable {

    Socket s;

    // 用于将数据写入Socket中的输出流
    PrintStream ps;

    // 从键盘中读取输入的内容
    BufferedReader reader;

    public ServerThread(Socket s){
        this.s = s;
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        String str = null;
        try {
            ps = new PrintStream(s.getOutputStream());

            while((str = reader.readLine()) != null){
                ps.println(str+" (from Server)");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}