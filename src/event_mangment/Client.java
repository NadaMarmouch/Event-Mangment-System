/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;

import java.io.Serializable;

/**
 *
 * @author lenovo_pc
 */

     public class Client implements Serializable {

    
            private String user;
            private String phone;
            private String Email;
            private String password;
            private String conf;
            private String Description;
            private String Summary;
            private String DateStart;
            private String Duration;
            private String Organizer;
            private String ParticipationLevel;
            private String Gender;
          

    
    /**
     * @return the user
     */
    public String getGender() 
    {
        return Gender;
    }

    /**
     * @param user the user to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

 
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the conf
     */
    public String getConf() {
        return conf;
    }

    /**
     * @param conf the conf to set
     */
    public void setConf(String conf) {
        this.conf = conf;
    }



    


     
    
       
}
