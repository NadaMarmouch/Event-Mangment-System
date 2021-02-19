/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author lenovo_pc
 */
public class REGSTRATION  extends JFrame implements  Serializable
{
    JFrame frame;
     JLabel title; 
     JTextField FirstName;
     JTextField LastName;
     JLabel Firstname; 
     JLabel Lastname;
     JLabel Phonenumber;
     JTextField PhoneNumber;
     JLabel Gender;
     JRadioButton male;
     JRadioButton female;
     JLabel Birthdate;
     JComboBox date; 
     JComboBox month; 
     JComboBox year; 
     JLabel password;
     JLabel Comfirm_password;
     JTextField pass;
     JTextField conf;
     JLabel Email_address;
     JTextField Email;
     JButton SubmitButton;
     JButton cancelButton;
     JPanel panel;
    
        
     File MyFlie;
    Client user=new Client();     
    ArrayList<Client> mydata=new ArrayList<>();
     
      private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    private String years[] 
        = { "1990","1991", "1992", "1993", 
            "1994", "1995", "1996", "1997", 
            "1998", "1999", "2000", "2001", 
            "2002", "2003", "2004", "2005", 
            "2006", "2007", "2008", "2009", 
            "2010", "2011", "2012", "2013", 
            "2014", "2015", "2016", "2017", 
            "2018", "2019", "2020","2021"}; 
    


    
    public REGSTRATION(){
        

        
                 
           JPanel frame = new JPanel(new FlowLayout()); 
           frame.setLayout(null);
           
            
    
    title = new JLabel("Registration page");
           title.setFont(new Font("Verdana", Font.BOLD, 30)); 
           setBounds(300, 90, 900, 600);
           //f.setForeground(Color.GRAY);
          frame.setBackground(Color.LIGHT_GRAY);
           title.setSize(400, 40); 
           title.setLocation(300, 30); 
           setDefaultCloseOperation(EXIT_ON_CLOSE);
          frame.add(title);
        
  
        
     Firstname = new JLabel("Firstname");
        Firstname.setSize(100, 20); 
        Firstname.setLocation(100, 100);
        //System.out.println(Firstname.getText());
        frame.add(Firstname); 
        
        FirstName = new JTextField();  
        FirstName.setSize(190, 20); 
        FirstName.setLocation(200, 100); 
        frame.add(FirstName); 
  
      
     LastName = new JTextField();
          LastName.setSize(190, 20); 
          LastName.setLocation(600, 100); 
         frame.add(LastName); 

      Lastname = new JLabel("Lastname");  
        Lastname.setSize(150, 20); 
        Lastname.setLocation(500, 100); 
       frame.add(Lastname);  
         

      Phonenumber = new JLabel("Phonenumber");  
        Phonenumber.setSize(100, 20); 
        Phonenumber.setLocation(100, 150);
        frame.add(Phonenumber);
        
        PhoneNumber = new JTextField(); 
        PhoneNumber.setSize(150, 20); 
        PhoneNumber.setLocation(200, 150); 
        frame.add(PhoneNumber); 
         
     Gender = new JLabel("Gender is"); 
        Gender.setSize(100, 20); 
        Gender.setLocation(100, 200); 
       frame.add(Gender); 
     
     male = new JRadioButton("Male");
     male.setSelected(true); 
       male.setSize(75, 20); 
        male.setLocation(200, 200);
        frame.add(male); 
    
     female = new JRadioButton("female");
        female.setSelected(false); 
         female.setSize(80, 20); 
        female.setLocation(275, 200);
        frame.add(female); 
        
         ButtonGroup genderChoice = new ButtonGroup();
         genderChoice.add(male);
         genderChoice.add(female);

     Birthdate = new JLabel("Birthdate"); 
         Birthdate.setSize(100, 20); 
         Birthdate.setLocation(100, 250);
        frame.add(Birthdate);
        
        date = new JComboBox(dates); 
        date.setSize(50, 20); 
        date.setLocation(200, 250);
        frame.add(date); 
  
        month = new JComboBox(months); 
        month.setSize(60, 20); 
        month.setLocation(250, 250); 
        frame.add(month); 
  
        year = new JComboBox(years); 
        year.setSize(60, 20); 
        year.setLocation(320, 250); 
        frame.add(year); 
       
        
         password= new JLabel("password");
         password.setSize(100, 20); 
         password.setLocation(100, 300); 
         frame.add(password);
        
         pass = new JTextField(); 
         pass = new JPasswordField(10);
         pass.setSize(200, 20); 
         pass.setLocation(200, 300); 
         frame.add(pass); 
        
         Comfirm_password= new JLabel("Comfirm_pass");
         Comfirm_password.setSize(100, 20); 
         Comfirm_password.setLocation(100, 350); 
         frame.add(Comfirm_password);
        
         conf = new JTextField();
         conf = new JPasswordField(10);
         conf .setSize(200, 20); 
         conf .setLocation(200, 350); 
         frame.add(conf);
        
         Email_address= new JLabel("Email_address");
         Email_address.setSize(100, 20); 
         Email_address.setLocation(100, 400); 
        frame.add(Email_address);
        
         Email = new JTextField(); 
         Email .setSize(200, 20); 
         Email .setLocation(200, 400); 
         frame.add(Email);
         
        SubmitButton = new JButton("Submit"); 
        SubmitButton.setSize(100, 20); 
        SubmitButton.setLocation(150, 450);
        SubmitButton.addActionListener(new button1());
        frame.add(SubmitButton); 
  
        cancelButton = new JButton("Cancel"); 
        cancelButton.setSize(100, 20); 
        cancelButton.setLocation(270, 450); 
        frame.add(cancelButton); 
       // cancelButton.addActionListener(this);
        add(frame);
        
    SubmitButton.addActionListener(new button1());
    cancelButton.addActionListener(new button1());
    }
    
    
   class button1 implements ActionListener{
       
    @Override
       public void actionPerformed(ActionEvent e)   {
           
                 
               if (e.getSource()==SubmitButton)
               {
                   
                     if(FirstName.getText().length()<=0)
                     {
                     JOptionPane.showMessageDialog(null, "please Enter Your First Name");
                     }
                     else if(LastName.getText().length()<=0)
                     {
                     JOptionPane.showMessageDialog(null, "please Enter your LastName");
                     }
                     else if ( PhoneNumber.getText().length()!=11)
                     {
                     JOptionPane.showMessageDialog(null, "The phone number is not correct it must be 11 digits");
                     }
                     else if ( password.getText().length()<=6)
                     {
                     JOptionPane.showMessageDialog(null, "Too short password, password must be 6 characters or more");
                     } 
                     else if ( conf.getText().length()<=6)
                     {
                     JOptionPane.showMessageDialog(null, "please enter to cofirm the password");
                     } 
                     else if (! conf.getText().equals(password.getText()))
                     {
                     JOptionPane.showMessageDialog(null, "The Conf Not Equal To Password");
                     }
                     else if (Email.getText().length()<=0)
                     {
                     JOptionPane.showMessageDialog(null, "wrong format of the email please write it like this format:");
                     JOptionPane.showMessageDialog(null, "username@gmail.com");
                     }
               else 
                    {
                        user.setGender(Gender.getText());
                        if (female.isSelected()){
                        user.setGender("Female");
                        }
                      else user.setGender("male");
                     
                       Meeting M= new Meeting();
                       M.setVisible(true);
                       
                    }
               }
               
            if(e.getSource() ==cancelButton) 
            {
              System.exit(0);
            }
           
                   
                    ObjectOutputStream bin=null;   
        try {
          user.setUser(FirstName.getText());
          user.setUser(LastName.getText());
          user.setPhone(PhoneNumber.getText());
          user.setPassword(pass.getText());
          user.setConf(conf.getText());
          user.setEmail(Email.getText());
          
          
          
            bin = new ObjectOutputStream(new FileOutputStream("registration.bin"));
            bin.writeObject(user);
            bin.close();
           
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bin.close();
            } catch (IOException ex) {
                Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}

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
    }    }

























    //try
            //{
            //  //el file elly hate2ry meno howa howah elly hatktby feeh f yeb2o el etneen nafs el path ya3ny
            // mydata = Read("Registration.bin");
            //  mydata.add(user);
            //    Write(mydata,"Registration.bin"); 
            //} catch (IOException ex) {
            //  Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
            //} catch (ClassNotFoundException ex) {
            //  Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
            //}
            
            //}
            
//    public ArrayList<Client> Read(String address) throws FileNotFoundException, IOException, ClassNotFoundException 
//    {
//       
//        try {
// 
//            FileInputStream fileIn = new FileInputStream(address);
//            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
//            ArrayList<Client> arr=(ArrayList<Client>)objectIn.readObject();
//            System.out.println("The Object has been read from the file");
//            objectIn.close();
//           return arr;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//           return null;
//       }
//   }
   