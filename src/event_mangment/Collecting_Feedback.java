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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
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
public class Collecting_Feedback extends JFrame{
    
    
     JLabel Title;
     JLabel FeedBack;
     JTextField Feedback;
     JButton Submit;
     JButton Reset;
     
     
       File MyFlie;
    Client feedbk=new Client();     
    ArrayList<Client> mydata=new ArrayList<>();
    
     public  Collecting_Feedback (){
     JPanel C= new JPanel(new FlowLayout()); 
           
           C.setLayout(null);
           
           Title = new JLabel("Collecting_Feedback");
           Title.setFont(new Font("Verdana", Font.BOLD, 25)); 
           C.setBackground(Color.LIGHT_GRAY);
           setBounds(500, 250, 500, 250); 
           Title.setSize(300, 40); 
           Title.setLocation(100, 30); 
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           C.add(Title);
          
          FeedBack = new JLabel("FeedBack");
          FeedBack.setSize(100, 20); 
          FeedBack.setLocation(110, 100); 
          C.add( FeedBack);
          
          
          Feedback = new JTextField();
          Feedback.setSize(200, 20); 
          Feedback.setLocation(180, 100); 
          C.add( Feedback);
    
         Submit= new JButton("Submit"); 
         Submit.setSize(100, 20); 
         Submit.setLocation(150, 150);
         C.add(Submit);
         add(C);
           
         Reset= new JButton("Reset"); 
         Reset.setSize(100, 20); 
         Reset.setLocation(300, 150);
         C.add(Reset);
         add(C);
         
          Submit.addActionListener(new button());
          Reset.addActionListener(new button());
}

 


     class button implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent AEvent) {
   
       if(AEvent.getSource().equals(Submit))
       {
           if(Feedback.getText().length()<=0){
               JOptionPane.showMessageDialog(null, "please enter your FeedBack");
           }
           else{
                   Successful Sucess = new Successful();
                   Sucess.setVisible(true); 
       }
       }
       else if(AEvent.getSource() ==Reset){
           
            String def = ""; 
            Feedback.setText(def); 
                  
        ObjectOutputStream bin=null;
        try {
            
        feedbk.setFeedbackk(Feedback.getText());
        
             bin = new ObjectOutputStream(new FileOutputStream("Collecting_Feedback.bin"));
            bin.writeObject(feedbk);
            bin.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Collecting_Feedback.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Collecting_Feedback.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bin.close();
            } catch (IOException ex) {
                Logger.getLogger(Collecting_Feedback.class.getName()).log(Level.SEVERE, null, ex);
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
        }
     }}