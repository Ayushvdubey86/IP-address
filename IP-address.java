package clientserver;
import java.io.*;  
import java.net.*;  
class Ip
{  
   public static void main()
   {  
    try{  
          InetAddress ip=InetAddress.getByName("www.facebook.com");  
          System.out.println("Host Name: "+ip.getHostName());  
          System.out.println("IP Address: "+ip.getHostAddress());  
       }catch(Exception e){System.out.println(e);}  
   }  
}  
