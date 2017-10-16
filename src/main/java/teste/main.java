
package teste;

import model.funcionario.FuncionarioHibernate;
import model.funcionario.FuncionarioSaude;

public class main {
    public static void main(String args[]){
        
        FuncionarioSaude fs = new FuncionarioSaude("ovo1","456","roubao",1);
        FuncionarioHibernate fh = new FuncionarioHibernate();
        
        fh.deletar(fs);
        
    }
}
