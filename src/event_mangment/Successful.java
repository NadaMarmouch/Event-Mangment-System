/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
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
public class Successful extends JFrame {
    
     JLabel Title;
     JLabel Text;
     JLabel Te;
       public  Successful (){
           
           
         JPanel S= new JPanel(new FlowLayout()); 
             S.setLayout(null);
             setBounds(300, 300, 450, 200); 
             S.setBackground(Color.LIGHT_GRAY);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            

              Text = new JLabel("Your Reservation Is Successful");
              Text.setFont(new Font("Verdana", Font.BOLD, 20));
              Text.setSize(400, 20); 
              Text.setLocation(60, 50); 
              S.add( Text);
              add(S);
              
              Te = new JLabel("Thank You !");
              Te.setFont(new Font("Verdana", Font.BOLD, 20));
              Te.setSize(400, 20); 
              Te.setLocation(170, 100); 
              S.add( Te);
              add(S);
  
             
    }

 
  
}

