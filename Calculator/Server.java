import java.net.*;
import java.io.*;

public class Server{

private Socket socket = null;
private DataInputStream input  = null;
private ServerSocket server = null;


public double operation(double a, double b ,char op){
    switch(op){
      case '+':
         return a+b;
      case '-':
         return a-b;
      case '*':
         return a*b;
      case '/':
         return a/b;
      default :
         System.out.println("\nInvalid Operation\n");
    }
    return -1;
}

public Server(int port){
    try{
         server = new ServerSocket(port);
         System.out.println("Server Started");
         socket  = server.accept();
         System.out.println("Client accepted");
         input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
         String s = "";
         while(true){
           s = input.readUTF();
           if(!s.equals("exit") && s.length()>4 ){
           String[] str = s.split("\\s+");
           double a = Integer.parseInt(str[0]);
           char o = str[1].charAt(0);
           double b = Integer.parseInt(str[2]);
           double res = operation(a,b,o);
           System.out.printf("Answer : %.0f\n",res);
          }else{
             if(s.length()<5 && !s.equals("exit") ){
                System.out.println("\nPlease follow the format eg. x operator y \n");
             }else{
                break; 
             }
          }
        }


         System.out.println("Closing Connection");
         input.close();
         socket.close();      

    }catch(IOException e){
      System.out.println(e);
   }
}



public static void main(String[] args){
  Server server = new Server(5000);
  
}

}
