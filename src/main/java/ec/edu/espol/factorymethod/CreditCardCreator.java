/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author User A1
 */
public abstract class CreditCardCreator implements CreditCard{
    private double costoAnual;
    private double limiteCredito;
    public boolean purchase(double amount){
        // Codigo
        return true;
    }  
    public abstract CreditCard createCard();
}
