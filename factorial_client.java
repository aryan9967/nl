import java.net.*;
import java.util.*;
import java.io.*;

public class factorial_client {
    public static void main(String []args){
        try{
            Socket soc = new Socket("localhost", 5000);
            System.out.println("Enter a number");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(number);
            BufferedReader in= new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
