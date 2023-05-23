package br.com.lucas.unipar.central.exceptions;

/**
 *
 * @author 00240578
 */
public class CampoNaoInformadoException extends Exception {
    
    public CampoNaoInformadoException(String campo) {
        
        super("O campo " + campo + " Não foi informado. Verifique!");
        
    }

}
