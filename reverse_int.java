import java.net.*;
import java.util.*;
import java.io.*;
public class reverse_int {
    public static void main(String []args){
        try{
            System.out.println("the client has started");
            Socket soc = new Socket("localhost", 5000);
//            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int number = sc.nextInt();

//
//            String st = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(number);
            BufferedReader serv_resp = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            System.out.println(serv_resp.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
