package Demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Demo3RRR {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(12345);
        InetAddress ia = InetAddress.getByName("224.0.0.2");
        ms.joinGroup(ia);

        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        ms.receive(dp);
        byte[] data = dp.getData();
        int len = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String host = dp.getAddress().getHostName();
        System.out.println("IP地址：" + ip + "，主机名：" + host + "，数据：" + new String(data, 0, len));
        ms.close();
    }
}
