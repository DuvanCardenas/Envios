
package javaapplication8;

import java.util.ArrayList;


public class JavaApplication8 {

   
    public static void main(String[] args) {
        
        
        CorreElectronico email = new CorreElectronico("juan","este es un correo de envio");
       Documento doc = new Documento();
        Mensaje  men= new Mensaje("jose","este es un mensaje de texto");
        
        ArrayList<Envio>mensajes=new ArrayList<>();
        mensajes.add(email);
        mensajes.add(doc);
        mensajes.add(men);
        
        for(Envio envio : mensajes){
            envio.enviar();
        }
    }
    
}
