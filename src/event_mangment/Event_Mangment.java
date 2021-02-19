/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;

import java.io.IOException;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author lenovo_pc
 */
public class Event_Mangment   {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
         
     
       //  Login Log=new Login();
       //  Log.setVisible(true);
        // Log. setDefaultCloseOperation(EXIT_ON_CLOSE);
        
            MyServer server1=new MyServer();
            server1.run();
            MyClient client1 = new MyClient();
            client1.run();
            
            
         /////1
           REGSTRATION R=new REGSTRATION();
           R.setVisible(true);
         //   R.pack();
 

         //////2
        // Meeting M= new Meeting();
         //M.setVisible(true);
        

          //////3
         //Record_Event rec =new  Record_Event();
         //rec.setVisible(true);
         
         ////4
         //  Event_module modu=new Event_module();
         //modu.setVisible(true);  
         
         ////5
         //  ExtraEvent  extra =new ExtraEvent ();
         // extra.setVisible(true);
         
         /////6
          //Reserve_event_days  reserve =new Reserve_event_days ();
          // reserve.setVisible(true);
        
          /////7
          //  Cancellation cancle=new Cancellation();
            //cancle.setVisible(true);
            
            //////8
           //Payment pay=new Payment();
           //pay.setVisible(true);

          ///////9
           //Collecting_Feedback FB= new Collecting_Feedback();
          // FB.setVisible(true);

          //////10
          // Successful Sucess = new Successful();
          //Sucess.setVisible(true);
     
    }
    
}
