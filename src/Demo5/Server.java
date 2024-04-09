package Demo5;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建对象
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started");
        //等待客户端连接
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");
        //从连接通道哦中获取输入流
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int b;
        //循环读取
        while ((b = inputStreamReader.read()) != -1) {
            System.out.print((char) b);
        }
        //关闭连接
        serverSocket.close();

    }
}
