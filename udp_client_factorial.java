package nl;
import java.net.*;
import java.util.*;
public class udp_client_factorial {
    public static void main(String []args){
        try{
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Client has started");
            DatagramSocket ds = new DatagramSocket();
            System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            byte[] b = String.valueOf(number).getBytes();
            DatagramPacket dp = new DatagramPacket(b, b.length, ip, 5000);
            ds.send(dp);

            byte[] response = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(response, response.length);
            ds.receive(dp1);
            String str = new String(dp1.getData());
            System.out.println(str.trim());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
