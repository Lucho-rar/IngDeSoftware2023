/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantalla_home;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author lucho
 */
public class Music_Home implements MusicBehavior{
    public Clip clip;
    public AudioInputStream audioInput;
    public Clip sonido(){

        try{
            File musicPath = new File("musicHome.wav");
            if(musicPath.exists()){
                this.audioInput = AudioSystem.getAudioInputStream(musicPath);
                this.clip= AudioSystem.getClip();
                this.clip.open(audioInput);
               // if(sonidoMuted==false){
                this.clip.start();
            }else{
                System.out.println("no pude abrir");
            }
            
        }catch(Exception e){
            System.out.println("no pude abreeeeir");
            
        }
        return clip;
    }
    
}
