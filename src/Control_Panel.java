import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

/**
 * Created by m on 24.06.2017.
 */
public class Control_Panel extends JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;




    public static int direction=10;
    public static String ip_address="192.168.1.30";
    public static int udp_port=5000;
    static  Control_Panel cp;

    Control_Panel() {

        super("ESP8266");
        //System.out.println("iiii");

        cp = this;


        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("W: вперёд");
        jButton1.setActionCommand("W");
        jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                direction =87;
               // System.out.println(direction);
                reqFocus(true);
            }
        });


        jButton2.setText("S: назад");
        jButton2.setActionCommand("S");
        jButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                direction =83;
             //   System.out.println(direction);
                reqFocus(true);
            }
        });


        jButton3.setText("A: вверх ");
        jButton3.setActionCommand("A");
        jButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                direction =65;
              //  System.out.println(direction);
                reqFocus(true);
            }
        });



        jButton4.setText("D: вниз  ");
        jButton4.setActionCommand("D");
        jButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                direction =68;
                //System.out.println(direction);
                reqFocus(true);
            }
        });



        jButton5.setText("<: влево ");
        jButton5.setActionCommand("<");
        jButton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                direction =37;
              //  System.out.println(direction);
                reqFocus(true);
            }
        });


        jButton6.setText("^: раскрыть");
        jButton6.setActionCommand("^");
        jButton6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                direction =38;
             //   System.out.println(direction);
                reqFocus(true);
            }
        });


        jButton7.setText("Y: захват  ");
        jButton7.setActionCommand("Y  ");
        jButton7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                direction =40;
             //   System.out.println(direction);
                reqFocus(true);
            }
        });

        jButton8.setText(">: вправо");
        jButton8.setActionCommand(">");
        jButton8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                direction =39;
               // System.out.println(direction);
                reqFocus(true);
            }
        });
        jTextField1.setText("5000");
        jTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                udp_port=Integer.parseInt(jTextField1.getText());
               // System.out.println(udp_port);
                reqFocus(true);
            }
        });

        jTextField2.setText(ip_address);
        jTextField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                ip_address=jTextField2.getText();
              //  System.out.println(ip_address);
                reqFocus(true);
            }
        });



        jLabel1.setText("  IP адрес  ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("  Порт UDP  ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addGap(116, 116, 116))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton7)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(42, 42, 42)
                                                                .addComponent(jLabel2)))
                                                .addGap(118, 118, 118))))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3)
                                .addGap(77, 77, 77)
                                .addComponent(jButton4)
                                .addGap(49, 49, 49)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jButton8)
                                .addGap(44, 44, 44))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton3)
                                        .addComponent(jButton5)
                                        .addComponent(jButton8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton7))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addContainerGap(35, Short.MAX_VALUE))
        );


























          setSize(600, 300);
        this.setFocusable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

/*
    keys servo 1  -  37 39
    keys servo 2  -  87  83
    keys servo 3  -  65  68
    keys servo 4   - 38  40
*/

        this.addKeyListener(new KeyListener() {


            public void keyTyped(KeyEvent keyEvent) {


            }


            @Override
            public void keyPressed(KeyEvent keyEvent) {

                direction = keyEvent.getKeyCode();
              //  System.out.println(direction);

            }


            @Override
            public void keyReleased(KeyEvent keyEvent) {

                direction=50;
            }
        });






    }
    public  static void reqFocus(Boolean b){

        if(b){cp.requestFocus(true);}
        else{cp.requestFocus(false);}
    }





   }
