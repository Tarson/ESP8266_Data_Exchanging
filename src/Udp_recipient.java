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


    start();




    try {ds = new DatagramSocket(50000);
        packet = new DatagramPacket(new byte[1], 1);


    }
        catch (Exception e) {


            Control_Panel.jTextArea2.append("Cannot create incoming\r\n");
            Control_Panel.jTextArea2.append("UDP connection\r\n");


        }

    }
    public void run() {
        while (true) {
            try {


                ds.receive(packet);
                int t = packet.getData()[0];
                Control_Panel.jTextArea2.append("пришло       "+t+ " \r\n");


            } catch (Exception e) {

                Control_Panel.jTextArea2.append("no incoming packs"+ " \r\n");



            }

        }
    }


}
