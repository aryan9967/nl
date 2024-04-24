import java.util.*;
import java.net.*;
import java.io.*;

public class reverse_intserver {
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Waiting for clients");
            Socket soc = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String st = in.readLine();
            int number = Integer.parseInt(st);
            System.out.println(number);
            int reverse_number = reverse_int(number);
            System.out.println(reverse_number);
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Server : " + reverse_number);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    static int reverse_int(int number){
        int reverse_number = 0;
        while(number > 0){
            int digit = number % 10;
            reverse_number = reverse_number*10 + digit;
            number = number/10;
        }
        return reverse_number;
    }
}
