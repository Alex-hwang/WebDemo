package Demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(10086);
        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        while (true) {
            ds.receive(dp);
            //解析数据
            byte[] data = dp.getData();
            int len = dp.getLength();
            String hostName = dp.getAddress().getHostName();
            System.out.println("来自" + hostName + "的消息：" + new String(data, 0, len));
        }
    }
}
