/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantalla_home;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Container;
import java.awt.Insets;
import static java.lang.Boolean.TRUE;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import static java.lang.Boolean.TRUE;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author cpvic
 */
public class GridTeclas extends JFrame {

   
       JPanel[] panelesPrincipales= new JPanel[17];;
       JPanel panelSup;
    //   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bA,b11,b12,b13,b14;
       JButton[] botones = new JButton[27];
      JTextField campoTexto;
   
       public GridTeclas(){
           creandoPanel();
        //   creandoPanelSup();
            setBounds(100,100,1500,100);
            Container contPanel= getContentPane();
            contPanel.setLayout(new GridLayout(27,15 ));
           //this.setLayout(new GridLayout(15,15 ));
           
           
           for(int k=0; k<panelesPrincipales.length; k++){
               this.add(panelesPrincipales[k]);  
               }
           //this.add(panelSup);
           this.setVisible(TRUE);
           this.pack(); //todos los elementos quepan en el frame
       }
       
       public void creandoPanelSup(){
           campoTexto= new JTextField();
           panelSup= new JPanel();
           panelSup.setLayout(new FlowLayout());
           panelSup.add(campoTexto);
       }
       int valor=1;
       public void creandoPanel(){
        
         
           JButton botonBlanco,botonRojo;
           botonBlanco=new JButton("")  ;
           botonRojo=new JButton("");
           botonBlanco.setBackground(Color.white);
           botonRojo.setBackground(Color.red);
  
           
            int alto=17;
            int ancho=27;
            JButton[][] fichas= new JButton[alto][ancho];
   
            
            
             for(int i=0; i<alto; i++){
                for(int j=0; j<ancho; j++){
                        
             //medio horizontal       
              if(i==(alto/2)  && (j!=0)&& (j!=1)&& (j!=2)&& (j!=3)  && j!=(ancho-1) && j!=(ancho-2) && j!=(ancho-3)  && j!=(ancho-4) )
              { fichas[i][j] =new JButton("0") ;
                fichas[i][j].setBackground(Color.white); 
              }
              
              //RELLENAR FICHAS 1
              //medio vertical
              else if(j==(ancho/2))
               if(i<4) 
                        {
                          fichas[i][j] =new JButton("C") ;    
                        fichas[i][j].setBackground(Color.red);    
                        }
                  else if(i>(alto-5)) 
                        {fichas[i][j] =new JButton("Y") ;
                         fichas[i][j].setBackground(Color.yellow);    
                        } 
                   else
                        {fichas[i][j] =new JButton("") ;
                         fichas[i][j].setBackground(Color.white);  
                        
                        }  
              
              else if(j==(ancho/2 +1 ) && i!=0 && i!=alto-1 )
              if(i<4) 
                        {fichas[i][j] =new JButton("C") ;
                         fichas[i][j].setBackground(Color.red);    
                        }
                  else if(i>(alto-5)) 
                        {fichas[i][j] =new JButton("Y") ;
                         fichas[i][j].setBackground(Color.yellow);    
                        } 
                   else
                        {fichas[i][j] =new JButton("") ;
                         fichas[i][j].setBackground(Color.white);     
                        }  
                  
              else if(j==(ancho/2 -1 ) && i!=0 && i!=alto-1 ) 
             {   if(i<4) 
                        {
                 
                         fichas[i][j] =new JButton("C") ;
                         fichas[i][j].setBackground(Color.red);    
                        }
                  else if(i>(alto-5)) 
                        {fichas[i][j] =new JButton("Y") ;
                         fichas[i][j].setBackground(Color.yellow);    
                        } 
                   else
                        {fichas[i][j] =new JButton("") ;
                         fichas[i][j].setBackground(Color.white);   
                
                        }    
              }
              else if(j==(ancho/2 +2 ) && i!=0 && i!=alto-1 )
             {   if(i<4) 
                        {fichas[i][j] =new JButton("C") ;
                         fichas[i][j].setBackground(Color.red);    
                        }
                  else if(i>(alto-5)) 
                        {fichas[i][j] =new JButton("Y") ;
                         fichas[i][j].setBackground(Color.yellow);    
                        } 
                   else
                        {fichas[i][j] =new JButton("") ;
                         fichas[i][j].setBackground(Color.white);  
                        }   
              }
              else if(j==(ancho/2 -2 ) && i!=0 && i!=alto-1 )
              {   if(i<4) 
                        {fichas[i][j] =new JButton("C") ;
                         fichas[i][j].setBackground(Color.red);    
                        }
                  else if(i>(alto-5)) 
                        {fichas[i][j] =new JButton("Y") ;
                         fichas[i][j].setBackground(Color.yellow);    
                        } 
                   else
                        {fichas[i][j] =new JButton("") ;
                         fichas[i][j].setBackground(Color.white); 
                        }   
              }
              else if(j==(ancho/2 +3 ) && i!=0 && i!=1 && i!=alto-1 && i!=alto-2 )
              {   if(i<4) 
                        {fichas[i][j] =new JButton("C") ;
                         fichas[i][j].setBackground(Color.red);    
                  
                        }
                  else if(i>(alto-5)) 
                        {fichas[i][j] =new JButton("Y") ;
                         fichas[i][j].setBackground(Color.yellow);    
                        } 
                   else
                        {fichas[i][j] =new JButton("") ;
                         fichas[i][j].setBackground(Color.white);     
                        }    
              }
              else if(j==(ancho/2 -3 ) && i!=0 && i!=1 && i!=alto-1 && i!=alto-2 )
              {   if(i<4) 
                        {fichas[i][j] =new JButton("C") ;
                         fichas[i][j].setBackground(Color.red);    
                        }
                  else if(i>(alto-5)) 
                        {fichas[i][j] =new JButton("Y") ;
                         fichas[i][j].setBackground(Color.yellow);    
                        } 
                   else
                        {fichas[i][j] =new JButton("") ;
                         fichas[i][j].setBackground(Color.white);    
                        }  
              }
              
              /************************************************************************/
              
              else if(j==(ancho/2 +4 ) && i!=0 && i!=1 && i!=2 && i!=alto-1 && i!=alto-2 && i!=alto-3 )
                  { fichas[i][j] =new JButton("") ;
                    fichas[i][j].setBackground(Color.white);    }
              else if(j==(ancho/2 -4 ) && i!=0 && i!=1 && i!=2 && i!=alto-1 && i!=alto-2 && i!=alto-3)
                  { fichas[i][j] =new JButton("") ;
                    fichas[i][j].setBackground(Color.white); ;    }
              else if(j==(ancho/2 +5 ) && i!=0 && i!=1 && i!=2 && i!=3 && i!=alto-1 && i!=alto-2 && i!=alto-3 && i!=alto-4)
                  {fichas[i][j] =new JButton("") ;
                   fichas[i][j].setBackground(Color.white);   }
              else if(j==(ancho/2 -5 ) && i!=0 && i!=1 && i!=2 && i!=3 && i!=alto-1 && i!=alto-2 && i!=alto-3 && i!=alto-4)
                  {fichas[i][j] =new JButton("") ;
                   fichas[i][j].setBackground(Color.white);    }
             
             //Para eliminar
              else if(j==(ancho/2 +6 ) && i!=0 && i!=1 && i!=2 && i!=3 && i!=4 && i!=alto-1 && i!=alto-2 && i!=alto-3 && i!=alto-4 && i!=alto-5)
                  { fichas[i][j] =new JButton("") ;
                fichas[i][j].setBackground(Color.white);    }
              else if(j==(ancho/2 -6 ) && i!=0 && i!=1 && i!=2 && i!=3 && i!=4 && i!=alto-1 && i!=alto-2 && i!=alto-3 && i!=alto-4 && i!=alto-5)
                  { fichas[i][j] =new JButton("") ;
                fichas[i][j].setBackground(Color.white);    }
              else if(j==(ancho/2 +7 ) && i!=0 && i!=1 && i!=2 && i!=3 && i!=4 && i!=5 && i!=alto-1 && i!=alto-2 && i!=alto-3 && i!=alto-4 && i!=alto-5 && i!=alto-6)
                  { fichas[i][j] =new JButton("") ;
                fichas[i][j].setBackground(Color.white);    }
              else if(j==(ancho/2 -7 ) && i!=0 && i!=1 && i!=2 && i!=3 && i!=4 && i!=5 && i!=alto-1 && i!=alto-2 && i!=alto-3 && i!=alto-4 && i!=alto-5 && i!=alto-6)
              { fichas[i][j] =new JButton("") ;
                fichas[i][j].setBackground(Color.white);    }
       
              
              else if(i==(alto/2+1)  && (j!=0) && (j!=1)&& (j!=2) && j!=(ancho-1)&& j!=(ancho-2)&& j!=(ancho-3) )
                  {   if(j<5 ){
                      fichas[i][j] =new JButton("A") ;
                      fichas[i][j].setBackground(Color.green); }
                  else {fichas[i][j] =new JButton("A") ;
                      fichas[i][j].setBackground(new Color(182, 159, 255));    }
                  }
              else if(i==(alto/2+2)  && (j!=0) && (j!=1)&& j!=(ancho-1) && j!=(ancho-2))
                  {   if(j<6 ){
                      fichas[i][j] =new JButton("A") ;
                      fichas[i][j].setBackground(Color.green); }
                  else {fichas[i][j] =new JButton("A") ;
                      fichas[i][j].setBackground(new Color(182, 159, 255));    }
                  }
              else if( i==(alto/2+3) && (j!=0) && j!=(ancho-1) )
                   {   if(j<7 ){
                      fichas[i][j] =new JButton("A") ;
                      fichas[i][j].setBackground(Color.green); }
                  else {fichas[i][j] =new JButton("A") ;
                      fichas[i][j].setBackground(new Color(182, 159, 255));    }
                  }
              else if(i==(alto/2+4) )
                   {   if(j<8 ){
                      fichas[i][j] =new JButton("A") ;
                      fichas[i][j].setBackground(Color.green); }
                  else {fichas[i][j] =new JButton("A") ;
                      fichas[i][j].setBackground(new Color(182, 159, 255));    }
                  }
              // definiendo color NARANJA Y CELESTE
              else if( i==(alto/2-1) && (j!=0) && (j!=1)&& (j!=2) && j!=(ancho-1)&& j!=(ancho-2) && j!=(ancho-3) )
                  { if(j<5 )
                  {fichas[i][j] =new JButton("F") ;
                    fichas[i][j].setBackground(new Color(64, 207, 255));
                  }  
                  else   
                  {
                  fichas[i][j] =new JButton("B") ;
                    fichas[i][j].setBackground(Color.orange);      
                  }}
              else if( i==(alto/2-2) && (j!=0) && (j!=1) && j!=(ancho-1) && j!=(ancho-2) )
                 { if(j<6 )
                  {fichas[i][j] =new JButton("F") ;
                    fichas[i][j].setBackground(new Color(64, 207, 255));
                  }  
                  else   
                  {
                  fichas[i][j] =new JButton("B") ;
                    fichas[i][j].setBackground(Color.orange);      
                  }}
              else if(  i==(alto/2-3) && (j!=0)  && j!=(ancho-1))
                  { if(j<7 )
                  {fichas[i][j] =new JButton("F") ;
                    fichas[i][j].setBackground(new Color(64, 207, 255));
                  }  
                  else   
                  {
                  fichas[i][j] =new JButton("B") ;
                    fichas[i][j].setBackground(Color.orange);      
                  }}
              else if(( i==(alto/2-4))  )
                  { if(j<8 )
                  {fichas[i][j] =new JButton("F") ;
                    fichas[i][j].setBackground(new Color(64, 207, 255));
                  }  
                  else   
                  {
                  fichas[i][j] =new JButton("B") ;
                    fichas[i][j].setBackground(Color.orange);      
                  }}
              
              
              
              
              
              else { fichas[i][j] =new JButton("") ;
                fichas[i][j].setBackground(Color.gray);  
               fichas[i][j].setVisible(false);
              }
              
              
              
               //SE REPITE CODIGO PERO NECESITO DIFERENCIAR, despues se sobreescribe
              if((i==0 ||i==1 ||i==2 ||i==3 || i==alto-1 || i==alto-2 || i==alto-3|| i==alto-4 )&& fichas[i][j].equals("D"))  
              { fichas[i][j] =new JButton("C") ;
                fichas[i][j].setBackground(Color.red);    
              }
           
            }
         }
             
             
               for(int i=0; i<panelesPrincipales.length; i++){
                panelesPrincipales[i] =new JPanel(new GridLayout(0,27,0,0));
               
               for(int j=0; j<botones.length; j++){
                   
                    if(i%2==0 && j%2==0)
                    {botones[j]=new JButton("") ;
                     botones[j].setBackground(Color.gray);  
                    panelesPrincipales[i].add(botones[j]);
                        botones[j].setVisible(false);
                    botones[j].setMargin(new Insets(0,0,1,1));
                    // this.setVisible(FALSE);
                    }
                    else if(i%2==0 && (j%2)!=0)
                    {botones[j]=fichas[i][j]  ;
                    panelesPrincipales[i].add(botones[j]);
                    botones[j].setMargin(new Insets(1,1,1,1));
                   
                    }
                    else if((i%2)!=0 && j%2==0)
                    {botones[j]=fichas[i][j]  ;
                    panelesPrincipales[i].add(botones[j]);
                    botones[j].setMargin(new Insets(1,1,1,1));
                    
                    }
                    else 
                    {botones[j]=new JButton("") ;
                    panelesPrincipales[i].add(botones[j]);
                     botones[j].setBackground(Color.gray);
                     botones[j].setVisible(false);
                    botones[j].setMargin(new Insets(0,0,1,1));
                      
                    }
                  
             } 
               
           /*     
            for(int u=0; u<alto; u++){
                for(int l=0; l<ancho; l++){
                    if(u%2==0 && l%2==0)
                    System.out.print(" ");
                    else if(u%2==0 && (l%2)!=0)
                    System.out.print(fichas[u][l]);
                    else if((u%2)!=0 && l%2==0)
                    System.out.print(fichas[u][l]);
                    else 
                    System.out.print(" ");
            }
                System.out.println();
            }*/
        }
           
           
           
           
         /*  panelPrincipal=new JPanel(new GridLayout(0,12,8,8));
           
           for(int i=0; i<botones.length; i++){
        
               botones[i]=new JButton("" + valor++)  ;
               panelPrincipal.add(botones[i]);
               botones[i].setMargin(new Insets(1,1,1,1));
           //    botones[i].addActionListener(this);
             } 
             /*
          
           
           
        /*  b1 = new JButton("1");
          b2 = new JButton("2");
          b3 = new JButton("3");
          b4 = new JButton("4");
          b5 = new JButton("5");
          b6 = new JButton("6");
          b7 = new JButton("7");
          b8 = new JButton("8");
          b9 = new JButton("9");
          bA = new JButton("10");
          b11 = new JButton("11");
          b12 = new JButton("12");
          b13 = new JButton("13");
          b14 = new JButton("14");
       
          panelPrincipal.add(b1); 
          panelPrincipal.add(b2); 
          panelPrincipal.add(b3); 
          panelPrincipal.add(b4); 
          panelPrincipal.add(b5); 
          panelPrincipal.add(b6); 
          panelPrincipal.add(b7); 
          panelPrincipal.add(b8); 
          panelPrincipal.add(b9); 
          panelPrincipal.add(bA); 
          panelPrincipal.add(b11); 
          panelPrincipal.add(b12); 
          panelPrincipal.add(b13); 
          panelPrincipal.add(b14); 
      */
                      

          
       }
       
    
}
