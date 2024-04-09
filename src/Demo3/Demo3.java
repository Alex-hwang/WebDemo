package Demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        //创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket();
        //创建DataGramPacket对象
        String str = "你好，我是组播";
        //将字符串转换为字节数组
        byte[] buf = str.getBytes();
        //创建InetAddress对象
        InetAddress ia = InetAddress.getByName("127.0.0.1");
        int port = 12345;
        //创建DatagramPacket对象
        DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, port);
        //发送数据
        ms.send(dp);
        ms.close();
    }
}
