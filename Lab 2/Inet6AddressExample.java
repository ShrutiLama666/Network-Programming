import java.net.*;

public class Inet6AddressExample {
    public static void main(String[] args) {
        try {
            // Create an IPv6 address object
            Inet6Address ip = (Inet6Address) Inet6Address.getByName("2001:db8::1");

            // Display hostname and IPv6 address
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IPv6 Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
