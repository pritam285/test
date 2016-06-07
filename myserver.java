import java.net.*;

 class myserverclass
{
 public static void main(String arg[]) throws Exception{
 ServerSocket s=new ServerSocket(2020);

 System.out.println("server waiting for connevcrion");
 Socket so=s.accept();

 System.out.println("connection is establised");
 
 }
}