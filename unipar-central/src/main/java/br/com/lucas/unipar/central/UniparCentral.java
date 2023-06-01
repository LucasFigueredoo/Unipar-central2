/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.lucas.unipar.central;

import br.com.lucas.unipar.central.models.Pais;
import br.com.lucas.unipar.central.services.PaisService;
import java.util.List;
import javax.swing.JOptionPane;

public class UniparCentral {

    public static void main(String[] args) {
             
        try {
            
            PaisService service = new PaisService();
            
            Pais pais = new Pais();
            pais.setId(56221);
            pais.setNome("Pais das maravilhas");
            pais.setRegistroAcademico("17221");
            pais.setSigla("O9");
            
            service.insert(pais);
            
            System
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        
    }
}
