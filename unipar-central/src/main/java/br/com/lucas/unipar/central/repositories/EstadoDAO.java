package br.com.lucas.unipar.central.repositories;

import br.com.lucas.unipar.central.models.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstadoDAO {
    
    private static final String INSERT =
            "INSERT INTO ESTADO(id, nome, ra, sigla, pais_id)" +
            "VALUES(?, ?, ?, ?, ?)";
    
    private static final String FIND_ALL =
            "SELECT ID, NOME, RA, SIGLA, PAIS_ID FROM ESTADO";
    
    private static final String FIND_BY_ID =
            "SELECT ID, NOME, RA, SIGLA, PAIS_ID FROM ESTADO WHERE ID = ?";
    
    private static final String DELETE_BY_ID = 
            "DELETE FROM PAIS WHERE ID = ?";
    
    private static final String UPDATE =
            "UPDATE PAIS SET NOME = ?, SIGLA = ?, RA = ? " +
            "WHERE ID = ?";
    
    public List<Estado> findAll() {
        
        ArrayList<Estado> retorno = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        } finally {
        }
        
    }

}
