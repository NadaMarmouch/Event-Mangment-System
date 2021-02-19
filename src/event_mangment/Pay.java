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
public class Pay implements Serializable{
    
     private String Cardnumber;
     private String Cardname; 
     private String cvc;

    /**
     * @return the Cardnumber
     */
    public String getCardnumber() {
        return Cardnumber;
    }

    /**
     * @param Cardnumber the Cardnumber to set
     */
    public void setCardnumber(String Cardnumber) {
        this.Cardnumber = Cardnumber;
    }

    /**
     * @return the Cardname
     */
    public String getCardname() {
        return Cardname;
    }

    /**
     * @param Cardname the Cardname to set
     */
    public void setCardname(String Cardname) {
        this.Cardname = Cardname;
    }

    /**
     * @return the cvc
     */
    public String getCvc() {
        return cvc;
    }

    /**
     * @param cvc the cvc to set
     */
    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
     
     
}
