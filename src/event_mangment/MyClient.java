/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;

import java.io.*;
import java.net.*;

public class MyClient {

    private Socket socket;
    private InputStream is;
    private BufferedReader fromServer;
    static final int Server_Port_Number = 4000;

    public void run() {
        try {
        socket = new Socket("localhost", Server_Port_Number);
            fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Server said: " + fromServer.readLine());
            fromServer.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Trouble Contacting the server " + e);
        }

    }
}