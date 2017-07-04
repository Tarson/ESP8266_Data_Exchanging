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
    byte [] data;
    InetAddress addr;
    DatagramSocket ds;

    Udp_Client() {


      //





        try  { ds = new DatagramSocket();

            addr = InetAddress.getByName(Control_Panel.ip_address);





        } catch (Exception e) {

            System.out.println(e);

        }

        start();





    }

    public void run()  {

/*
    keys servo 1  -  37 39
    keys servo 2  -  87  83
    keys servo 3  -  65  68
    keys servo 4   - 38  40


*/




        while (true) {

           //if(Control_Panel.direction!=5){
            int numb =10;
            switch (Control_Panel.direction) {

                case (37):
                    numb=1;
                break;
                case (39):
                    numb=2;
                    break;
                case (38):
                    numb=3;
                    break;
                case (40):
                    numb=4;
                    break;

                case (87):
                    numb=5;
                    break;
                case (83):
                    numb=6;
                    break;
                case (65):
                    numb=7;
                    break;
                case (68):
                    numb=8;
                    break;
                case (50):
                    numb=10;
                    break;

            }




            String s = "" + numb;

            data = s.getBytes();


                DatagramPacket pack = new DatagramPacket(data, data.length, addr, Control_Panel.udp_port);
                try {
                    ds.send(pack);
                    System.out.println(s);
                    Thread.sleep(100);
                    // System.out.println("fffff");
                } catch (Exception e) {

                    System.out.println(e);

                }

         //   }

          //  Control_Panel.direction=5;

        }
    }

}
