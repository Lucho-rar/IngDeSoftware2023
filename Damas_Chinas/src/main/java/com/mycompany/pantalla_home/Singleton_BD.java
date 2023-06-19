/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantalla_home;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
/**
 *
 * @author lucho
 */
public class Singleton_BD {
    
    private static Singleton_BD uniqueInstance;
    public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    Usuario top1,top2,top3;
    private Singleton_BD() {
            try{
            File archivo = new File("log.txt");
            FileReader lector = new FileReader (archivo);
            BufferedReader buffer = new BufferedReader(lector);
            FileWriter escritor = new FileWriter(archivo,true);
            String linea;
            while ((linea=buffer.readLine())!=null){
                String[] partes = linea.split(" ");
                Usuario user = new Usuario(partes[0],partes[1],partes[2]);
                usuarios.add(user);
            }
            buffer.close();
            lector.close();
            escritor.close();
        
           
        }catch(Exception e){
            System.out.println("Error con el log");
        }
    }
    
    public ArrayList<Usuario> getLista(){
        return usuarios;
    }
    
    public void imprimirLista(){
        for (int i =0;i<usuarios.size();i++){
            System.out.println("Usuario "+usuarios.get(i).getUsuario()+" Psw "+usuarios.get(i).getPassword());
        }
    }
    
    public void agregarUsuario(Usuario u ){
        this.usuarios.add(u);
    }
    
    public void calcularTOP1(){
        int max =0;
        Usuario auxiliar = new Usuario();
        for (int i =0;i<usuarios.size();i++){
            if(usuarios.get(i).getPuntos() > max){
                auxiliar = usuarios.get(i);
                max = usuarios.get(i).getPuntos();
            }
        }
        this.top1=auxiliar;
    }
    public void calcularTOP2(){
        int max =0;
        Usuario auxiliar = new Usuario();
        for (int i =0;i<usuarios.size();i++){
            if(usuarios.get(i).getPuntos() > max && !(usuarios.get(i).equals(top1))){
                auxiliar = usuarios.get(i);
                max = usuarios.get(i).getPuntos();
            }
        }
        this.top2=auxiliar;
    }
    
    public void calcularTOP3(){
        int max =0;
        Usuario auxiliar = new Usuario();
        for (int i =0;i<usuarios.size();i++){
            if(usuarios.get(i).getPuntos() > max && !(usuarios.get(i).equals(top1))
                    && !(usuarios.get(i).equals(top2))){
                auxiliar = usuarios.get(i);
                max = usuarios.get(i).getPuntos();
            }
        }
        this.top3=auxiliar;
    }
    
    public Usuario getTOP1(){
        return top1;
    }
    
    public Usuario getTOP2(){
        return top2;
    }
    
    public Usuario getTOP3(){
        return top3;
    }
    public void actualizarLog(){
       // Usuario nu = new Usuario("Leonidas","Pujato");
       // this.usuarios.add(nu);
        try{
            File archivoAnt = new File("log.txt");   
            archivoAnt.delete();
            File archivo = new File("log.txt");
            FileWriter escritor = new FileWriter(archivo,true);
            //escritor.flush();
            String linea;
            for (int i =0; i<usuarios.size();i++){
                escritor.write(usuarios.get(i).getUsuario()+" "+usuarios.get(i).getPassword()+" "+usuarios.get(i).getPuntos());
                escritor.write("\n");
                //JOptionPane.showMessageDialog(null, "¡Registro correcto!");
            }
            escritor.close();
            //archivo.delete();
        }catch(Exception e){
            System.out.println("Error con el log");
       }
    }

    
    public static Singleton_BD getInstance(){
        if(uniqueInstance ==null){
            uniqueInstance = new Singleton_BD();
        }
        return uniqueInstance;
    }
    
}
