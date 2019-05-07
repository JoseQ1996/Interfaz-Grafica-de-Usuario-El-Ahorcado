/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ups.edu.Vista;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author José Quinde
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    ImageIcon primera=new ImageIcon(getClass().getResource("/ec/ups/edu/Imagenes/primera.PNG"));
    ImageIcon segunda=new ImageIcon(getClass().getResource("/ec/ups/edu/Imagenes/segunda.PNG"));
    ImageIcon tercera=new ImageIcon(getClass().getResource("/ec/ups/edu/Imagenes/tercera.PNG"));
    ImageIcon cuarta=new ImageIcon(getClass().getResource("/ec/ups/edu/Imagenes/cuarta.PNG"));
    ImageIcon quinta=new ImageIcon(getClass().getResource("/ec/ups/edu/Imagenes/quinta.PNG"));
    ImageIcon sexta=new ImageIcon(getClass().getResource("/ec/ups/edu/Imagenes/sexta.PNG"));
    Random generadorAleatorios = new Random();
    int opcion=0;
    int cont=0;
    int l=0;
    /**
     * Constructor que inicializa los objetos
     */
    public VentanaPrincipal() {
        initComponents();
        cont=1;
        Icon icono = new ImageIcon(primera.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)); 
        jLabel1.setIcon(icono);
        //genera un numero entre 1 y 10 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(10);
        //Compara un switch para escojer palabra con el numero randomico generado del 1 al 10
        switch(numeroAleatorio){
            case 1:
               jLabel3.setText("Deporte");
               LabelPalabra.setText("--t---");
               opcion=1;
                break;
            case 2:
                jLabel3.setText("Carrera Universitaria");
                LabelPalabra.setText("-o-------o-");
                opcion=2;
                break;
            case 3:
                jLabel3.setText("Animal");
                LabelPalabra.setText("-e---");
                opcion=3;
                break;
            case 4:
                jLabel3.setText("Para Contartarse");
                LabelPalabra.setText("--l-l--");
                opcion=4;
                break;
            case 5:
                jLabel3.setText("Fiesta de todo el mundo");
                LabelPalabra.setText("----d-d");
                opcion=5;
                break;
            case 6:
                jLabel3.setText("Pais Europeo");
                LabelPalabra.setText("a---a--a");
                opcion=6;
                break;
            case 7:
                jLabel3.setText("Capital de la moda");
                LabelPalabra.setText("-a---");
                opcion=7;
                break;
            case 8:
                jLabel3.setText("Fruta");
                LabelPalabra.setText("---s-");
                opcion=8;
                break;
            case 9:
                jLabel3.setText("Tipo de musica");
                LabelPalabra.setText("s--s-");
                opcion=9;
                break;    
            case 10:
               jLabel3.setText("Lugar de la casa");
                LabelPalabra.setText("-o----");
                opcion=10;
                break;    
        }
    }
    /**
     * Metodo que cambia el jLabel hasta que el jugador pierda
     */
    public void pierde(){
        switch(cont){
                  case 1:
                      Icon icono1 = new ImageIcon(segunda.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)); 
                      jLabel1.setIcon(icono1);
                      
                      break;
                  case 2:
                      Icon icono2 = new ImageIcon(tercera.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)); 
                      jLabel1.setIcon(icono2);
                      
                      break;
                  case 3:
                      Icon icono3 = new ImageIcon(cuarta.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)); 
                      jLabel1.setIcon(icono3);
                      
                      break;
                  case 4:
                      Icon icono4 = new ImageIcon(quinta.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)); 
                      jLabel1.setIcon(icono4);
                      
                      break;
                  case 5:
                      Icon icono5 = new ImageIcon(sexta.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)); 
                      jLabel1.setIcon(icono5);
                      
                      break;
                  case 6:
                      JOptionPane.showMessageDialog(this, "Ha perdido","GAME-OVER",JOptionPane.OK_OPTION);
                      new VentanaPrincipal().setVisible(true);
              }
              
    }
    /**
     * Metodo que indica si el jugador completo la palabra gana y reinicia
     */
    public void gana(){
        JOptionPane.showMessageDialog(this, "Felicidades ha completado la palabra","GANADOR",JOptionPane.OK_OPTION);
        opcion=0;
        l=0;
        new VentanaPrincipal().setVisible(true);
       
        
    }
    /**
     * Metodo para jugar con la palabra futbol, compara la letra ingresada con cada letra hasta que gane o pierda
     */
    public void palabra1(){
                        String letra=txtIngreso.getText();                         
                        if(letra.equals("f")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(0, 'f');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("u")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(1, 'u');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("b")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(3, 'b');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                        else if(letra.equals("o")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(4, 'o');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("l")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(5, 'l');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==5){
                            gana();
                            cont=1;
                        }
    }
    /**
     * Metodo para jugar con la palabra computacion, compara la letra ingresada con cada letra hasta que gane o pierda
     */
    public void palabra2(){
                        String letra=txtIngreso.getText();                          
                        if(letra.equals("c")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(0, 'c');
                        remplazo.setCharAt(7, 'c');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("m")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(2, 'm');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("p")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(3, 'p');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                        else if(letra.equals("u")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(4, 'u');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("t")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(5, 't');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                         else if(letra.equals("a")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(6, 'a');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                          else if(letra.equals("i")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(8, 'i');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("n")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(10, 'n');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==8){
                            gana();
                            cont=1;
                        }
    }
    /**
     * Metodo para jugar con la palabra perro, compara la letra ingresada con cada letra hasta que gane o pierda
     */
   public void palabra3(){
                        String letra=txtIngreso.getText();                         
                        if(letra.equals("p")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(0, 'p');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("r")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(2, 'r');
                        remplazo.setCharAt(3, 'r');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("o")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(4, 'o');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==3){
                            gana();
                            cont=1;
                        } 
   }
   /**
     * Metodo para jugar con la palabra celular, compara la letra ingresada con cada letra hasta que gane o pierda
     */
   public void palabra4(){
                        String letra=txtIngreso.getText();                         
                        if(letra.equals("c")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(0, 'c');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("e")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(1, 'e');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("u")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(2, 'u');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                        else if(letra.equals("a")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(4, 'a');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                         else if(letra.equals("r")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(5, 'r');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==5){
                            gana();
                            cont=1;
                        } 
   }
   /**
     * Metodo para jugar con la palabra navidad, compara la letra ingresada con cada letra hasta que gane o pierda
     */
   public void palabra5(){
                    String letra=txtIngreso.getText();                         
                        if(letra.equals("n")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(0, 'n');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("a")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(1, 'a');
                        remplazo.setCharAt(5, 'a');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("v")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(2, 'v');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                        else if(letra.equals("i")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(3, 'i');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                      
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==4){
                            gana();
                            cont=1;
                        } 
   }
   /**
     * Metodo para jugar con la palabra alemania, compara la letra ingresada con cada letra hasta que gane o pierda
     */
   public void palabra6(){
          String letra=txtIngreso.getText();                         
                        if(letra.equals("l")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(1, 'l');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("e")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(2, 'e');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("m")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(3, 'm');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                        else if(letra.equals("n")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(5, 'n');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                       else if(letra.equals("i")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(6, 'i');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                      else{
                           pierde();
                           cont++;

                      }
                        if(l==5){
                            gana();
                            cont=1;
                        } 
   }
   /**
     * Metodo para jugar con la palabra paris, compara la letra ingresada con cada letra hasta que gane o pierda
     */
   public void palabra7(){
          String letra=txtIngreso.getText();                         
                        if(letra.equals("p")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(0, 'p');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("r")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(2, 'r');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("i")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(3, 'i');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                        else if(letra.equals("s")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(4, 's');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                      
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==4){
                            gana();
                            cont=1;
                        } 
   }
   /**
     * Metodo para jugar con la palabra fresa, compara la letra ingresada con cada letra hasta que gane o pierda
     */
   public void palabra8(){
          String letra=txtIngreso.getText();                         
                        if(letra.equals("f")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(0, 'f');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("r")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(1, 'r');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("e")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(2, 'e');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                        else if(letra.equals("a")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(4, 'a');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                      
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==4){
                            gana();
                            cont=1;
                        } 
   }
   /**
     * Metodo para jugar con la palabra salsa, compara la letra ingresada con cada letra hasta que gane o pierda
     */
   public void palabra9(){
       String letra=txtIngreso.getText();                         
                        if(letra.equals("a")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(1, 'a');
                        remplazo.setCharAt(4, 'a');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("l")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(2, 'l');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                      
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==2){
                            gana();
                            cont=1;
                        } 
    }
   /**
     * Metodo para jugar con la palabra cocina, compara la letra ingresada con cada letra hasta que gane o pierda
     */
   public void palabra10(){
          String letra=txtIngreso.getText();                         
                        if(letra.equals("c")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(0, 'c');
                        remplazo.setCharAt(2, 'c');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);         
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("i")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(3, 'i'); 
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                      }
                        else if(letra.equals("n")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(4, 'n');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                        else if(letra.equals("a")){        
                        String cadena=LabelPalabra.getText();
                        StringBuilder remplazo=new StringBuilder(cadena);
                        remplazo.setCharAt(5, 'a');
                        cadena=remplazo.toString();
                        LabelPalabra.setText(cadena);
                        l++;
                        txtIngreso.setText("");
                        
                      } 
                      
                      else{
                           pierde();
                           cont++;
                           txtIngreso.setText("");

                      }
                        if(l==4){
                            gana();
                            cont=1;
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

        btnNuevo = new javax.swing.JButton();
        txtIngreso = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelPalabra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AHORCADO");

        btnNuevo.setText("Nuevo Juego");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Pista:");

        LabelPalabra.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnIngresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(LabelPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(txtIngreso)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        //Aqui se ejecuta dependiendo la palabra escojida, cada palabra tiene un numero asignado
        if (opcion==1){
             palabra1();                 
            }
        if (opcion==2){
             palabra2();                 
            }
        if (opcion==3){
             palabra3();                 
            }
        if (opcion==4){
             palabra4();                 
            }
        if (opcion==5){
             palabra5();                 
            }
        if (opcion==6){
             palabra6();                 
            }
        if (opcion==7){
             palabra7();                 
            }
        if (opcion==8){
             palabra8();                 
            }
        if (opcion==9){
             palabra9();                 
            }
        if (opcion==10){
             palabra10();                 
            }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPalabra;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtIngreso;
    // End of variables declaration//GEN-END:variables
}
