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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author lenovo_pc
 */
public class ExtraEvent  extends JFrame{
    
     JLabel Title;
     JLabel Event;
     JTextField Event_na;
     JButton Yes;
     JButton No;
    
    public  ExtraEvent (){
     JPanel EXTRA= new JPanel(new FlowLayout()); 
           
            EXTRA.setLayout(null);
           
           Title = new JLabel("Extra Event");
           Title.setFont(new Font("Verdana", Font.BOLD, 25)); 
            EXTRA.setBackground(Color.LIGHT_GRAY);
           setBounds(500, 250, 500, 250); 
           Title.setSize(300, 40); 
           Title.setLocation(170, 30); 
           setDefaultCloseOperation(EXIT_ON_CLOSE);
            EXTRA.add(Title);
          
            Event = new JLabel("Do You Want To Reserve A Extra Event");
            Event.setSize(300, 20); 
            Event.setLocation(150, 100); 
             EXTRA.add( Event);
          
    
          Yes= new JButton("Yes"); 
          Yes.setSize(100, 20); 
          Yes.setLocation(150, 150);
           EXTRA.add(Yes);
          add( EXTRA);
           
          No= new JButton(" No"); 
          No.setSize(100, 20); 
          No.setLocation(300, 150);
           EXTRA.add( No);
          add( EXTRA);

          Yes.addActionListener(new button());
          No.addActionListener(new button());
}

        class button implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)   {
         
            if(e.getSource() ==Yes) {
                
              Reserve_event_days  reserve =new Reserve_event_days ();
              reserve.setVisible(true);      
              reserve. setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
              if (e.getSource()==No){
                  
                 Payment pay=new Payment();
                 pay.setVisible(true);
                
              }
      
    } }

}