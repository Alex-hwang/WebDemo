package Demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(8888);
        //打包数据
        String str = "hello,udp";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10000;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        //发送数据
        ds.send(dp);
        //关闭资源
        ds.close();
    }
}
