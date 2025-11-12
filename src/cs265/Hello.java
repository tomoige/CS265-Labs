package cs265;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Demonstration Java program: print “Hello”
 * @author put your name here
 */
public class Hello {
   public static void main( String args[] )
   {
	   InetAddress ip;
       String hostname;
       try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("My current IP Address is : " + ip);
            System.out.println("My current Hostname is : " + hostname);
       } catch (UnknownHostException e) {
    	     e.printStackTrace();
       }    
   }
   
}