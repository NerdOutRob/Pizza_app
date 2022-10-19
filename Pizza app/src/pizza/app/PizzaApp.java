/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.app;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rhens
 */
public class PizzaApp {

    /**
     * @param args the command line arguments
     */
    String Boxcontent=" ";
    public static void main(String[] args) {
       Color myColor = new Color(139,0,0);
       Frame1 myFrame = new Frame1();
       myFrame.getContentPane().setBackground(myColor);
       myFrame.setVisible(true);
       myFrame.setLocationRelativeTo(null);
       
    }
    
}
