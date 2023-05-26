package br.com.lucas.unipar.central.services;

import br.com.lucas.unipar.central.exceptions.CampoNaoInformadoException;
import br.com.lucas.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.com.lucas.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.com.lucas.unipar.central.models.Estado;

public class EstadoService {
    
    public void validar(Estado estado) throws EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException {
        
        if (estado == null) {
            
           throw new EntidadeNaoInformadaException("Estado"); 
            
        }
        
        if (estado.getNome() == null ||
            estado.getNome().isEmpty() ||
            estado.getNome().isBlank()) {
         
            throw new CampoNaoInformadoException("Nome");
            
        }
        
        if (estado.getSigla() == null ||
            estado.getSigla().isEmpty() ||
            estado.getSigla().isBlank()) {
            
            throw new CampoNaoInformadoException("Sigla");
            
        }
        
        if (!(estado.getSigla().length() == 2)) {
           
            throw new TamanhoCampoInvalidoException("Sigla", 2);
            
        }
        
        if (estado.getNome().length() > 60) {
            
            throw new TamanhoCampoInvalidoException("Nome", 60);
            
        }
        
    }

}
