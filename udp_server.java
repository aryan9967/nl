package nl;
import java.net.*;
import java.io.*;
public class udp_server {
    public static void main(String []args){
        try {
            DatagramSocket ds = new DatagramSocket(5000);
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);
            String str = new String(dp.getData());
            int num = Integer.parseInt(str.trim());
            int result = num*num;
            InetAddress ip = InetAddress.getLocalHost();
            String res = Integer.toString(result);
            byte[] b1 = res.getBytes();

            DatagramPacket dp1 = new DatagramPacket(b1, b1.length, ip, dp.getPort());
            ds.send(dp1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
