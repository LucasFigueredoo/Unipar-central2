package br.com.lucas.unipar.central.services;

import br.com.lucas.unipar.central.exceptions.CampoNaoInformadoException;
import br.com.lucas.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.com.lucas.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.com.lucas.unipar.central.models.Pais;

public class PaisService {
    
    public void validar(Pais pais) throws EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException {
        
        if (pais == null) {
            throw new EntidadeNaoInformadaException("Pais");
        }
        
        if (pais.getNome() == null ||
            pais.getNome().isEmpty() ||
            pais.getNome().isBlank()) { 
            
            throw new CampoNaoInformadoException("Nome");
            
        }
        
        if (pais.getSigla() == null ||
            pais.getSigla().isEmpty() ||
            pais.getSigla().isBlank()) {
            
            throw new CampoNaoInformadoException("Sigla");
            
        }
        
        if (!(pais.getSigla().length() == 2)) {
            
            throw new TamanhoCampoInvalidoException("Sigla", 2);
            
        }
        
        if (pais.getNome().length() > 60) {
            
            throw new TamanhoCampoInvalidoException("Nome", 60);
        
        }
        
    }

}
