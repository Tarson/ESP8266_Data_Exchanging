import sun.nio.ch.Net;

import java.io.*;
import java.net.Socket;
import java.net.InetAddress;
/**
 * Created by User on 27.07.2017.
 */
class Http_Client extends Thread {
    int port;
    String s;
    String Greetings_from_S;
    Boolean connected = false;
    //public static PrintWriter pw;


    InetAddress iaLocal;

    Http_Client(int port) {

        new MakingDots();
        this.port = port;
        start();


    }


    class MakingDots extends Thread{

        MakingDots()
        {start();}

        public void run ()
        {

            int i =0;
            while (!connected)

            {
                try {Thread.sleep(500);}

                catch(Exception e)
                {}
                if (i==0)
                {i++;}
                else Control_Panel.jTextArea1.append(".");}


            }


        }










    public void run() {





          //  System.out.println(Control_Panel.jTextField2.getText());


            String  addr = UserP.user.IP_address;

        try (Socket socket = new Socket(addr.trim(), port)) {


            connected = true;

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw.println("stop data");
            //  pw.println("stop"); // для совместимости с первой версией


            pw.println("data");// Greetings with SERVER
            Control_Panel.jTextArea1.append("data \r\n");

            Greetings_from_S = br.readLine();
            if (Greetings_from_S.equals("ready"))
            {
            iaLocal = InetAddress.getLocalHost();
            String s = iaLocal.toString();
            String host_addr = new StringBuilder(s).delete(0, 5).toString();

            Control_Panel.jTextArea1.append(" " + host_addr + "  \r\n");
            pw.println(host_addr);


















              new Udp_Client();
              new Udp_recipient();


            }



        } catch (Exception e) {
            connected=true;
            Control_Panel.jTextArea1.append(" \r\n");
            Control_Panel.jTextArea1.append("Cannot find host\r\n");
            System.out.println(e);

        }

    }



}

