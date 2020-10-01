package edu.umg.chain;

import edu.umg.utils.Alertar;

import javax.swing.*;

public class Correo extends ManejoErrores{
    public Correo(int mask){
        this.mask=mask;
    }


    @Override
    public void execute(String msg, int priority) {
        if( priority <= mask ){
            //enviar una notificación
            Alertar.sendFromGMail("ERROR EN EL SISTEMA", "Recientemente ocurrió un error en el sistema:"+msg);
        }

        if( next != null )
            next.execute(msg, priority);
    }
}
