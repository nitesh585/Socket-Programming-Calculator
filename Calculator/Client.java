import java.net.*;
import java.io.*;

public class Client{

private Socket socket = null;
private DataInputStream input  = null;
private DataOutputStream output = null;

public Client(String address, int port){
    try{
         socket = new Socket(address,port);
         System.out.println("Connection established");
         input  = new DataInputStream(System.in);
         output = new DataOutputStream(socket.getOutputStream());
         
         System.out.println("\nEnter binary operation, e,g x operator y ");
         String s ="";
         while(!s.equals("exit")){
            s = input.readLine();
            output.writeUTF(s);
         }

         input.close();
         output.close();
         socket.close();      

    }catch(IOException e){
      System.out.println(e);
   }
 

}



public static void main(String[] args){
  System.out.println("HEllo world");
  Client client = new Client("localhost",5000);

}

}
