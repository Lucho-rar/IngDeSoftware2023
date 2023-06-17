/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pantalla_home;



/**
 *
 * @author lucho
 */
public class Pantalla_Home {
    
    public static void main(String[] args) {
        Music_Nav m = new Music_Nav();
        m.performMusic();
        Vista_Config config = new Vista_Config();
        config.setLocationRelativeTo(null);
        config.setVisible(false);
        Vista_Home vistaHome = new Vista_Home(m,config);                
        vistaHome.setLocationRelativeTo(null);
        vistaHome.setVisible(true);
        
//this.setLocationRelativeTo(null);
        
    }
}
