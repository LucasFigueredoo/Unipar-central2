package br.com.lucas.unipar.central.repositories;

import br.com.lucas.unipar.central.models.Pais;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaisDAO {
    
    private static final String INSERT =
            "INSERT INTO PAIS(id, nome, sgila, ra)" +
            "VALUES(?, ?, ?, ?)";
    
    private static final String FIND_ALL =
            "SELECT ID, NOME, SIGLA, RA FROM PAIS";
    
    private static final String FIND_BY_ =
            "SELECT ID, NOME, SIGLA, RA, FROM PAIS WHERE ID = ?";
    
    private static final String DELETE_BY_ID =
            "DELETE FROM PAIS WHERE ID = ?";
    
    private static final String UPDATE = 
            "UPDATE PAIS SET NOME = ?, SIGLA = ?, RA = ? " +
            "WHERE ID = ?";
    
   public List<Pais> findAll() throws SQLException{
       
       ArrayList<Pais> retorno = new ArrayList<>();
       Connection conn = null;
       
       try {
       
           
       } finally {
           
           if (conn != null)
               conn.close();
           
       }
       
       return retorno;
       
   }

}
