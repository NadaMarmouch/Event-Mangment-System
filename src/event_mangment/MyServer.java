/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_mangment;

/**
 *
 * @author lenovo_pc
 */
import java.io.*;
import java.net.*;

public class MyServer {

    private ServerSocket serversocket;
    private Socket socket;
    private PrintWriter printwriter;
    private BufferedWriter toClient;

    public MyServer() throws IOException {
        serversocket = new ServerSocket(4000);
    }

    public void run() throws IOException {
        socket = serversocket.accept();
        toClient = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        toClient.write("Hi, thanks for contacting us. We've received your message and we will be in touch very soon.");
        toClient.close();
        socket.close();
    }
}
