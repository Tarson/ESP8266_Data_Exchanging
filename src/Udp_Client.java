import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;




public class Udp_Client extends Thread {
    int port;
    String host;
    String s;
    String Greetings_from_S;
    byte [] data = new byte[1];
    InetAddress addr;
    DatagramSocket ds;

    Udp_Client() {


      //





        try  { ds = new DatagramSocket();

            addr = InetAddress.getByName("192.168.1.138");





        } catch (Exception e) {

            System.out.println(e);

        }

        start();





    }

    public void run()  {






        while (true) {
            data[0] = (byte) Control_Panel.direction;
            DatagramPacket pack = new DatagramPacket(data, 1, addr, 5000);
            try {
                ds.send(pack);
             //   System.out.println(Control_Panel.direction);
              //  System.out.println("fffff");
            } catch (Exception e) {

                System.out.println(e);

            }


        }
    }

}
