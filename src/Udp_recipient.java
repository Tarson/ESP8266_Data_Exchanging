import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.stream.Stream;


public class Udp_recipient extends Thread {
    DatagramSocket ds;
    DatagramPacket packet;
    Udp_recipient() {

       // System.out.println("GO");
    start();

    try {ds = new DatagramSocket(5000);
        packet = new DatagramPacket(new byte[1], 1);

    }
        catch (Exception e) {

            System.out.println(e);

        }

    }
    public void run() {
        while (true) {
            try {


                ds.receive(packet);
                System.out.println(new String(packet.getData()));

            } catch (Exception e) {

                System.out.println(e);

            }

        }
    }


}
