import java.util.*;
import java.net.*;
import java.io.*;
public class factorial_server {
    public static void main(String []args){
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Waiting for clients");
            Socket soc = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            System.out.println(str);
            int x = Integer.parseInt(str);
            int fact = factorial_cal(x);
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("the factorial is:" +fact);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    static int factorial_cal(int number){
        int x = 1;
        for(int i = 1; i<=number; i++){
            x = x*i;
        }
        return x;
    }
}
