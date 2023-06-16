/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pantalla_home;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;


/**
 *
 * @author lucho
 */
public class Pantalla_Home {
    
    public static void main(String[] args) {
        Music_Nav m = new Music_Nav();
        //m.performMusic();
        Vista_Home vistaHome = new Vista_Home(m);                
        vistaHome.setLocationRelativeTo(null);
        vistaHome.setVisible(true);
        
//this.setLocationRelativeTo(null);
        
    }
}
