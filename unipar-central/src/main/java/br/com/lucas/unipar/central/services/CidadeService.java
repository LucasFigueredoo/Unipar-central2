package br.com.lucas.unipar.central.services;

import br.com.lucas.unipar.central.exceptions.CampoNaoInformadoException;
import br.com.lucas.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.com.lucas.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.com.lucas.unipar.central.models.Cidade;

public class CidadeService {
    
    public void validar(Cidade cidade) throws EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException {
        
        if (cidade == null) {
            
            throw new EntidadeNaoInformadaException("Estado");
            
        }
        
        if (cidade.getNome() == null ||
            cidade.getNome().isEmpty() ||
            cidade.getNome().isBlank()) {
        
            throw new CampoNaoInformadoException("Nome");
            
        }
        
        if (cidade.getNome().length() > 60) {
            
            throw new TamanhoCampoInvalidoException("Nome", 60);
            
        }
        
        
    }

}
