
package br.com.projeto.dao;

import java.sql.*;

import br.com.projeto1.dto.Cliente_DTO;


public class Cliente_DAO {
    
    public Cliente_DAO () {
        
    }
    
     
        public boolean inserirCliente (Cliente_DAO clienteDAO) {
          try 
                conecaoDAO.connectDB;
                
                stmt = Cliente_DAO.com.createStatement;
            
        }
    
    private ResultSet rs = null;
    
    private Statement stmt  = null;
    
    String comando = "insert into (cliente nome_cli, logradouro_cli, numero_cli, "
            + "bairro_cli, cidade_cli, estado_cli, cep_cli, cpf_cli, rg_cli ) Values ("
                + "'" + Cliente_DTO.getNome_cli() + "' , "
                + "'" + Cliente_DTO.getLogradouro_cli() + "' ,"
                + Cliente_DTO.getNumero_cli() + "' ,"
                + "'" + Cliente_DTO.getBairro_cli() + "' ,"
                + "'" + Cliente_DTO.getEstado_cli() + "' ,"
                + "'" + Cliente_DTO.getcep_cli() + "' ,"
                + "'" + Cliente_DTO.getCpf_cli() + "' ,"
                + "'" + Cliente_DTO.getRg_cli() + "' ,";
    
    stmt.execute(comando.toUpperCase());
                
}
