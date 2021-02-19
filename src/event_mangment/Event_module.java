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
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author lenovo_pc
 */
public class Event_module extends JFrame {
    
         JLabel Title;
         JLabel Module;
         JComboBox model;
         JLabel Model;
         JTextField Text;
          JLabel Optional;
         JButton Submit;
         JButton Cancle;
         
      private String dates[] 
        = { "classic model","modern model","semi modern","semi classic","others"};
      
       public Event_module  (){

           JPanel module = new JPanel(new FlowLayout()); 
          module.setLayout(null);
           
     Title = new JLabel("Event_module");
           Title.setFont(new Font("Verdana", Font.BOLD, 25)); 
            module.setBackground(Color.LIGHT_GRAY);
           setBounds(300, 150, 350, 350);
           Title.setSize(200, 40); 
           Title.setLocation(90, 30); 
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           module.add(Title);
           add(module);
           
          Module = new JLabel("Module"); 
          Module.setSize(200, 20); 
          Module.setLocation(80, 100);
         module.add(Module);
         add(module);
        
        model = new JComboBox(dates); 
        model.setSize(150, 20); 
        model.setLocation(130, 100);
        module.add(model);
        add(module);
        
          Model= new JLabel("Model"); 
          Model.setSize(200, 20); 
          Model.setLocation(80, 150);
         module.add(Model);
         add(module);
        
        
          Text= new JTextField();
          Text.setSize(110, 20); 
          Text.setLocation(130, 150); 
          module.add(Text); 
           add(module);
           
          Optional= new JLabel("(Optional)"); 
          Optional.setFont(new Font("Arial", Font.PLAIN, 10)); 
          Optional.setSize(200, 20); 
          Optional.setLocation(250, 150);
          module.add(Optional);
         add(module);
         
         Submit= new JButton("Submit"); 
         Submit.setSize(100, 20); 
         Submit.setLocation(80, 200);
          module.add(Submit);
         add( module);
           
         Cancle= new JButton("Cancle"); 
         Cancle.setSize(100, 20); 
         Cancle.setLocation(200, 200);
          module.add(Cancle);
         add( module);
         
          Submit.addActionListener(new button());
          Cancle.addActionListener(new button());
}
        class button implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)   {
        
        if(e.getSource() ==Submit) {
            
          ExtraEvent  extra =new ExtraEvent ();
          extra.setVisible(true);
          extra.setDefaultCloseOperation(EXIT_ON_CLOSE);
          }
        
          if(e.getSource() ==Cancle) {
              System.exit(0);
            }
    } }
}