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
public class User  implements Serializable{
    
           private String FeedBack;
           private String Event_Name;

    /**
     * @return the FeedBack
     */
    public String getFeedBack() {
        return FeedBack;
    }

    /**
     * @param FeedBack the FeedBack to set
     */
    public void setFeedBack(String FeedBack) {
        this.FeedBack = FeedBack;
    }

    /**
     * @return the Event_Name
     */
    public String getEvent_Name() {
        return Event_Name;
    }

    /**
     * @param Event_Name the Event_Name to set
     */
    public void setEvent_Name(String Event_Name) {
        this.Event_Name = Event_Name;
    }
           
    
}
