/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantalla_home;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;

/**
 *
 * @author lucho
 */
public abstract class Music {

    MusicBehavior musicBehavior;
    Clip clip;
    public Music(){
        
    }
    public void setMusicBehavior(MusicBehavior mb){
        musicBehavior = mb;
    }
    
    public boolean performMusic(){
       this.clip =  musicBehavior.sonido();
       return true;
    }
    public void disperformMusic(){
        this.clip.stop();
    }
    public void reanuderMusic(){
        this.clip.start();
    }
    
}
