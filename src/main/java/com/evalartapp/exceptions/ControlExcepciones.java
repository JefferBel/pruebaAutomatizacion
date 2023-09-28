package com.evalartapp.exceptions;

public class ControlExcepciones extends AssertionError{
    public static final String mensajeIncorrecto = "El mensaje visualizado no es el esperado";
    public ControlExcepciones(String message, Throwable cause) {
        super(message, cause);
    }
}
