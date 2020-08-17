package Thread.RunnableE;

import java.util.ArrayList;

/**
 * @文件名 Thread.RunnableE
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/18 - 12:28 上午
 * @修改人和其它信息
 */
public class test {

    public static void main(String args[]) {
        ArrayList<RunnableDemo> list = new ArrayList<>();
        for (int i=0;i<100;i++) {
            RunnableDemo temp = new RunnableDemo( "Thread-" + i);
            list.add(temp);
        }
        for (RunnableDemo e : list) {
            e.start();
        }
    }
}

class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
