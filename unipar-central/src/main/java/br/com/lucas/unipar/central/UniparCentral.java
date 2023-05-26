/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.lucas.unipar.central;

import br.com.lucas.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.com.lucas.unipar.central.models.Cidade;
import br.com.lucas.unipar.central.models.Estado;
import br.com.lucas.unipar.central.models.Pais;
import br.com.lucas.unipar.central.services.CidadeService;
import br.com.lucas.unipar.central.services.EstadoService;
import br.com.lucas.unipar.central.services.PaisService;
import javax.swing.JOptionPane;

public class UniparCentral {

    public static void main(String[] args) {
        
        try {
            
            PaisService paisService = new PaisService();
            Pais pais = new Pais();
            pais.setId(1);
            pais.setNome("Brasil");
            pais.setSigla("BR");
            paisService.validar(pais);
            
            EstadoService estadoService = new EstadoService();
            Estado estado = new Estado();
            estado.setId(1);
            estado.setNome("Paraná");
            estado.setSigla("PR");
            estadoService.validar(estado);
            
            CidadeService cidadeService = new CidadeService();
            Cidade cidade = new Cidade();
            cidade.setId(1);
            cidade.setNome("Toledo");
            cidadeService.validar(cidade);
        
        } catch (EntidadeNaoInformadaException ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
        
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Exceção não esperada. " + ex.getMessage());
            
        }
        
        
        
    }
}
