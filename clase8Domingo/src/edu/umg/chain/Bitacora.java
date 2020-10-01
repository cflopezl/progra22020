package edu.umg.chain;

import edu.umg.utils.MyLogger;

import javax.swing.*;

public class Bitacora extends ManejoErrores{
    public Bitacora(int mask){
        this.mask=mask;
    }

    @Override
    public void execute(String msg, int priority) {
        if( priority <= mask ){
            //bitacorizar
            MyLogger.getInstance().info(msg);
        }

        if( next != null )
            next.execute(msg, priority);
    }
}
