/**
 * Created by m on 27.06.2017.
 */
public class ESP8266_Data_Exchanging {public static void main (String [] args)
{


    java.awt.EventQueue.invokeLater(new Runnable()
    {
        public void run() {
            Control_Panel panel  = new Control_Panel();
                   panel.setVisible(true);
        }
    });

    new Http_Client(4000);

}
}
