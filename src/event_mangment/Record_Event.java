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
public class Record_Event  extends JFrame{
    
      JLabel Title;
      JLabel Event_Name;
      JTextField Event_Na;
      JLabel Name;
      JTextField Na;
      JLabel ID;
      JTextField id;
      JLabel Major;
      JTextField major;
      JButton Submit;
      JButton Cancle;
      
        File MyFlie;
        Record rec=new Record();   
        ArrayList<Record> mydata=new ArrayList<>();
    
    
      public  Record_Event (){
     JPanel record = new JPanel(new FlowLayout()); 
           
           record.setLayout(null);
           
           Title = new JLabel(" Record_Event");
           Title.setFont(new Font("Verdana", Font.BOLD,25)); 
           record.setBackground(Color.LIGHT_GRAY);
           setBounds(500, 150, 500, 500);
           Title.setSize(250, 40); 
           Title.setLocation(150, 50); 
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           record.add(Title);
           add(record);
          
          Event_Name = new JLabel("Event_Name");
          Event_Name.setSize(100, 20); 
          Event_Name.setLocation(100, 150); 
          record.add( Event_Name);
          add( record);
          
          Event_Na = new JTextField();
          Event_Na.setSize(100, 20); 
          Event_Na.setLocation(200, 150); 
          record.add( Event_Na);
          add( record);
          
           Name = new JLabel("Name");
          Name.setSize(100, 20); 
          Name.setLocation(100, 200); 
          record.add( Name );
          add(  record );
          
          Na = new JTextField();
          Na.setSize(100, 20); 
          Na.setLocation(200, 200); 
          record.add( Na);
         add(  record);
         
          ID = new JLabel("ID");
          ID.setSize(100, 20); 
          ID.setLocation(100, 250); 
          record.add(ID);
          add(  record );
          
          id = new JTextField();
          id.setSize(100, 20); 
          id.setLocation(200, 250); 
          record.add( id);
         add(  record);
         
          Major= new JLabel("Major");
          Major.setSize(100, 20); 
          Major.setLocation(100, 300); 
          record.add(Major);
          add(  record );
          
          major = new JTextField();
          major.setSize(100, 20); 
          major.setLocation(200, 300); 
          record.add( major);
         add(  record);
         
         Submit= new JButton("Submit"); 
         Submit.setSize(100, 20); 
         Submit.setLocation(150, 350);
         record.add(Submit);
         add(record);
           
         Cancle= new JButton("Cancle"); 
         Cancle.setSize(100, 20); 
         Cancle.setLocation(300, 350);
         record.add(Cancle);
         add(record);
         
          Submit.addActionListener(new  button());
          Cancle.addActionListener(new button());
}
class button implements ActionListener{
    @Override
       public void actionPerformed(ActionEvent e)   {

 
           if(e.getSource() ==Submit) {
               
                if(Event_Na.getText().length()<=0)
                {
                 JOptionPane.showMessageDialog(null, "please check your Event Name again");
                 }
                 else if(Na.getText().length()<=0)
                 {
                 JOptionPane.showMessageDialog(null, "please enter your  Name");
                 }
                 else if ( id.getText().length()<=2)
                 {
                 JOptionPane.showMessageDialog(null, "Please Enter your ID");
                 }
                 else if ( major.getText().length()<=0)
                 {
                 JOptionPane.showMessageDialog(null, "Please Enter your Major");
                 }
           else{
                     
               Event_module modu=new Event_module();
               modu.setVisible(true);
            }
           }   
        if(e.getSource() ==Cancle)
             {
              System.exit(0);
            }
   
 ObjectOutputStream bin=null;
        try {
            rec.setEvent_Name(Event_Na.getText());
            rec.setName(Na.getName());
            rec.setID(id.getText());
            rec.setMajor(major.getText());
            

             bin = new ObjectOutputStream(new FileOutputStream("Meeting.bin"));
            bin.writeObject(rec);
            bin.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Meeting.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Meeting.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bin.close();
            } catch (IOException ex) {
                Logger.getLogger(Meeting.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
}
    }
    public void Write(ArrayList<Meetings> data , String path) throws IOException
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
     
     
}