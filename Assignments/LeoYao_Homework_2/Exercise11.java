// https://docs.oracle.com/javase/7/docs/api/java/net/InetAddress.html#getLocalHost()
// https://www.geeksforgeeks.org/java-net-inetaddress-class-in-java/
// https://docs.oracle.com/javase/7/docs/api/java/net/UnknownHostException.html

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exercise11 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getLocalHost();
        String ipaddress = localhost.getHostAddress();
        System.out.println("IP of my system is: " + ipaddress);
    }
}
