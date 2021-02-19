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
public class Record implements Serializable{
    
    private String Event_Name;
    private String Name;
    private String ID;
    private String Major;

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

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the Major
     */
    public String getMajor() {
        return Major;
    }

    /**
     * @param Major the Major to set
     */
    public void setMajor(String Major) {
        this.Major = Major;
    }
    
}
