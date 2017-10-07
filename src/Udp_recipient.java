import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.stream.Stream;


public class Udp_recipient extends Thread {

    int udp_port;
    InetAddress addr;
    String ip_address;

    DatagramSocket ds;
    DatagramPacket packet;
    Udp_recipient() {

       // System.out.println("GO");
    start();

        ip_address=Control_Panel.jTextField2.getText();
        udp_port=Integer.parseInt(Control_Panel.jTextField1.getText());

        byte[] s = new byte[1];
    try {ds = new DatagramSocket(5001);
        packet = new DatagramPacket(new byte[1], 1);


    }
        catch (Exception e) {

            System.out.println("ttt");

            System.out.println(e);

        }

    }
    public void run() {
        while (true) {
            try {


                ds.receive(packet);
                int t = packet.getData()[0];

                System.out.println("пришло"+t);

            } catch (Exception e) {

                System.out.println("yeee");

            }

        }
    }


}
