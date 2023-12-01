/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.facade;

/**
 *
 * @author evin
 */
public class Cliente {
    private VirtualService vs;
    private String format;
    
    public void run(){
        vs.transaction(format);
    }
}
