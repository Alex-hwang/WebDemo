package Demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiverDemo1 {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        //要注意绑定的端口号要和发送端的端口号一致
        DatagramSocket ds = new DatagramSocket(10000);
        //创建数据包对象
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
        //接收数据包
        ds.receive(dp);
        //解析数据包
        byte[] bytes = dp.getData();
        int len = dp.getLength();
        int port = dp.getPort();
        String address = dp.getAddress().getHostAddress();
        String str = new String(bytes, 0, len);
        System.out.println("数据是：" + str + "，来自于：" + address + "，端口号是：" + port);
        //关闭资源
        ds.close();
    }
}
