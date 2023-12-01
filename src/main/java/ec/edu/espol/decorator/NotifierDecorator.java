/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.decorator;

/**
 *
 * @author agome
 */
public class NotifierDecorator implements Notifier{
    private Notifier wrappee;
    
    public NotifierDecorator(Notifier notifier){
        wrappee = notifier;
    }
    
    @Override
    public void send(String message){
        wrappee.send(message);
    }
    
    
}
