/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_file;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vishal
 */
public class Client_file {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        byte []b=new byte[20002];
        Socket sr=new Socket("localhost",4333);
        InputStream is=sr.getInputStream();
        FileOutputStream fr;
        String s = JOptionPane.showInputDialog("Enter Path where you want to save the file \n NOTE: Use '\\\' instead of '\\' ");
        fr = new FileOutputStream(s);
        is.read(b,0,b.length);
        fr.write(b,0,b.length);
        
    }
    
}
