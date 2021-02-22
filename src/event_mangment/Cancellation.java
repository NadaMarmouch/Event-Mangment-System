/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author lenovo_pc
 */
public class Cancellation extends JFrame {

    JLabel Title;
    JLabel Event_Name;
    JTextField Event_na;
    JButton Yes;
    JButton No;

    File MyFlie;
    Client user = new Client();
    ArrayList<Client> mydata = new ArrayList<>();

    public Cancellation() {
        JPanel Cancle = new JPanel(new FlowLayout());

        Cancle.setLayout(null);

        Title = new JLabel("Cancellation The Event");
        Title.setFont(new Font("Verdana", Font.BOLD, 25));
        Cancle.setBackground(Color.LIGHT_GRAY);
        setBounds(500, 250, 500, 250);
        Title.setSize(450, 40);
        Title.setLocation(100, 30);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Cancle.add(Title);

        Event_Name = new JLabel("Event_Name");
        Event_Name.setSize(100, 20);
        Event_Name.setLocation(150, 100);
        Cancle.add(Event_Name);

        Event_na = new JTextField();
        Event_na.setSize(100, 20);
        Event_na.setLocation(250, 100);
        Cancle.add(Event_na);

        Yes = new JButton("Yes");
        Yes.setSize(100, 20);
        Yes.setLocation(150, 150);
        Cancle.add(Yes);
        add(Cancle);

        No = new JButton(" No");
        No.setSize(100, 20);
        No.setLocation(300, 150);
        Cancle.add(No);
        add(Cancle);

        Yes.addActionListener(new button());
        No.addActionListener(new button());
    }

    class button implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == No) {
                if (Event_na.getText().length() <= 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter Your The Event Name");

                } else {
                    Payment pay = new Payment();
                    pay.setVisible(true);

                }
            }
            if (e.getSource() == Yes) {
                System.exit(0);
            }

            ObjectOutputStream bin = null;
            try {

                user.setEvent_Name(Event_na.getText());

                bin = new ObjectOutputStream(new FileOutputStream("Cancellation.bin"));
                bin.writeObject(user);
                bin.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cancellation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Cancellation.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    bin.close();
                } catch (IOException ex) {
                    Logger.getLogger(Cancellation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void Write(ArrayList<Client> data, String path) throws IOException {
        MyFlie = new File(path);
        MyFlie.createNewFile();
        try {
            FileOutputStream myfile = new FileOutputStream(MyFlie);
            try ( ObjectOutputStream in = new ObjectOutputStream(myfile)) {
                in.writeObject(data);
                in.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
