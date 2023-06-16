/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pantalla_home;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author lucho
 */
public class Vista_SeleccionDificultad extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Home
     */
    public Clip clip;
    public AudioInputStream audioInput;
    boolean sonidoMuted = false;
    boolean reglasVisible =false;
    //boolean backReglas
    //this.jLabel1.setVisible(false);
    public Vista_SeleccionDificultad() {
        
       
        initComponents();
        this.setLocationRelativeTo(null);
        //inicioDeSonido("musicHome.wav");
        
    }
   
    public void sonidoFondoInicial(String dir,boolean a){
        //if 
        if(a == false){
            this.clip.stop();
        }else{
            this.clip.start();
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
        boton_back = new javax.swing.JButton();
        boton_muted = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boton_facil = new javax.swing.JButton();
        boton_dificil = new javax.swing.JButton();
        boton_medio = new javax.swing.JButton();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonBack.png"))); // NOI18N
        boton_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_backMouseClicked(evt);
            }
        });
        boton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_backActionPerformed(evt);
            }
        });
        jPanel1.add(boton_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));

        boton_muted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sonidoMuted.jpg"))); // NOI18N
        boton_muted.setBorder(new javax.swing.border.MatteBorder(null));
        boton_muted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_mutedMouseClicked(evt);
            }
        });
        boton_muted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_mutedActionPerformed(evt);
            }
        });
        jPanel1.add(boton_muted, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucho\\Documents\\DAMASCHINASDESIGN\\rayo.gif")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 50, 110));

        boton_facil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonFacil.png"))); // NOI18N
        boton_facil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_facil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_facilMouseClicked(evt);
            }
        });
        boton_facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_facilActionPerformed(evt);
            }
        });
        jPanel1.add(boton_facil, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 120, 50));

        boton_dificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonDificil.png"))); // NOI18N
        boton_dificil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_dificil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_dificilMouseClicked(evt);
            }
        });
        boton_dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_dificilActionPerformed(evt);
            }
        });
        jPanel1.add(boton_dificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 120, 50));

        boton_medio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonMedio.png"))); // NOI18N
        boton_medio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_medio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_medioMouseClicked(evt);
            }
        });
        boton_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_medioActionPerformed(evt);
            }
        });
        jPanel1.add(boton_medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 120, 50));

        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo1.jpg"))); // NOI18N
        jPanel1.add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_mutedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_mutedActionPerformed
        // TODO add your handling code here:
        String filepath = "musicHome.wav";
        
        ImageIcon  icon;
        //icon.
        //new javax.swing.ImageIcon(getClass().getResource("/botonJugar.jpg"));
        icon = new ImageIcon(getClass().getResource("/rojo.jpg"));
        ImageIcon vuelta;
        vuelta = new ImageIcon(getClass().getResource("/sonidoMuted.jpg"));
        
        if(sonidoMuted==false){
            boton_muted.setIcon(icon);
            sonidoFondoInicial(filepath,sonidoMuted);
            sonidoMuted = true;
            
        }else{
            boton_muted.setIcon(vuelta);
            sonidoFondoInicial(filepath,sonidoMuted);
            sonidoMuted = false;
            
        }
    }//GEN-LAST:event_boton_mutedActionPerformed

    private void boton_mutedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_mutedMouseClicked
        // TODO add your handling code here:
        

        //jButton3.setIconImage(icon.getImage());
        //this.setIcon(new javax.swing.ImageIcon());
        
        
        
        
    }//GEN-LAST:event_boton_mutedMouseClicked

    private void boton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_backActionPerformed
        // TODO add your handling code here:
        Vista_SeleccionModo modo = new Vista_SeleccionModo();
        modo.setLocationRelativeTo(null);
        modo.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_boton_backActionPerformed

    private void boton_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_backMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_boton_backMouseClicked

    private void boton_facilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_facilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_facilMouseClicked

    private void boton_facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_facilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_facilActionPerformed

    private void boton_dificilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_dificilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_dificilMouseClicked

    private void boton_dificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_dificilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_dificilActionPerformed

    private void boton_medioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_medioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_medioMouseClicked

    private void boton_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_medioActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_SeleccionDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_SeleccionDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_SeleccionDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_SeleccionDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Vista_SeleccionDificultad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_back;
    private javax.swing.JButton boton_dificil;
    private javax.swing.JButton boton_facil;
    private javax.swing.JButton boton_medio;
    private javax.swing.JButton boton_muted;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_fondo;
    // End of variables declaration//GEN-END:variables
}
