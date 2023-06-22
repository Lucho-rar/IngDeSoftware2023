/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantalla_home;

/**
 *
 * @author lucho
 */
public class Usuario {
    String usuario;
    String password;
    String rango;
    int puntos;
    int cantidadMovimientos;
    public Usuario(String u,String p, String pts){
        this.usuario=u;
        this.password=p;
        this.puntos = Integer.parseInt(pts);
        this.calculoRango();
    }
    public Usuario(){
        
    }
    
    public void setUsuario(String name){
        usuario= name;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getPassword(){
        return password;
    }
    public int getPuntos(){
        return puntos;
    }
    public String getRango(){
        return rango;
    }

    public int getCantidadMovimientos() {
        return cantidadMovimientos;
    }

    public void setCantidadMovimientos(int cantidadMovimientos) {
        this.cantidadMovimientos += cantidadMovimientos;
    }
    
    public void setRango(int x){
        this.puntos=puntos +x;
        calculoRango();
    }
    public void calculoRango(){
        if(puntos>0 && puntos<1000){
            this.rango="BRONCE";
        }
        else if(puntos>1000 && puntos<3500){
            this.rango="PLATA";
        }else if(puntos>3500 && puntos<5000){
            this.rango="ORO";
        }else{
            this.rango="PLATINO";
        }
    }
    
    
    
}
