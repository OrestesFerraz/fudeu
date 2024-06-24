
package br.com.projeto.ctr;

import java.sql.ResultSet;
import br.com.projeto.dto.Cliente_DTO;
import br.com.projeto.dao.Cliente_DAO;
import br.com.projeto.dao.ConecaoDAO;




public class Cliente_CTR {
    Cliente_DAO clienteDAO = new Cliente_DAO();
    
    public Cliente_CTR () {
        
    }
    public String inserirCliente(Cliente_DTO cliente_DTO) {
        try {
            if (clienteDAO.inserirCliente(clienteDTO)) {
                return "cliente cadastrado com sucesso";
            } else {
                return "cliente nao cadstrado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "cliente nao cadstrado";
        }
    }
}
