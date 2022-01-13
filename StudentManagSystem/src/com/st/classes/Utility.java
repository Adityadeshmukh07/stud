/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.st.classes;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author star
 */
public class Utility {
    public static void executeApp(String appname)
    {
         try {
            Runtime obj=Runtime.getRuntime();
            //obj.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            obj.exec("rundll32 SHELL32.DLL,ShellExec_RunDLL "+appname);
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, ex.toString());
        }

    }
    public static void changeBg(JFrame fm,Color c){
        fm.getContentPane().setBackground(c);
    }
    public static void setBorder(JFrame t){
        t.getRootPane().setBorder(new EtchedBorder());
    }
     
}
