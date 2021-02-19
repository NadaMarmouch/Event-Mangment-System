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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author lenovo_pc
 */
public class Reserve_event_days extends JFrame {
    
     JLabel Title;
     JLabel Event_Date;
     JComboBox Day; 
     JComboBox Time; 
      JButton Submit;
         JButton Cancle;
     private String Days[] 
        = { "Sunday","Tuesday","wensday"};  
     
     
      public  Reserve_event_days  (){
     JPanel R = new JPanel(new FlowLayout()); 
           
           R.setLayout(null);
          Title = new JLabel("Reserve_event_days");
           Title.setFont(new Font("Verdana", Font.BOLD, 30)); 
           R.setBackground(Color.LIGHT_GRAY);
           setBounds(500, 150, 500, 350);
           Title.setSize(400, 40); 
           Title.setLocation(70, 30); 
           setDefaultCloseOperation(EXIT_ON_CLOSE);
          R.add(Title);
          add(R);
          
           Submit= new JButton("Submit"); 
         Submit.setSize(100, 20); 
         Submit.setLocation(150, 250);
          R.add(Submit);
         add( R);
           
         Cancle= new JButton("Cancle"); 
         Cancle.setSize(100, 20); 
         Cancle.setLocation(270, 250);
          R.add(Cancle);
         add( R);
         
          Submit.addActionListener(new button());
          Cancle.addActionListener(new button());
}
        class button implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)   {
        
        if(e.getSource() ==Submit) {
            
         Payment pay=new Payment();
         pay.setVisible(true);
          }
        
          if(e.getSource() ==Cancle) {
              System.exit(0);
            }
          
          
           
}
        }
}