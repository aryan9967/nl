import java.util.*;
import java.net.*;
import java.io.*;

public class pallindrome_client {
    public static void main(String []args){
        try{
            System.out.println("Client is started");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String st = sc.nextLine();
            Socket soc = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println();
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
