

import javax.swing.*;

import javax.swing.text.DefaultCaret;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

/*
    keys servo 1  -  37 39
    keys servo 2  -  87  83
    keys servo 3  -  65  68
    keys servo 4   - 38  40
*/

/**
 * Created by m on 24.06.2017.
 */
public class Control_Panel extends JFrame
{
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea jTextArea1;

    public static  javax.swing.JTextArea jTextArea2;

    public static  String file_path = "c:udp_data.txt";// путь к файлу где сохранка



    boolean stop=false;


    public static int direction=10;


    static  Control_Panel cp;

    Control_Panel() {

        super("ESP8266");


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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();





        jTextField1.setText("50000");
        jTextField2.setText("            ");

        jTextArea1.setText("Outcoming Data\r\n");

        jTextArea2.setText("Incoming Data\r\n");


        jButton9.setText("Connect");

        jButton9.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {





                    reqFocus(false);


                UserP.user= new UserP(jTextField2.getText());

                try(ObjectOutputStream objOS = new ObjectOutputStream((new FileOutputStream(file_path)))) {

                    objOS.writeObject(UserP.user);





                    new Http_Client(40000);

                }

                 catch (Exception e) {



                     Control_Panel.jTextArea1.append("Cannot write IP info to file\r\n");




                }



            }
        });






        jButton1.setText("скорость ++");
        jButton1.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {

                if(!stop)
                {
                    direction = 87;
                    reqFocus(true);

                    stop=true;
                    buttons_disable();
                    jButton1.setEnabled(true);


                }
                else
                {
                    stop=false;
                    direction=50;
                    reqFocus(true);
                    buttons_enable();
                }


            }
        });


        jButton2.setText("скорость -- ");
        jButton2.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {
                if(!stop)
                {
                    direction = 83;
                    reqFocus(true);

                    stop=true;
                    buttons_disable();
                    jButton2.setEnabled(true);
                }
                else
                {
                    stop=false;
                    direction=50;
                    reqFocus(true);
                    buttons_enable();
                }
            }
        });


        jButton3.setText("запасная");
        jButton3.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {
                if(!stop)
                {
                    direction = 65;
                    reqFocus(true);

                    stop=true;
                    buttons_disable();
                    jButton3.setEnabled(true);
                }
                else
                {
                    stop=false;
                    direction=50;
                    reqFocus(true);
                    buttons_enable();
                }
            }
        });



        jButton4.setText("запасная");
        jButton4.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {
                if(!stop)
                {
                    direction = 68;
                    reqFocus(true);

                    stop=true;
                    buttons_disable();
                    jButton4.setEnabled(true);
                }
                else
                {
                    stop=false;
                    direction=50;
                    reqFocus(true);
                    buttons_enable();
                }
            }
        });



        jButton5.setText(" влево ");
        jButton5.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {
                if(!stop)
                {
                    direction = 37;
                    reqFocus(true);

                    stop=true;
                    buttons_disable();
                    jButton5.setEnabled(true);
                }
                else
                {
                    stop=false;
                    direction=50;
                    reqFocus(true);
                    buttons_enable();
                }
            }
        });


        jButton6.setText("вперёд");
        jButton6.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {
                if(!stop)
                {
                    direction = 40;
                    reqFocus(true);

                    stop=true;
                    buttons_disable();
                    jButton6.setEnabled(true);
                }
                else
                {
                    stop=false;
                    direction=50;
                    reqFocus(true);
                    buttons_enable();
                }
            }
        });


        jButton7.setText("назад  ");
        jButton7.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {
                if(!stop)
                {
                    direction = 38;
                    reqFocus(true);

                    stop=true;
                    buttons_disable();
                    jButton7.setEnabled(true);
                }
                else
                {
                    stop=false;
                    direction=50;
                    reqFocus(true);
                    buttons_enable();
                }
            }
        });

        jButton8.setText(" вправо");
        jButton8.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent)
            {
                if(!stop)
                {
                    direction = 39;
                    reqFocus(true);

                    stop=true;
                    buttons_disable();
                    jButton8.setEnabled(true);

                }
                else
                {
                    stop =false;
                    direction=50;
                    reqFocus(true);
                    buttons_enable();
                }
            }

        });


        addKeyListener(new KeyListener()
        {
            public void keyTyped(KeyEvent keyEvent)
            {

            }


            @Override
            public void keyPressed(KeyEvent keyEvent)
            {
                direction = keyEvent.getKeyCode();
                reqFocus(true);


            }


            @Override
            public void keyReleased(KeyEvent keyEvent)
            {
                reqFocus(true);
                direction=50;


            }
        });



        jLabel1.setText("  IP адрес  ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());



        jLabel2.setText("  Порт UDP  ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                                                .addComponent(jButton7)
                                                .addGap(118, 118, 118))))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton3)
                                                .addGap(77, 77, 77)
                                                .addComponent(jButton4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel1)
                                                .addGap(40, 40, 40)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton8))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel2)
                                                .addGap(41, 41, 41)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton9)))
                                .addGap(44, 44, 44))
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
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jButton9)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );



        DefaultCaret caret1 = (DefaultCaret)jTextArea1.getCaret();
        caret1.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        DefaultCaret caret2 = (DefaultCaret)jTextArea2.getCaret();
        caret2.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        setSize(600, 800);
        setFocusable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        try (ObjectInputStream objIS = new ObjectInputStream(new FileInputStream(file_path))) {
            UserP.user = (UserP) objIS.readObject();





            jTextField2.setText(UserP.user.IP_address);



        } catch (Exception e) {


            UserP.user= new UserP("");

            System.out.println("не  могу");

            Control_Panel.jTextArea1.append("Cannot read IP info from file \r\n");



        }


    }



    public  static void reqFocus(Boolean b){

        if(b){cp.requestFocus(true);}
        else{cp.requestFocus(false);}
    }

    public void buttons_disable()
    {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
    }
    public void buttons_enable()
    {

        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
    }


}
