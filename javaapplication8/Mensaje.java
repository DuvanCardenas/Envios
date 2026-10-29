
package javaapplication8;


public class Mensaje extends Notificacion implements Envio {

    public Mensaje(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar(){
        System.out.println("send msn");
    }

   
    
}
