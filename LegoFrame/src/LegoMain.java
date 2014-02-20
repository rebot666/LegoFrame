/**
 e planea ejecutar las
 * instrucciones para el LEGO* LegoMain es la clase en la que
 * se planea ejecutar las
 * instrucciones para el LEGO
 * 
 * Ejemplo:
 * 
 * minion.adelante();
 * minion.reversa();
 * minion.giraIzq();
 * 
 * @author Re-bot
 */

import lejos.nxt.Button;

public class LegoMain{
    //Declaración de nuestro robot LEGO con motores y sensores
    static LegoSensor minion = new LegoSensor();
    
    //Método en donde se escriben las actividades
    static void ejecutaActividad(){
        //TODO: Escribe las funciones del Kego
        minion.adelante();
        minion.avanzaCm(10);
    }
    
    //Método principal del LEGO ¡¡¡¡NO BORRAR!!!! 
    public static void main(String args[]){
        ejecutaActividad();
        Button.waitForAnyPress();
    }
}
