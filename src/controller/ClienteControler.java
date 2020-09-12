package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.Cliente;
import model.Cliente;
import model.ClientePersistencia;
import model.IPersitencia;
/**
 *
 * @author Gabriel Cunha <gabrielcunhadev@gmail.com>
 */
public class ClienteControler {

    private IPersitencia persistencia;
    
    public void incluir(Cliente cliente) throws Exception {
        if (cliente.getNome().contains("viado")) {
            throw new Exception("Não cadastro cliente viado.");
        }
        
        persistencia = new ClientePersistencia();
        
        
        persistencia.incluir(cliente);
    }
    
}
