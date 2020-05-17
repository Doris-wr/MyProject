package UDP;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        //新建一个DatagramSocket
        DatagramSocket udpServerSocket=new DatagramSocket(9897);
        byte[] receiveBuffer=new byte[1024];//存放收到的消息
        DatagramPacket receivePacket=new DatagramPacket(receiveBuffer,receiveBuffer.length);
        //等着客户端类撩
        udpServerSocket.receive(receivePacket);
        InetAddress clientAddreess=receivePacket.getAddress();
        System.out.printf("我从%s:%d 收到了消息%n",
                clientAddreess.getAddress(),//取到它的ipv4地址
                receivePacket.getPort());
        System.out.println("我一共收到了%d字节的数据%n，recerivePacket.getLength");
        String message =new String(
                receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
        System.out.println(message);

        udpServerSocket.close();
    }
}
