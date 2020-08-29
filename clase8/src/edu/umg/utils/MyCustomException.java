package edu.umg.utils;

import edu.umg.chain.Bitacora;
import edu.umg.chain.Correo;
import edu.umg.chain.ManejoErrores;
import edu.umg.chain.Stderr;
import edu.umg.utils.ErrorCode;

/**
 * MyCustomException envuelve todas las excepciones estándar de Java comprobadas
 * y las enriquece con un código de error personalizado.
 *
 * Puede utilizar este código de error para recuperar mensajes de error localizados
 * y vincularlos a nuestra documentación en línea.
 */
public class MyCustomException extends Exception{
    private final ErrorCode code;
    private ManejoErrores logger = new Stderr(VariablesGlobales.INFO)
                                        .setNext(new Bitacora(VariablesGlobales.MEDIUM)
                                                .setNext(new Correo(VariablesGlobales.DANGER)));

    public MyCustomException(ErrorCode code) {
        super();
        this.code = code;
    }

    public MyCustomException(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.code = code;

    }

    public MyCustomException(String message, ErrorCode code) {
        super(message);
        this.code = code;
        logger.execute(message, VariablesGlobales.DANGER);
    }

    public MyCustomException(Throwable cause, ErrorCode code) {
        super(cause);
        this.code = code;
        //log.error(code, fecha_hora, usuario);
    }

    public ErrorCode getCode() {
        return this.code;
    }
}
