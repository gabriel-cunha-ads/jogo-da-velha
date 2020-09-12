package model;

import model.IPersitencia;
import model.Cliente;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Gabriel Cunha <gabrielcunhadev@gmail.com>
 */
public class ClientePersistencia implements IPersitencia{

    private String caminhoDoArquivo = "c:/cliente.txt"; 
    
    @Override
    public boolean incluir(Object objeto) throws Exception {
        Cliente cliente = (Cliente) objeto;
        
        File arquivo = new File(caminhoDoArquivo);
        
        FileWriter fw = new FileWriter(arquivo);
        
        fw.write(cliente.getNome());
        
        fw.close();
        
        return true;   
    }

    @Override
    public List<Object> listar() throws Exception {

//      TODO: Matheus vai implementar
//      Consultar nos arquivos todos os clientes
//          - abrir o arquivo
//          - ler todos os cliente dentro do arquivo
//          - armazenar na lista
//          - retorna a lista de clientes 

//      
        return Arrays.asList("cliente1", "cliente2", "cliente3");
    }
    
   
}
