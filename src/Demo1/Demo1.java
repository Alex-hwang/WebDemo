package Demo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        //获取InetAddress对象
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);
        //获取主机名
        String hostName = byName.getHostName();
        System.out.println(hostName);
        //获取IP地址
        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);

    }
}
