package edu.umg.chain;

public abstract class ManejoErrores {
    protected int mask;
    protected ManejoErrores next;

    public ManejoErrores setNext(ManejoErrores l){
        next = l;
        return this;
    }

    abstract public void execute(String msg, int priority);

}
