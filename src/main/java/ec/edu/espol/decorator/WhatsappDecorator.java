/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.decorator;

/**
 *
 * @author agome
 */
public class WhatsappDecorator extends NotifierDecorator{

    public WhatsappDecorator(Notifier notifier) {
        super(notifier);
    }
    
    @Override
    public void send(String message){
        //Implementa el código correspondiente
        sendWhatsapp(message);
    }

    private void sendWhatsapp(String message) {
        //Implementa el código correspondiente
    }
}
