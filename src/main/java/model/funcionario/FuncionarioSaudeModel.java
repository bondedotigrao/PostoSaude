
package model.funcionario;


public class FuncionarioSaudeModel {
    
    Dao<FuncionarioSaude> dao = new FuncionarioHibernate();
    
    public void cadastrarFuncSaude(FuncionarioSaude fs) {
        
        //if(validarCpf(fs.getCpf())) {
            
            if (((FuncionarioDao)dao).RecuperaCpf(fs.getCpf()) != null) {
                dao.inserir(fs);
            } else {
                
            }
            
       // } else {
            //exception
        }
        
  //  }
    
}
