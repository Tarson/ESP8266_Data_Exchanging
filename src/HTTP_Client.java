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
    //public static PrintWriter pw;


    InetAddress iaLocal;

    Http_Client(int port) {

        this.port = port;
        start();


    }

    public void run() {

        try (Socket socket = new Socket(Control_Panel.jTextField2.getText(), port)) {

            PrintWriter  pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            //pw.println("stop");


            pw.println("data");// Greetings with SERVER
            System.out.println("data");







            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Greetings_from_S = br.readLine();
            System.out.println(Greetings_from_S);

            if(Greetings_from_S.equals("ready")) {

                iaLocal = InetAddress.getLocalHost();
                String s = iaLocal.toString();
                String host_addr  = new StringBuilder(s).delete(0,5).toString();
                System.out.println(host_addr);

                pw.println(host_addr);

                new Udp_Client();
                new Udp_recipient();


            }



        } catch (Exception e) {

            System.out.println(e);

        }

    }



}

