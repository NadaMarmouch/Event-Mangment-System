/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;
import java.io.Serializable;
import java.util.Random;
/**
 *
 * @author lenovo_pc
 */
public class Meetings implements Serializable  {
    
    private String Event_name;
    private String Start_time;
    private String End_time;
    private int RoomID;

    Random rand=new Random();
    
    /**
     * @return the Event_name
     */
    public String getEvent_name() {
        return Event_name;
    }

    /**
     * @param Event_name the Event_name to set
     */
    public void setEvent_name(String Event_name) {
        this.Event_name = Event_name;
    }

    /**
     * @return the Start_time
     */
    public String getStart_time() {
        return Start_time;
    }

    /**
     * @param Start_time the Start_time to set
     */
    public void setStart_time(String Start_time) {
        this.Start_time = Start_time;
    }

    /**
     * @return the End_time
     */
    public String getEnd_time() {
        return End_time;
    }

    /**
     * @param End_time the End_time to set
     */
    public void setEnd_time(String End_time) {
        this.End_time = End_time;
    }

    /**
     * @return the RoomID
     */
    public int getRoomID() {
        return RoomID;
    }

    /**
     * @param RoomID the RoomID to set
     */
    public void setRoomID() {
        this.RoomID = rand.nextInt(100);
        
        
        
    }
    
}
