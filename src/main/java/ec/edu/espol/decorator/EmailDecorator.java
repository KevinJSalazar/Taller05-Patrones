/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.decorator;

/**
 *
 * @author agome
 */
public class EmailDecorator extends NotifierDecorator{

    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }

    
    @Override
    public void send(String message){
        //Implementa el código correspondiente
        sendEmail(message);
    }

    private void sendEmail(String message) {
        //Implementa el código correspondiente
    }
}
