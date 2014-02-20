/**
 * LegoMotors es una clase en la que se 
 * inicializan los motores conectados
 * a los puertos del lego, también se 
 * establecen varios métodos que podrán 
 * ser utililizados en la clase 
 * LegoMain.java
 * 
 * 4 de Septiembre de 2013
 * 
 * @author Re-bot
 */
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;

public class LegoMotors {
    private DifferentialPilot navegando;
    
    /*Constrructor en donde se inicializan los diferentes sensores que tiene
    el LEGO*/
    public LegoMotors(double distanciaEje, RegulatedMotor 
            izquierdo, RegulatedMotor derecho){
        navegando = new DifferentialPilot(5.6, distanciaEje, 
                izquierdo, derecho);
    }
    
    //Método para que el lego avance hacia adelante
    public void adelante(){
        navegando.forward();
    }
    
    //Método para que el lego avance hacia atrás
    public void reversa(){ 
        navegando.backward();
    }
    
    //Método para que el lego gire a la izquierda
    public void giraIzq(){
        navegando.rotateLeft();
    }
    
    //Método para que el lego gire a la derecha
    public void giraDer(){
        navegando.rotateRight();
    }
    
    //Método para que el lego avance hacia adelante determinados cm
    public void avanzaCm(float cm){
        navegando.travel(cm);
    }
    
    //Método para que el lego avance hacia atrás determinados cm
    public void atrasCm(float cm){
        navegando.travel(-cm);
    }
    
    //Método para que el lego gire a la izquierda determinados cm
    public void giraIzqCm(float angle){
        navegando.rotate(angle);
    }
    
    //Método para que el lego gire a la derecha determinados cm
    public void giraDerCm(float angle){
        navegando.rotate(-angle);
    }
    
    //Método para que el lego se detenga
    public void stop(){
        navegando.stop();
    }
    
    //Método para que el lego se espere
    public void espera(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}