/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantalla_home;

/**
 *
 * @author lucho
 */
public class StatsInGame implements Observador{
    public int cantidad =0;
    public int score =0;
        
    @Override
    
    public void update(int a , int b){
        this.cantidad =a;
        this.score=b;
        System.out.println(cantidad+" movimientos ; "+score+" score");
    }
    
    public int mov(){
        return cantidad;
    }
    
    public int score(){
        return score;
    }
    
    
}
