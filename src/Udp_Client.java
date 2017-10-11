import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;




public class Udp_Client extends Thread
{

    int numb=10;
    String ip_address;
    byte [] data;
    int udp_port;
    InetAddress addr;
    DatagramSocket ds;


   public Udp_Client()

   {
       ip_address=Control_Panel.jTextField2.getText().trim();
       udp_port=Integer.parseInt(Control_Panel.jTextField1.getText());

        try
        {
            ds = new DatagramSocket();
            addr = InetAddress.getByName(ip_address);
            // System.out.println(addr);
        }
        catch (Exception e)
        {
            System.out.println(e);

            Control_Panel.jTextArea1.append("Cannot create UDP client\r\n");
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




        while (true)
        {

            switch (Control_Panel.direction)
            {

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
                    numb=0;
                    break;
                default:
                    numb=10;
            }


            String s = "" + numb;
            data = s.getBytes();





            if(numb!=10) {
                DatagramPacket pack = new DatagramPacket(data, data.length, addr, udp_port);
                try {
                    ds.send(pack);
                    // System.out.println(s);

                    Control_Panel.jTextArea1.append(s+ "\r\n");

                    Thread.sleep(100);
                    // Control_Panel.direction=50;
                } catch (Exception e) {
                    System.out.println(e);

                    Control_Panel.jTextArea1.append("Cannot send UDP psck\r\n");
                }
                if(numb==0){Control_Panel.direction=0;}//перестаем отправлять нулевые пакеты
            }

        }
    }



}
