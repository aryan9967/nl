import java.net.Socket;
import java.io.*;

public class client {
    public static void main(String []args){
        try{
            System.out.println("client started");
            Socket soc = new Socket("localhost", 5000);
            BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string:");
            String str  = userinput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
