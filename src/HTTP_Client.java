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


    InetAddress iaLocal;

    Http_Client(int port) {

        this.port = port;
        start();


    }

    public void run() {

        try (Socket socket = new Socket("192.168.1.200", port)) {

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            pw.println("data");// Greetings with SERVER
            System.out.println("data");


            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Greetings_from_S = br.readLine();
            System.out.println(Greetings_from_S);

            if(Greetings_from_S.equals("ready")) {


                iaLocal = InetAddress.getLocalHost();
                System.out.println(iaLocal.toString());
                pw.println(iaLocal.toString());

            }



        } catch (Exception e) {

            System.out.println(e);

        }

    }



}

