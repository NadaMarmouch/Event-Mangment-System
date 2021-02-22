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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author lenovo_pc
 */
public class Reserve_event_days extends JFrame {
    
         JLabel Title;
         JLabel Event_Date;
         JLabel text;
         JLabel text1;
         JLabel text2;
         JLabel text3;
         JComboBox Day; 
         JComboBox Time; 
         JButton Submit;
         JButton Cancle;
         JRadioButton Day1;
         JRadioButton Day2;
         JRadioButton Day3;
    
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
       
        
         text = new JLabel("There's a Concert In Tuesday From 6 PM To 10 PM,The Payment is 5000 "); 
         text.setSize(400, 20); 
         text.setLocation(50, 100);
         R.add(text);
         
         Day1 = new JRadioButton("Tuesday");
         Day1.setSelected(true); 
         Day1.setSize(75, 20); 
         Day1.setLocation(200, 120);
         R.add(Day1); 
        
         text1 = new JLabel("There's a Concels In Sunday From 8 PM to 12 AM ,The Payment is 1500. "); 
         text1.setSize(400, 20); 
         text1.setLocation(50, 140);
         R.add(text1);
         
         Day2 = new JRadioButton("Sunday");
         Day2.setSelected(true); 
         Day2.setSize(75, 20); 
         Day2.setLocation(200, 160);
         R.add(Day2); 
         
        
         text2 = new JLabel("There's a Cairokee In Wensday From 8 PM to 12 AM ,The Payment is 2000. "); 
         text2.setSize(400, 20); 
         text2.setLocation(50, 180);
         R.add(text2);
         
         Day3 = new JRadioButton("Sunday");
         Day3.setSelected(true); 
         Day3.setSize(75, 20); 
         Day3.setLocation(200, 200);
         R.add(Day3); 
         
         ButtonGroup genderChoice = new ButtonGroup();
         genderChoice.add(Day1);
         genderChoice.add(Day2);
         genderChoice.add(Day3);
        
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