import java.io.*;
import java.net.Socket;




public class Udp_Client extends Thread {
    int port;
    String s;
    String Greetings_from_S;


    Udp_Client(int port) {

        this.port = port;
        start();


    }

    public void run() {

        try (Socket socket = new Socket("192.168.1.200", port)) {

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            pw.println("program");// Greetings with SERVER
            System.out.println("program");


            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Greetings_from_S = br.readLine();
            System.out.println(Greetings_from_S);


            if (Greetings_from_S.equals("ready")) {

                try

                {
//BlinkOUT.bin
                    File file = new File("d:BlinkOUT.bin");
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));


                    byte[] data = new byte[bis.available()];
                    bis.read(data);


                    byte[] data_buffer = new byte[1024];


                    int frames = data.length / 1024;
                    System.out.println(frames);
                    int residy = data.length % 1024;


                    for (int i = 0; i < frames; i++) {
                        for (int k = 0; k < (1024); k++) {
                            data_buffer[k] = data[k + 1024 * (i)];
                        }


                    }
                    byte[] data_buffer2 = new byte[residy];
                    for (int i = 0; i < residy; i++) {

                        data_buffer2[i] = data[i + 1024 * (frames)];
                    }


                    pw.println("stop program");//
                    System.out.println("stop program");





                } catch (Exception e) {

                    System.out.println(e);

                }


            }


        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
