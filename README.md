# Interfaz Grafica de Usuario

Aplicaciones Implementadas con Interfaz Grafica

**NOMBRE:** José Quinde

**CARRERA:** Computacion

**MATERIA:** Programacion Aplicada

## OBJETIVO ALCANZADO:

El objetivo principal de esta práctica era poder alcanzar el aprendizaje de cómo se maneja la interfaz gráfica, para poder implementarlo en el futuro en los proyectos.
También como objetivo se puede decir que se requirió mostrar el nivel de programación aprendido hasta ahora para poder realizar paso por paso cada programa.

## ACTIVIDADES DESARROLLADAS

**1. Crear tres repositorios en GitHub con el nombre “Interfaz Gráfica de Usuario - Calculadora”, “Interfaz Gráfica de Usuario – Tres en Raya” y “Interfaz Gráfica de Usuario – El Ahorcado”
Se procedió a crear los repositorios para la 4ta practica con los nombres asignados.**

**NOMBRE USUARIO:** JoseQ1996

**URL:** https://github.com/JoseQ1996/Interfaz-Grafica-de-Usuario---Calculadora.git
 
**URL:** https://github.com/JoseQ1996/Interfaz-Grafica-de-Usuario-El-Ahorcado.git
 
**URL:** https://github.com/JoseQ1996/Interfaz-Grafica-de-Usuario-Tres-en-Raya.git
 
 
**3. Calculadora
Se pide construir una calculadora en el lenguaje de programación de Java con base a layouts, botones y cajas de texto para que permita realizar operaciones aritméticas de complejidad básica, como: suma, resta, multiplicación, división**

Primero se procedió a crear el paquete con la ventana principal
 
Luego se diseñó la interfaz del proyecto
 
Se programó toda la línea de código en la ventana principal
<pre><code>
//Declaracion variables
    private String cadena;
    private double n1;
    private int op;
</code></pre>
En el constructor se inicializaron los atributos creados.
<pre><code>
public VentanaPrincipal() {
        initComponents();
        cadena="";
        n1=0;
        op=0;
    }
</code></pre>
Cuando se realiza una acción aplastando cualquier número se concatena, el numero digitado con el numero que ya está en pantalla.
<pre><code>
// ingresa el numero 1 al txtArea:
        cadena=cadena+"1";
        txtArea.setText(cadena);
</code></pre>
El funcionamiento de las operaciones es diferente ya que guarda el número que estaba en pantalla y lo suma con otro número que ingresa en pantalla, para poder sacar el resultado es necesario aplastar el botón de igual (=)
<pre><code>
// Realiza la suma:
        n1=Double.parseDouble(txtArea.getText());
        cadena="";
        txtArea.setText(cadena); 
        op=1;
</code></pre>
En el botón de resultado dependiendo que operación quieras hacer este te da el resultado.
<pre><code>
// Muestra la Respuesta:
        if(op==1){
        n1=n1+Double.parseDouble(txtArea.getText());
        cadena="";
        txtArea.setText(String.valueOf(n1));  
        }
        if(op==2){
        n1=n1-Double.parseDouble(txtArea.getText());
        cadena="";
        txtArea.setText(String.valueOf(n1));  
        }
        if(op==3){
        n1=n1*Double.parseDouble(txtArea.getText());
        cadena="";
        txtArea.setText(String.valueOf(n1));  
        }
        if(op==4){
        n1=n1/Double.parseDouble(txtArea.getText());
        cadena="";
        txtArea.setText(String.valueOf(n1));  
        }
</code></pre>
Ese es el funcionamiento básico que tiene la calculadora, las otras operaciones matemáticas las realiza de modo similar.

**4. Tres en Raya
Se pide construir el juego de tres en raya en el lenguaje de programación de Java con base a layouts, botones e imágenes
Lo primero que se hizo fue crear los paquetes, la ventana principal y cargar las imágenes**
 

•	La estructura gráfica del juego deberá ser generado usando nueve botones. 
Se realizó un botón para cada movimiento y en total son 9.
 
•	Al presionar un botón se cambiará su fondo por el de una imagen con el símbolo de (X) ó (O) dependiendo el turno del jugador. 
Se implementó el circulo para el jugador
 
Para la computadora se Implementó la equis.
 
•	El juego deberá ser contra la computadora, el primero en iniciar el juego siempre será el jugador “humano”.
La aplicación está diseñada para que siempre el primer turno le pertenezca al Jugador, y que siempre se tenga que enfrentar a la máquina.

La dificultad de la computadora es mediana.

•	El juego deberá permitir reiniciar la partida con la finalidad de jugar un nuevo juego.
Se creó un botón para una nueva partida, aunque también cuando hay un jugador el juego se resetea con el fin de poder volver a jugar.
 
Al aplastar Aceptar el juego se reinicia
 


Para poder entender el código de la aplicación pondremos de ejemplo un botón, las posiciones del juego están distribuidas de la siguiente manera.

[0][0]     [0][1]     [0][2]

[1][0]     [1][1]     [1][2]

[2][0]     [2][1]     [2][2]

Ahora que sabemos cómo está distribuido las posiciones supongamos que el jugador uno selecciona la posición [0][0], automáticamente después la computadora seleccionara una de las posiciones más cercanas a la [0][0], la selección del computador está realizada de manera randomica, si el computador quiere seleccionar una posición que ya ha sido utilizada, la aplicación no le permitirá ya cuando alguien ocupa una posición esta guarda en un array un dato dependiendo si fue el jugador=1 y si fue el computador=2, finalmente cuando se realice todas las comparaciones, al último ingresa a un método llamado ganar(), que va comparando las posiciones para saber si uno de los dos ya gano, o sino continua el juego.

A continuación, se mostrará el código implementado en un botón en este caso el botón 1 de la posición [0][0].
<pre><code>
// TODO add your handling code here:
        Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
        btn1.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        jugador1++;
        turno[0][0]=1;
        btn1.setEnabled(false);
        b1=1;
        //generador de numeros aleatorios
        if(b2==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono2);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono2);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;
            } 
        }
        else if(b4==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
                switch(numeroAleatorio){
                  case 1:
                Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
                btn2.setIcon(icono1);
                btn2.setEnabled(false);
                txtTurno2.setText(String.valueOf(compu1));
                compu1++;
                turno[0][1]=2;
                b2=1;
                        break;  
                    case 2:
                Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
                btn5.setIcon(icono2);
                btn5.setEnabled(false);
                txtTurno2.setText(String.valueOf(compu1));
                compu1++;
                turno[1][1]=2;
                b5=1;
                        break;
                        case 3:
                Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
                btn4.setIcon(icono3);
                btn4.setEnabled(false);
                txtTurno2.setText(String.valueOf(compu1));
                compu1++;
                turno[1][0]=2;
                b4=1;
                        break;
                }
            }
        gana();
</code></pre>
Ahora se mostrará el método ganar que compara cada vez que se digita una posición.
<pre><code>
public void gana(){
       //Compara los horizontales
       if(turno[0][0]==1 && turno[0][1]==1 && turno [0][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[1][0]==1 && turno[1][1]==1 && turno [1][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[2][0]==1 && turno[2][1]==0 && turno [2][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
        if(turno[0][0]==2 && turno[0][1]==2 && turno [0][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[1][0]==2 && turno[1][1]==2 && turno [1][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[2][0]==2 && turno[2][1]==2 && turno [2][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       //Compara los verticales
       if(turno[0][0]==1 && turno[1][0]==1 && turno [2][0]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][1]==1 && turno[1][1]==1 && turno [2][1]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][2]==1 && turno[1][2]==0 && turno [2][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
        if(turno[0][0]==2 && turno[1][0]==2 && turno [2][0]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][1]==2 && turno[1][1]==2 && turno [2][1]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][2]==2 && turno[1][2]==2 && turno [2][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       //Compara los cruzados
       if(turno[0][0]==1 && turno[1][1]==1 && turno [2][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[2][0]==1 && turno[1][1]==1 && turno [0][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
        if(turno[2][0]==2 && turno[1][1]==2 && turno [0][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][0]==2 && turno[1][1]==2 && turno [2][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
   }
</code></pre>
Este método compara las diferentes formas de ganar en el tres en raya, tanto para el jugador como para la computadora.

Finalmente, en el botón de juego nuevo lo único que hace es resetear todos los botones, e inicializar todas las variables nuevamente
<pre><code>
// TODO add your handling code here:
        turno=new int[3][3];
        jugador1=1;
        compu1=1;
        btn1.setIcon(null);
        btn1.setEnabled(true);
        btn2.setIcon(null);
        btn2.setEnabled(true);
        btn3.setIcon(null);
        btn3.setEnabled(true);
        btn4.setIcon(null);
        btn4.setEnabled(true);
        btn5.setIcon(null);
        btn5.setEnabled(true);
        btn6.setIcon(null);
        btn6.setEnabled(true);
        btn7.setIcon(null);
        btn7.setEnabled(true);
        btn8.setIcon(null);
        btn8.setEnabled(true);
        btn9.setIcon(null);
        btn9.setEnabled(true);
        txtTurno1.setText("0");
        txtTurno2.setText("0");
        b1=0;
        b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;
        b9=0;
 </code></pre>

Puedo decir que, al realizar esta aplicación, se tuvo que tener un poco más de razonamiento de cómo ir comparando las posiciones ya utilizadas para no volver a utilizarlas, y también se dificulto un poco más ya que el juego es contra la computadora.
     
**5. Se pide construir el juego del ahorcado en el lenguaje de programación de Java con base a layouts, botones, imágenes y cajas de textos
Lo primero que se creó fueron los paquetes la ventana principal y se cargó las imágenes.**
 
•	Las imágenes del personaje del “ahorcado” deberán ser visualizadas en un componente JLabel. Recuerde las imágenes deberán estar en el proyecto dentro de una paquete llamado ec.edu.ups.imagenes.

Las imágenes que se mostraran en el JLabel son las siguientes
     

El jugador tendrá 5 oportunidades para equivocarse caso contrario perderá.

•	Se deberá tener un diccionario con un total de 10 palabras con sus pistas, por ejemplo, [“animal”] = “elefante”. 

Se seleccionaron 10 palabras y cada una tiene su pista para que el Jugador puedo adivinar.
Las palabras son las siguientes.

Futbol, perro, computación, celular, navidad, Alemania, parís, fresa, salsa, cocina

•	Al iniciar el juego se deberá escoger de manera aleatoria una de las diez palabras. • Luego, de manera automática se generará las cajas de texto.

La palabra se muestra de manera automática a través de un numero randomico que genera un numero del 1 al 10 y cada palabra esta guardada en un numero.

•	Se mostrará la pista.

La pista se mostrará en la parte superior como se lo mostraba en el ejemplo dado.

•	Por último, por cada vez que se equivoque el jugador. La imagen cambiara de forma automática para indicar cuantos intentos le cada al jugador. 

Cada vez que el jugador se equivoque se va a llamar a el método pierde(), lo que hace es comparar cuantas veces el jugador ya se a equivocado conforme eso cambia la imagen y aumenta un contador.
 <pre><code>
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
  </code></pre>            

•	Deberá tener un botón para poder comprobar la palabra y un botón para poder reiniciar el juego.

       Si el jugador gana, pierde o aplasta Nuevo juego este reiniciara con una palabra diferente
A continuación, se mostrará la línea de código implementada.
En el constructor se da la pista y la palabra que va a ingresar.
<pre><code>
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
</code></pre>
Existe un método para cada palabra en donde se compara la letra ingresada con la palabra que se necesita obtener en este caso mostraremos como es el método de la palabra futbol, todas las palabras poseen un método similar para poder comparar.
<pre><code>
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
</code></pre>
En el evento del botón ingreso lo único que hace es mandar a llamar cada método de cada palabra dependiendo la palabra dada.
<pre><code>
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
    }              
</code></pre>
Este programa no estuvo tan complejo como el de realizar el tres en raya, aquí se tuvo que ver la manera de cómo compara la letra ingresada y que después esta letra remplace la posición correcta para completar la palabra.


## CONCLUSIONES:

El manejo de la Interfaz Gráfica es muy provechoso ya, que así podemos aprender a desarrollar aplicación para que puedas ejecutarlas un usuario sin saber que código tiene programa, esto ayuda más al programador a realizar un trabajo para que el usuario puedo utilizarlo sin la necesidad de saber programar.
## RECOMENDACIONES:

Es recomendable realizar cada parte de la interfaz gráfica paso por paso, para facilitar más la forma de programar una aplicación.

**Nombre de estudiante:** José Quinde
