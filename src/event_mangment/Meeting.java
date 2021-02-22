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
public class Meeting extends JFrame {
    
     JLabel Title; 
     JLabel Eventname;
     JTextField Eventna;
     JTextField Start_ti;
     JLabel Start_time ;
     JTextField End_ti;
     JLabel End_time;
     JLabel RoomID;
     JLabel Room_ID;
     
     JLabel time;
     JComboBox end; 
     JComboBox start;
     
      JButton Submit;
     JButton Cancle;
     
      private String startt[] 
        = { "10:00 AM", "11:00 AM", "12:30 PM", "01:45 PM", "03:00 PM", 
            "04:00 PM", "05:30 PM", "06:00 PM", "08:00 PM" ,"09:30 PM"}; 
      
       private String endd[] 
        = { "10:30 AM", "12:00 PM", "01:30 PM", "02:45 PM", "04:00 PM", 
            "05:00 PM", "06:30 PM", "07:00 PM", "09:00 PM" ,"10:30 PM"}; 
     File MyFlie;
    Meetings meeting=new Meetings();   
    ArrayList<Meetings> mydata=new ArrayList<>();
    
     public Meeting (){
        
           meeting.setRoomID();
           JPanel Meet = new JPanel(new FlowLayout()); 
           Meet.setLayout(null);
           
           Title = new JLabel("Meeting schedual");
           Title.setFont(new Font("Verdana", Font.BOLD, 30)); 
           Meet.setBackground(Color.LIGHT_GRAY);
           setBounds(500, 150, 500, 350);
           Title.setSize(300, 40); 
           Title.setLocation(120, 30); 
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           Meet.add(Title);
           add(Meet);
           
           
          Eventname = new JLabel("Eventname");
          Eventname.setSize(100, 20); 
          Eventname.setLocation(100, 100);
          Meet.add(Eventname); 
          add(Meet);
         
          Eventna = new JTextField();  
          Eventna.setSize(150, 20); 
          Eventna.setLocation(200, 100); 
          Meet.add(Eventna); 
          add(Meet);
          
          Start_time= new JLabel("Start_time");
          Start_time.setSize(100, 20); 
          Start_time.setLocation(100, 150);
          Meet.add(Start_time); 
          add(Meet);
          
            start = new JComboBox(startt); 
            start.setSize(80, 20); 
            start.setLocation(200, 150);
            Meet.add(start); 

//          Start_ti = new JTextField();  
//          Start_ti.setSize(50, 20); 
//          Start_ti.setLocation(200, 150); 
//          Meet.add(Start_ti); 
//           add(Meet);
           
       
  
          End_time= new JLabel("End_time");
          End_time.setSize(100, 20); 
          End_time.setLocation(300, 150);
          Meet.add(End_time); 
          add(Meet);
        
         end = new JComboBox(endd); 
         end.setSize(80, 20); 
         end.setLocation(370, 150); 
         Meet.add(end); 
         
         
//          End_ti = new JTextField();  
//          End_ti.setSize(50, 20); 
//          End_ti.setLocation(370, 150); 
//          Meet.add(End_ti); 
//           add(Meet);
           
          RoomID= new JLabel("RoomID");
          RoomID.setSize(100, 20); 
          RoomID.setLocation(100,200 );
          Meet.add(RoomID); 
          add(Meet);
        
          Room_ID = new JLabel();  
          Room_ID.setSize(100, 20); 
          Room_ID.setLocation(200, 200); 
          Room_ID.setText(Integer.toString(meeting.getRoomID()));
          Meet.add(Room_ID); 
          add(Meet);
          
         Submit= new JButton("Submit"); 
         Submit.setSize(100, 20); 
         Submit.setLocation(170, 250);
         Meet.add(Submit);
         add(Meet);
           
         Cancle= new JButton("Cancle"); 
         Cancle.setSize(100, 20); 
         Cancle.setLocation(300, 250);
         Meet.add(Cancle);
         add(Meet);
         
          Submit.addActionListener(new  button());
          Cancle.addActionListener(new button());
}
     
   class button implements ActionListener{
    @Override
       public void actionPerformed(ActionEvent e)   {
        

          if(e.getSource() ==Submit) {
              
                if(Eventna.getText().length()<=0){
                 JOptionPane.showMessageDialog(null, "please check your The Event Name again");
                 }
                 else  if(Start_ti.getText().length()!=2){
                 JOptionPane.showMessageDialog(null, "please Enter The Start Time ");
                  }
                 else if ( End_ti.getText().length()!=2){
                 JOptionPane.showMessageDialog(null, "Please Enter The End Time"); 
                  }
                 else{
                      Record_Event rec =new  Record_Event();
                      rec.setVisible(true);
                  }
          }
           if(e.getSource() ==Cancle) {
              System.exit(0);
            }
            ObjectOutputStream bin=null;
        try {
            meeting.setEvent_name(Eventna.getText());
            meeting.setStart_time(Start_ti.getText());
            meeting.setEnd_time(End_ti.getText());
            
             bin = new ObjectOutputStream(new FileOutputStream("Meeting.bin"));
            bin.writeObject(meeting);
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
    public void Write(ArrayList<Meeting> data , String path) throws IOException
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