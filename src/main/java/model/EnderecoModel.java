
package model;

import java.util.List;
import model.InterfaceDao.Dao;
import model.InterfaceDao.EnderecoDao;
import model.InterfaceDao.FuncionarioDao;
import model.hibernate.EnderecoHibernate;




public class EnderecoModel  {

    Dao<Endereco> dao = new EnderecoHibernate();
     public void inserir(Endereco endereco) {
          if (((EnderecoDao) dao).recuperar(endereco.getId_end()) == null) {
            dao.inserir(endereco);
        }
         
     }


    public void alterar(Endereco endereco) {
       if (((EnderecoDao) dao).recuperar(endereco.getId_end()) != null) {
            dao.alterar(endereco);
        }
    }


    public Endereco recupera(Integer codigo) {
         if (codigo == null) {
            return null;
        }
        
        return ((EnderecoDao)dao).recuperar(codigo); 
    }
    


    public void deletar(Endereco endereco) {
        if (((EnderecoDao) dao).recuperar(endereco.getId_end()) != null) {
            dao.deletar(endereco);
        }
    }
 
    public List<Endereco> listarTodos() {
      return ((EnderecoDao) dao).listarTodos();
    }
    
}
