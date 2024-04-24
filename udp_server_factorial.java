package nl;
import java.net.*;

public class udp_server_factorial {
    public static void main(String []args){
        try{
            System.out.println("the server has started");
            InetAddress ip = InetAddress.getLocalHost();
            DatagramSocket ds = new DatagramSocket(5000);
            byte[] value_received = new byte[1024];
            DatagramPacket dp = new DatagramPacket(value_received, value_received.length);
            ds.receive(dp);
            String str = new String(dp.getData());
            int number = Integer.parseInt(str.trim());
            int factorial = get_factorial(number);

            byte[] fact = Integer.toString(factorial).getBytes();

            DatagramPacket dp1 = new DatagramPacket(fact, fact.length, ip, dp.getPort());
            ds.send(dp1);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    static int get_factorial(int number){
        int fact = 1;
        for(int i = 1; i<=number; i++){
            fact = fact*i;
        }
        return fact;
    }
}
