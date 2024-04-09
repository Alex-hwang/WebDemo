package Demo5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        if (socket.isConnected()) {
            System.out.println("Connected to server");
        } else {
            System.out.println("Failed to connect to server");
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello from client!你好世界！".getBytes());
        outputStream.close();
        socket.close();
    }
}
