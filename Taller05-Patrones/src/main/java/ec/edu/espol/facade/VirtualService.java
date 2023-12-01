/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.facade;

/**
 *
 * @author evin
 */
public class VirtualService {
    public void transaction(String format){
        if(format.equals("Web")){
            WebService ws = new WebService();
            ws.webTransaction();
        }
        if(format.equals("Mobile")){
            MobileService ms = new MobileService();
            ms.mobileTransaction();
        }
        if(format.equals("Telephone")){
            TelephoneService ts = new TelephoneService();
            ts.telephoneTransaction();
        }
    }
}
