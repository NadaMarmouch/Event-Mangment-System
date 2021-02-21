    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package event_mangment;
    import java.awt.Color;
    import java.awt.Container;
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
    import javax.swing.JCheckBox;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JOptionPane;
    import javax.swing.JPanel;
    import javax.swing.JPasswordField;
    import javax.swing.JTextField;
    import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
    /**
     *
     * @author lenovo_pc
     */
    public class Login extends JFrame{

        Container container;
        JLabel title; 
        JLabel Username;
        JLabel password;

        JTextField userna;
        JPasswordField pass;
        JButton loginButton;
        JButton signup;
        JCheckBox showPassword;


          File MyFlie;
          Client user=new Client();     
          ArrayList<Client> mydata=new ArrayList<>();

      public  Login(){


            JPanel container = new JPanel(new FlowLayout()); 
            container.setLayout(null);

               title = new JLabel("LOGIN ");
               title.setFont(new Font("Verdana", Font.BOLD, 20)); 
               setBounds(500, 300, 500, 350);
               container.setBackground(Color.LIGHT_GRAY);
               title.setSize(400, 40); 
               title.setLocation(200, 30); 
               setDefaultCloseOperation(EXIT_ON_CLOSE);
               container.add(title);


              Username = new JLabel("USERNAME");
              Username.setBounds(80, 75, 100, 30);
              container.add(Username);
              add(container);


              userna = new JTextField();
             userna.setBounds(200, 80, 150, 20);
             container.add(userna);
             add(container);

              password = new JLabel("PASSWORD");
              password.setBounds(80, 125, 100, 30);
              container.add(password);
              add(container);

             pass = new JPasswordField();
             pass.setBounds(200, 130, 150, 20);
             container.add(pass);
             add(container);

             loginButton = new JButton("LOGIN");
             loginButton.setBounds(150, 200, 100, 30);
             container.add(loginButton);
             add(container);

             signup = new JButton("sign up");
             signup.setBounds(300, 200, 100, 30);
             container.add(signup);
              add(container);

             showPassword = new JCheckBox("Show Password");
             showPassword.setBounds(200, 250, 150, 30);
             container.add(showPassword);
             add(container);


            signup.addActionListener(new button());
           loginButton.addActionListener(new button());
           showPassword.addActionListener(new button());

      }






     class button implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


              if(e.getSource().equals(signup))       
              {
                REGSTRATION x=new REGSTRATION();
                x.setVisible(true);
               }

              if(e.getSource() ==loginButton) {
                   String userText;             
                   String passText;             
                   userText = userna.getText();
                   passText = pass.getText();

               if(userna.equals(userText) && pass.equals(passText)) {
                       JOptionPane.showMessageDialog(null, "Login ");
                   } 

                else if(userna.equals("") && pass.equals("")){
                    JOptionPane.showMessageDialog(null,"Please insert Username and Password");
                   }
                 else {

                JOptionPane.showMessageDialog(null,"Wrong Username / Password");
                userna.setText("");
                pass.setText("");

              }


                  Meeting M= new Meeting();
                  M.setVisible(true);
               }

           if (e.getSource() == showPassword) {
                if (showPassword.isSelected()) {
                    pass.setEchoChar((char) 0);
               }
                } 
                else {
               pass.setEchoChar('*');
                }

                   ObjectOutputStream bin=null;


                 try {

                 bin = new ObjectOutputStream(new FileOutputStream("Login.bin"));
                bin.writeObject(user);
                bin.close();
                } 
            catch (FileNotFoundException ex) {
                Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (IOException ex) {
                Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
            } 
            finally {
                try {
                    bin.close();
                } catch (IOException ex) {
                    Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
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

    }














//  String gmail = "Kareem@gmail";
//               if(e.getSource() ==loginButton) {
//                try { 
//                   String userText;             
//                   String passText;             
//                   userText = userna.getText();
//                   passText = pass.getText();
//                   
//                 if (gmail.equals(userText)) {
//
//                    JOptionPane.showMessageDialog(this, "Login Successful");
//                    A.calling();
//
//                } else if (r.readFile("D:\\Teacher.bin").contains(userText)) {
//                    JOptionPane.showMessageDialog(this, "Login Successful");
//                    G.Frame();
//                } else if (r.readFile("D:\\Students.bin").contains(userText)) {
//                    JOptionPane.showMessageDialog(this, "Login Successful");
//                    Studentt S = new Studentt();
//
//                } else {
//                    JOptionPane.showMessageDialog(this, "Invalid Username or Password");
//                }
//                   } 
//              catch (IOException ex) {
//                Logger.getLogger(REGSTRATION.class.getName()).log(Level.SEVERE, null, ex);
//            } 
//
//        }
//     }}
