package nl;
import java.net.*;

public class udp_client {
    public static void main(String []args){
        try{
            DatagramSocket ds = new DatagramSocket();
            int i = 8;
            InetAddress ip = InetAddress.getLocalHost();
            String st = Integer.toString(i);
            byte[] b = st.getBytes();
            DatagramPacket dp = new DatagramPacket(b, b.length, ip, 5000);
            ds.send(dp);

            byte[] b1 = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
            ds.receive(dp1);

            String str = new String(dp1.getData());
            System.out.println("Server says: " + str.trim());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
