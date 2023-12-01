/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.decorator;

/**
 *
 * @author agome
 */
public class WireDecorator extends NotifierDecorator{
    
    public WireDecorator(Notifier notifier) {
        super(notifier);
    }
    
    @Override
    public void send(String message){
        //Implementa el código correspondiente
        sendWire(message);
    }

    private void sendWire(String message) {
        //Implementa el código correspondiente
    }
}
