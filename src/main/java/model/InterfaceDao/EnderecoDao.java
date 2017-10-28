
package model.InterfaceDao;

import model.Endereco;


public interface EnderecoDao extends Dao<Endereco> {
    
    public Endereco recuperaCep(String cep);
    
    
}
