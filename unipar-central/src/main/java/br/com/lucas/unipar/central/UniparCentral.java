/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.lucas.unipar.central;

import br.com.lucas.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.com.lucas.unipar.central.models.Pais;
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
        
        } catch (EntidadeNaoInformadaException ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
        
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Exceção não esperada. " + ex.getMessage());
            
        }
        
        
        
    }
}
