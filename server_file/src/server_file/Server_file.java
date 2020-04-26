/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_file;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vishal
 */
public class Server_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ServerSocket s=new ServerSocket(4333);
        Socket sr=s.accept();
         String s1 = JOptionPane.showInputDialog("Enter Path of file the file \n NOTE: Use '\\\' instead of '\\' ");

        FileInputStream fr=new FileInputStream(s1);
        byte b[]=new byte[20002];
        fr.read(b,0,b.length);
        OutputStream os=sr.getOutputStream();
        os.write(b);
    }
    
}
