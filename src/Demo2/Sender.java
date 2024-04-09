package Demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //打包数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String str = sc.nextLine();
            if ("quit".equals(str)) {
                break;
            }
            byte[] bytes = str.getBytes();
            //发送数据
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            //创建数据包对象
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
            //发送数据包
            ds.send(dp);
        }
        //关闭资源
        ds.close();
    }
}
