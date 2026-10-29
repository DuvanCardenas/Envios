
package javaapplication8;


public class CorreElectronico extends Notificacion implements Envio {

    public CorreElectronico(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }
    
    @Override
    public void enviar(){
        System.out.println("send mail");
    }
}
