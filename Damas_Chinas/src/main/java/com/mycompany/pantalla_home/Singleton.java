/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantalla_home;

/**
 *
 * @author lucho
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton() {
        Music_Nav m = new Music_Nav();
        m.performMusic();
        Vista_Config config = new Vista_Config();
        config.setLocationRelativeTo(null);
        config.setVisible(false);
        Vista_Home vistaHome = new Vista_Home(m,config);                
        vistaHome.setLocationRelativeTo(null);
        vistaHome.setVisible(true);
    }
    
    public static Singleton getInstance(){
        if(uniqueInstance ==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    
}
