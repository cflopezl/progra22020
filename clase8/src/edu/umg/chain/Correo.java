package edu.umg.chain;

import edu.umg.utils.Alertar;
import edu.umg.utils.MyLogger;

public class Correo extends ManejoErrores{

    public Correo(int mask) {
        this.mask = mask;
    }

    @Override
    public void execute(String msg, int priority) {
        if( priority <= mask ){
            //enviar correo
            Alertar.sendFromGMail("ERROR EN SISTEMA", "Atención a este siguiente error GRAVE en el sistema:" + msg);
        }

        if( next != null )
            next.execute(msg, priority);
    }
}
