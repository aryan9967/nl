import java.net.*;
import java.io.*;
import java.util.*;

public class pallindrome_server {
    public static void main(String []args){
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Waiting for connection");
            Socket soc = ss.accept();
            System.out.println("Connection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String st = in.readLine();
            System.out.println(st);
            int flag = pallindrome_check(st);
            System.out.println(flag);
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            if(flag == 0){
                out.println("server: Not a pallindrome");
            }
            else{
                out.println("server: It is a pallindrome");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    static int pallindrome_check(String word){
        int flag  = 1;
        for(int i = 0; i< word.length(); i++){
            if(word.charAt(word.length() - 1 - i) != word.charAt(i)){
                flag = 0;
                break;
            }
        }
        return flag;
    }
}
