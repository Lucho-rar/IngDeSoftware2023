/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pantalla_home;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author lucho
 */
public class Vista_SeleccionTableroModoFacil extends javax.swing.JFrame implements Sujeto {

    private ArrayList<javax.swing.JButton> arrayBotones;
    public  ArrayList<JButton> publi = new ArrayList<JButton>();
    public  ArrayList<JButton> ocupados = new ArrayList<JButton>();
    public  boolean faltaCompletar = false;
    public  JButton primero = new JButton();
    public  JButton segundo = new JButton();
    private ArrayList<Observador> observadores = new ArrayList<Observador>();
    public  ArrayList<JButton> ganadores = new ArrayList<JButton>();
    public  int cont_mov;
    public  int score;
    
    
    public  Usuario sesion = new Usuario();
    public  Usuario computador = new Usuario();
    
    public  int cont_mov_compu;
    public  int score_compu;
    
/**
     * Creates new form Vista_Home
     */
    public Clip clip;
    public AudioInputStream audioInput;
    Music m ;
    Vista_Config config = new Vista_Config();
    //boolean backReglas
    //this.jLabel1.setVisible(false);
    public Vista_SeleccionTableroModoFacil(Usuario u,Music m,Vista_Config c) {
        this.arrayBotones = new ArrayList<javax.swing.JButton>();
        
        this.m=m;
        this.config=c;
        initComponents();
        this.setLocationRelativeTo(null);
        //inicioDeSonido("musicHome.wav");
        agregarBotones();
        this.userNameLabel.setText(u.getUsuario());
        this.jLabel2.setText(u.getRango());
        this.computerLabel.setText(computador.getUsuario());
        this.jLabel2.setText(computador.getRango());
        this.sesion=u;
        StatsInGame obs = new StatsInGame();
        agregarObs(obs);
        //System.out.println(getBotonLibre().getWidth());
    }
    
   
    public Vista_SeleccionTableroModoFacil() {
        this.arrayBotones = new ArrayList<javax.swing.JButton>();
        
       
        initComponents();
        this.setLocationRelativeTo(null);
        //inicioDeSonido("musicHome.wav");
        agregarBotones();
       
        //System.out.println(getBotonLibre().getWidth());
    }
    

    
    
    public Vista_SeleccionTableroModoFacil(Music m, Vista_Config c){
        this.arrayBotones = new ArrayList<JButton>();
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.m= m;
        this.config=c;
    }
    
    public JButton getBotonLibre(){
        return this.boton_libre;
    }
    
    public JButton getBotonAzul(){
        return this.boton_azul;
    }
    
     public JButton getBotonAamarillo(){
        return this.botonAmarillo;
    }
    
    public void llenarGanadores(){
        ganadores.add(this.jButton4);
        ganadores.add(this.jButton5);
        ganadores.add(this.jButton3);
    }
    
    public void movimiento(JButton x){
        if (this.faltaCompletar==true){
            if(x.getBackground().equals(getBotonLibre().getBackground())){
                this.segundo=x;
                this.faltaCompletar=false;
                hacerMovimiento();
                calculo_mov_score();
                notificar(cont_mov,score);
                this.movimientos.setText(String.valueOf(cont_mov));
                finalizarPartida();
                //score=0;
                
                
            }else{
                this.faltaCompletar=false;
                JOptionPane.showMessageDialog(null,"Movimiento incorrecto!");
                
            }
            
        }else{
            this.primero=x;
            this.faltaCompletar=true;
        }
        
       
        
    }
    
    public void calculo_mov_score(){
        //score=0;
        cont_mov++;
        //if(this.segundo.getBackground().equals(getBotonAzul().getBackground())){
        //    score++;
        //}
        
                
            
        
        
        
        
    }
    
    public void actualizarOcupados(){
        ocupados.clear();
        for (int i =0;i<arrayBotones.size();i++){
            if(!arrayBotones.get(i).getBackground().equals(getBotonLibre().getBackground())){
                ocupados.add(arrayBotones.get(i));
            }
        }
        int contador =0;
        for (int i =0;i<arrayBotones.size();i++){
            
            if(arrayBotones.get(i).equals(this.jButton4) && arrayBotones.get(i).getBackground().equals(this.boton_azul.getBackground())){
                contador++;
            }else if(arrayBotones.get(i).equals(this.jButton5) && arrayBotones.get(i).getBackground().equals(this.boton_azul.getBackground())){
                contador++;
            }else if(arrayBotones.get(i).equals(this.jButton3) && arrayBotones.get(i).getBackground().equals(this.boton_azul.getBackground())){
                contador++;
            }
        }
        this.score=contador;
    }
    
    public void hacerMovimiento(){
        for(int i =0; i<arrayBotones.size();i++){
            if(arrayBotones.get(i).equals(segundo)){
                arrayBotones.get(i).setBackground(primero.getBackground());
            }
        }
        primero.setBackground(getBotonLibre().getBackground());
        actualizarOcupados();
    }
    
    public void agregarBotones(){

 
        arrayBotones.add(this.jButton3);
        arrayBotones.add(this.jButton2);
        arrayBotones.add(jButton4);
        arrayBotones.add(this.jButton5);
        arrayBotones.add(this.jButton6);
        arrayBotones.add(this.jButton7);
        arrayBotones.add(this.jButton9);
        arrayBotones.add(this.jButton10);
        arrayBotones.add(this.jButton11);
        arrayBotones.add(this.jButton12);
        arrayBotones.add(this.jButton13);
        arrayBotones.add(this.jButton14);
        arrayBotones.add(this.jButton15);
        arrayBotones.add(this.jButton16);
        arrayBotones.add(this.jButton17);
        arrayBotones.add(this.jButton18);
        arrayBotones.add(this.jButton19);
        arrayBotones.add(this.jButton20);
        arrayBotones.add(this.jButton21);
        arrayBotones.add(this.jButton22);
        arrayBotones.add(this.jButton23);
        arrayBotones.add(this.jButton24);
        arrayBotones.add(this.jButton25);
        arrayBotones.add(this.jButton26);
        arrayBotones.add(this.jButton27);
        arrayBotones.add(this.jButton28);
        arrayBotones.add(this.jButton30);
        arrayBotones.add(this.jButton31);
        arrayBotones.add(this.jButton32);
        arrayBotones.add(this.jButton33);
        arrayBotones.add(this.jButton34);
        arrayBotones.add(this.jButton35);
        arrayBotones.add(this.jButton36);
        arrayBotones.add(this.jButton37);
        arrayBotones.add(this.jButton38);
        arrayBotones.add(this.jButton39);
        arrayBotones.add(this.jButton40);
        arrayBotones.add(this.jButton41);
        arrayBotones.add(this.jButton42);
        arrayBotones.add(this.jButton43);
        arrayBotones.add(this.jButton44);
        arrayBotones.add(this.jButton45);
        arrayBotones.add(this.jButton46);
        arrayBotones.add(this.jButton47);
        arrayBotones.add(this.jButton48);
        arrayBotones.add(this.jButton49);
        arrayBotones.add(this.jButton50);
        arrayBotones.add(this.jButton51);
        arrayBotones.add(this.jButton53);
        
    }
    
    
    public void analizarBotones(){
        
        for (int i =0;i<arrayBotones.size();i++){
            if(!arrayBotones.get(i).getBackground().equals(getBotonLibre().getBackground())){
                ocupados.add(arrayBotones.get(i));
            }
        }
        
        System.out.println(ocupados.size());
      
    }
    
 
   /* Getters para test */
    
    @Override
    
    public void notificar(int a, int b){
        for(int i =0;i<observadores.size();i++){
            observadores.get(i).update(a,b);
            
            
        }
    }
    
    public void agregarObs(Observador o ){
        this.observadores.add(o);
    }
    
    
    public void finalizarPartida(){
        if(this.jButton3.getBackground().equals(getBotonAzul().getBackground()) &&
                this.jButton5.getBackground().equals(getBotonAzul().getBackground()) &&
                 this.jButton4.getBackground().equals(getBotonAzul().getBackground())){
            JOptionPane.showMessageDialog(null, "Felicitaciones! Partida finalizada, tus puntos se acumularan");
            this.sesion.setRango(8000);
            Vista_Home home = new Vista_Home(m,config);
            home.setLocationRelativeTo(null);
            home.setVisible(true);
            this.dispose();
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_config = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        computerLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titulo_mov = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        home = new javax.swing.JButton();
        movimientos = new javax.swing.JLabel();
        label_fondo1 = new javax.swing.JLabel();
        boton_azul = new javax.swing.JButton();
        boton_libre = new javax.swing.JButton();
        botonAmarillo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonConfig.png"))); // NOI18N
        boton_config.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_configActionPerformed(evt);
            }
        });
        jPanel1.add(boton_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 50, 50));

        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 30, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 30, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 30, 30));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 30, 30));

        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 30, 30));

        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 30, 30));

        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 30, 30));

        jButton10.setBackground(new java.awt.Color(204, 0, 204));
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 30, 30));

        jButton11.setBackground(new java.awt.Color(204, 255, 255));
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 30, 30));

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 30, 30));

        jButton13.setBackground(new java.awt.Color(204, 255, 255));
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 30, 30));

        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 30, 30));

        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 30, 30));

        jButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 30, 30));

        jButton17.setForeground(new java.awt.Color(204, 0, 204));
        jButton17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 30, 30));

        jButton18.setBackground(new java.awt.Color(204, 0, 204));
        jButton18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 30, 30));

        jButton19.setBackground(new java.awt.Color(204, 0, 204));
        jButton19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 30, 30));

        jButton20.setBackground(new java.awt.Color(255, 204, 204));
        jButton20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 30, 30));

        jButton21.setBackground(new java.awt.Color(255, 204, 204));
        jButton21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 30, 30));

        jButton22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 30, 30));

        jButton23.setBackground(new java.awt.Color(204, 255, 204));
        jButton23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 30, 30));

        jButton24.setBackground(new java.awt.Color(204, 255, 255));
        jButton24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 30, 30));

        jButton25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 30, 30));

        jButton26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 30, 30));

        jButton27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 30, 30));

        jButton28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 30, 30));

        jButton30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 30, 30));

        jButton31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 30, 30));

        jButton32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 30, 30));

        jButton33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 30, 30));

        jButton34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 30, 30));

        jButton35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 30, 30));

        jButton36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 30, 30));

        jButton37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 30, 30));

        jButton38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 30, 30));

        jButton39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 30, 30));

        jButton40.setBackground(new java.awt.Color(204, 255, 204));
        jButton40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 30, 30));

        jButton41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 30, 30));

        jButton42.setBackground(new java.awt.Color(204, 255, 204));
        jButton42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 30, 30));

        jButton43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 30, 30));

        jButton44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 30, 30));

        jButton45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 30, 30));

        jButton46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 30, 30));

        jButton47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 30, 30));

        jButton48.setBackground(new java.awt.Color(0, 0, 204));
        jButton48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 30, 30));

        jButton49.setBackground(new java.awt.Color(0, 0, 204));
        jButton49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 30, 30));

        jButton50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 30, 30));

        jButton51.setBackground(new java.awt.Color(0, 0, 204));
        jButton51.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 30, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Bebas", 1, 48)); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        jButton53.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 30, 30));

        userNameLabel.setFont(new java.awt.Font("Bebas", 1, 36)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 255, 255));
        userNameLabel.setText("userName");
        jPanel1.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 170, 60));

        computerLabel.setFont(new java.awt.Font("Bebas", 1, 36)); // NOI18N
        computerLabel.setForeground(new java.awt.Color(0, 255, 255));
        computerLabel.setText("computer");
        jPanel1.add(computerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 170, 60));

        jLabel2.setFont(new java.awt.Font("Bebas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bebas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        titulo_mov.setFont(new java.awt.Font("Bebas", 1, 36)); // NOI18N
        titulo_mov.setForeground(new java.awt.Color(255, 255, 255));
        titulo_mov.setText("MOVIMIENTOS");
        jPanel1.add(titulo_mov, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 200, 60));

        exit.setBackground(new java.awt.Color(204, 0, 0));
        exit.setFont(new java.awt.Font("Bebas", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, -1, -1));

        home.setBackground(new java.awt.Color(255, 153, 0));
        home.setFont(new java.awt.Font("Bebas", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, -1, -1));

        movimientos.setFont(new java.awt.Font("Bebas", 1, 48)); // NOI18N
        movimientos.setForeground(new java.awt.Color(255, 255, 255));
        movimientos.setText("0");
        jPanel1.add(movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        label_fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoFacil.jpg"))); // NOI18N
        jPanel1.add(label_fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        boton_azul.setBackground(new java.awt.Color(0, 0, 204));
        boton_azul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_azulActionPerformed(evt);
            }
        });
        jPanel1.add(boton_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 30, 30));

        boton_libre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_libre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_libreActionPerformed(evt);
            }
        });
        jPanel1.add(boton_libre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 30, 30));

        botonAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        botonAmarillo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAmarilloActionPerformed(evt);
            }
        });
        jPanel1.add(botonAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_configActionPerformed
        // TODO add your handling code here:\
        // this.musicaH.sonar(0);

        this.config.setVisible(true);
        this.config.recibirMusica(m);
        /*this.m.disperformMusic();*/
    }//GEN-LAST:event_boton_configActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton2) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton2);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton3) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton3);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       
        if(!ocupados.contains(jButton4) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton4);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        if(!ocupados.contains(jButton5) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton5);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton6) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton6);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton7) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton7);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton9) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton9);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton10) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton10);
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton11) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton11);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton12) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton12);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton13) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton13);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton14) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton14);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton15) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton15);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton16) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton16);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton17) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton17);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton18) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton18);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton19) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton19);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton20) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton20);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton21) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton21);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        
        if(!ocupados.contains(jButton22) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton22);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton23) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton23);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton24) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton24);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton25) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton25);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton26) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton26);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton27) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton27);
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton28) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton28);
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton30) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton30);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton31) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton31);
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton32) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton32);
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton33) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton33);
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton34) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton3);
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton35) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton35);
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton36) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton36);
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton37) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton37);
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton38) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton38);
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton39) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton39);
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton40) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton40);
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton41) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton41);
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton42) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton42);
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton43) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton43);
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton44) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton44);
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton45) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton45);
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton46) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton46);
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton47) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton47);
        }
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton48) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton48);
        }
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:\
        if(!ocupados.contains(jButton49) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton49);
        }
        
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton50) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton50);
        }
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton51) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton51);
        }
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:\
       this.cont_mov=0;
       analizarBotones();
       jButton1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        if(!ocupados.contains(jButton53) && faltaCompletar ==false){
            JOptionPane.showMessageDialog(null, "No hay ficha");
        }else{
            movimiento(jButton53);
        }
        
    }//GEN-LAST:event_jButton53ActionPerformed

    private void boton_azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_azulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_azulActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Vista_Home home = new Vista_Home(m,config);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void boton_libreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_libreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_libreActionPerformed

    private void botonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAmarilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAmarilloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_SeleccionTableroModoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_SeleccionTableroModoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_SeleccionTableroModoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_SeleccionTableroModoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_SeleccionTableroModoFacil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAmarillo;
    private javax.swing.JButton boton_azul;
    private javax.swing.JButton boton_config;
    private javax.swing.JButton boton_libre;
    private javax.swing.JLabel computerLabel;
    private javax.swing.JButton exit;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_fondo1;
    private javax.swing.JLabel movimientos;
    private javax.swing.JLabel titulo_mov;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
