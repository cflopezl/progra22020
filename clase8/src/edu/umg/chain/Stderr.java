package edu.umg.chain;

import javax.swing.*;

public class Stderr extends ManejoErrores{

    public Stderr(int mask) {
        this.mask = mask;
    }

    @Override
    public void execute(String msg, int priority) {
        if( priority <= mask ){
            //imprimir en pantalla
            JOptionPane.showMessageDialog(null, msg, "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        }

        if( next != null )
            next.execute(msg, priority);
    }
}
