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
    Boolean udp_link = false;
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
                try {Thread.sleep(500);}// мастрячим пробелы на экране пока ждём соединения

                catch(Exception e)
                {}
                if (i==0)
                {i++;}
                else Control_Panel.jTextArea1.append("-");}


            }


        }










    public void run() {








            String  addr = UserP.user.IP_address;

        try (Socket socket = new Socket(addr.trim(), port))// отправляем адрес компа на ESP
        {


            connected = true;

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw.println("stop data");//на всякий случай, вдруг вышли некорректно



            pw.println("host address");// Greetings with SERVER


            Greetings_from_S = br.readLine();
            if (Greetings_from_S.equals("ready"))
            {
            iaLocal = InetAddress.getLocalHost();
            String s = iaLocal.getHostAddress();

            Control_Panel.jTextArea1.append(s + "  \r\n");
            pw.println(s);// отправляем адрес компа на ESP

            Greetings_from_S = br.readLine();
            Control_Panel.jTextArea1.append(Greetings_from_S+"\r\n");

            }

          } catch (Exception e) {
            connected=true;
            Control_Panel.jTextArea1.append(" \r\n");
            Control_Panel.jTextArea1.append("Cannot find host\r\n");
            System.out.println(e);

          }




         try (Socket socket = new Socket(addr.trim(), port))// говорим, что будет сеанс обмена данными
         {


            connected = true;

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));



            pw.println("data");// Greetings with SERVER
            Control_Panel.jTextArea1.append("data \r\n");

            Greetings_from_S = br.readLine();
            if (Greetings_from_S.equals("ready"))
            {
                if(udp_link)// проверяем на ранее запущенные udp
                {
                    new Udp_Client();
                    new Udp_recipient();
                    udp_link = true;
                }
            }

        } catch (Exception e) {
            connected=true;
            Control_Panel.jTextArea1.append(" \r\n");
            Control_Panel.jTextArea1.append("Cannot find host\r\n");
            System.out.println(e);

        }

















    }



}

