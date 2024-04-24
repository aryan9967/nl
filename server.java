
import java.net.ServerSocket;
import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        System.out.println("Waiting for clients");

        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket soc = ss.accept();
            System.out.println("Connection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Server says:" + str);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
