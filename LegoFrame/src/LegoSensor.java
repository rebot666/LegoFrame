/*
 * LegoSensor es una clase en la que se 
 * inicializan los sensores conectados
 * a los diferentes puertos del lego, 
 * también se establecen varios métodos
 * que podrán ser utililizados en la clase 
 * LegoMain.java
 * 
 * 4 de Septiembre de 2013
 * 
 * @author Re-bot
 */

//import java.awt.Color;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class LegoSensor extends LegoMotors{
    //Variables necesarias para los sensores del Lego
    private UltrasonicSensor us;
    private LightSensor ls;
    private TouchSensor izq;
    private TouchSensor der;
    final int OFF = 0;
    final int CONTINUO = 1;
    final int ECHO = 2;
    final int COMPA = 3;
    
    /*Constrructor en donde se inicializan los diferentes sensores que tiene
    el LEGO*/
    public LegoSensor(){
        super(16.7, Motor.A, Motor.B);
        us = new UltrasonicSensor(SensorPort.S1);
        ls = new LightSensor(SensorPort.S2);
        izq = new TouchSensor(SensorPort.S3);
        der = new TouchSensor(SensorPort.S4);
    }
    
    /*                  SENSOR DE ULTRASONIDO                      */
    //Método que regresa la distancia a la que se encuentra un objeto 
    public int obstaculo(){
        return us.getDistance();
    }
    
    /* Método que modifica el modo en el que el sensor de ultrasonido 
      se encuentra*/
    public int defineModo(int modo){
        /*
         * Modos en el que el lego puede estar
         * MODE_OFF: Apaga el sensor de ultrasonido
         * MODE_RESET: Resetea el sensor de ultrasonido
         * MODE_CONTINUOUS: Lectura hecha periódicamente del sensor
         * MODE_PING: Obtener 8 lecturas en un arreglo
         * MODE_CAPTURE: Reconocer otro sonido de ultrasonido
         */
        switch(modo){
            case OFF:
                return us.setMode(us.MODE_OFF);
            case CONTINUO:
                return us.setMode(us.MODE_CONTINUOUS);
            case ECHO:
                return us.setMode(us.MODE_PING);
            case COMPA:
                return us.setMode(us.MODE_CAPTURE);
        }
        return 0;
    }
    
    /*                      SENSOR DE LUZ                          */
    //Método que regresa el valor del sensor de luz en ese momento 
    public int valorLuz(){
        return ls.readValue();
    }
    
    //Método que enciende el foco del sensor de luz con color default
    public void prendeFoco(){
        ls.setFloodlight(true);
    }
    
    //Método que apaga el foco del sensor de luz
    public void apagaFoco(){
        ls.setFloodlight(false);
    }
    
    //Método que enciende el foco del sensor de luz con otro color
    /*public void focoColor(Color color){
        int rgb = color.getRGB();
        ls.setFloodlight(rgb);
    }*/
    
    /*                      SENSOR TOUCH                           */
    //Método que verifica si es que el sensor touch izq ha sido tocado
    public boolean touchIzq(){
        return izq.isPressed();
    }
    
    //Método que verifica si es que el sensor touch izq ha sido tocado
    public boolean touchDer(){
        return der.isPressed();
    }
}