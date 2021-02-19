/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author lenovo_pc
 */
public class Payment extends JFrame{
     JLabel Title;
     JLabel Cash;
     JLabel Visa;
     JLabel Cardnumber;
     JTextField Cardnum;
     JLabel Cardname;
     JTextField Cardna;
     JLabel Expiration_Date;
     JComboBox Month;
     JComboBox Year; 
     JLabel cvc;
     JTextField CVC;
     JButton Submit;
     JButton Cancle;
     
      private String Months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" };
      
    private String Years[] 
        = {  "2020","2021","2022","2023",
        "2024","2025","2026","2027",
        "2028","2029","2030","2031"}; 
    
     File MyFlie;
    Pay paym=new Pay();     
    ArrayList<Pay> mydata=new ArrayList<>();
     
    public  Payment (){
     JPanel j = new JPanel(new FlowLayout()); 
           
           j.setLayout(null);
           
           Title = new JLabel("Payment");
           Title.setFont(new Font("Verdana", Font.BOLD, 30)); 
            j.setBackground(Color.LIGHT_GRAY);
           setBounds(500, 150, 500, 500);
           Title.setSize(200, 40); 
           Title.setLocation(200, 30); 
           setDefaultCloseOperation(EXIT_ON_CLOSE);
          j.add(Title);
         
          
          Visa = new JLabel("Visa");
          Visa.setFont(new Font("Verdana", Font.BOLD, 20));
          Visa.setSize(100, 60); 
          Visa.setLocation(70, 60); 
          j.add( Visa);
          
          Cardnumber = new JLabel("Cardnumber");
          Cardnumber.setSize(150, 20); 
          Cardnumber.setLocation(100, 150); 
          j.add( Cardnumber);
          
          
          Cardnum = new JTextField();
          Cardnum.setSize(200, 20); 
          Cardnum.setLocation(200, 150); 
          j.add( Cardnum);
          
          Cardname = new JLabel("Cardname");
          Cardname.setSize(100, 20); 
          Cardname.setLocation(100, 200); 
          j.add( Cardname);
          
          
          Cardna = new JTextField();
          Cardna.setSize(200, 20); 
          Cardna.setLocation(200, 200); 
          j.add( Cardna);
         
          
          Expiration_Date = new JLabel("Expiration_Date"); 
         Expiration_Date.setSize(100, 20); 
         Expiration_Date.setLocation(100, 250);
        j.add(Expiration_Date);
         
  
        Month = new JComboBox(Months); 
        Month.setSize(60, 20); 
        Month.setLocation(250, 250); 
        j.add(Month); 
  
        Year = new JComboBox(Years); 
        Year.setSize(60, 20); 
        Year.setLocation(320, 250); 
        j.add(Year); 
          
         cvc = new JLabel("Cvc");
         cvc.setSize(60, 20); 
          cvc.setLocation(400, 230); 
          j.add(cvc);
          
          CVC= new JTextField();
          CVC.setSize(60, 20); 
          CVC.setLocation(400, 250); 
          j.add( CVC);
          
         Submit= new JButton("Submit"); 
         Submit.setSize(100, 20); 
         Submit.setLocation(150, 350);
        j.add(Submit);
        add(j);
           
         Cancle= new JButton("Cancle"); 
         Cancle.setSize(100, 20); 
        Cancle.setLocation(300, 350);
        j.add(Cancle);
        add(j);
        
      
     Cancle.addActionListener(new Payment.button());
     Submit.addActionListener(new Payment.button());
}

      class button implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)   {
                  
        if(e.getSource() ==Submit) {
            
             if(Cardnum.getText().length()!=16){
             JOptionPane.showMessageDialog(null, "please check your The card Number again");
             }
             else if(Cardna.getText().length()==0){
             JOptionPane.showMessageDialog(null, "please enter your The Card Name");
             }
             else if ( CVC.getText().length()!=3){
             JOptionPane.showMessageDialog(null, "Please Enter The CVC Again");
             }
             else{
                  Collecting_Feedback FB= new Collecting_Feedback();
                  FB.setVisible(true);
                  FB. setDefaultCloseOperation(EXIT_ON_CLOSE);
                }
        }
             if(e.getSource() ==Cancle) {
              System.exit(0);
            }
             
            ObjectOutputStream bin=null;
            
        try {
                paym.setCardname(Cardna.getText());
                paym.setCardnumber(Cardnum.getText());
                paym.setCvc(CVC.getText());
                 
             bin = new ObjectOutputStream(new FileOutputStream("Payment.bin"));
            bin.writeObject(paym);
            bin.close();
        }
         catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            try {
                bin.close();
            } catch (IOException ex) {
                Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
}
    }
    public void Write(ArrayList<Client> data , String path) throws IOException
    {
        MyFlie= new File(path);
        MyFlie.createNewFile();
        try
        {
            FileOutputStream myfile = new FileOutputStream(MyFlie);
            try (ObjectOutputStream in =new ObjectOutputStream(myfile))
            {
                in.writeObject(data);
                in.close();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }   }
     