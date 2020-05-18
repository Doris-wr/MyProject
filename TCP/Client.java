package TCP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Socket tcpClientSocket = new Socket();
        byte[] ipv4 = {127, 0, 0, 1};
        InetAddress serverAddress = InetAddress.getByAddress(ipv4);
        SocketAddress serverSocketAddress
                = new InetSocketAddress(serverAddress, 7070);
        tcpClientSocket.connect(serverSocketAddress);

        while (true) {
            System.out.print("请输出> ");
            String request = scanner.nextLine();
            // 通过字节流直接写入请求
            OutputStream os = tcpClientSocket.getOutputStream();
            PrintStream out = new PrintStream(os, true, "UTF-8");
            out.println(request);

            // 通过字节流，直接读取数据
            InputStream is = tcpClientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is, "UTF-8")
            );
            String response = reader.readLine();
            System.out.println(response);
        }
    }
}