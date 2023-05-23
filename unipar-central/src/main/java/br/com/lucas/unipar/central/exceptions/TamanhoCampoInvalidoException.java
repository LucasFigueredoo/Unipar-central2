package br.com.lucas.unipar.central.exceptions;

public class TamanhoCampoInvalidoException extends Exception{
    
    public TamanhoCampoInvalidoException(String campo, int tamanho) {
        
        super("O campo " + campo + " foi informado com tamanho (" + tamanho + "). Invalido. Verifique!");
        
    }

}
