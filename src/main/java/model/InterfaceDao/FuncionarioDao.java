package model.InterfaceDao;

import model.classes.FuncionarioSaude;

public interface FuncionarioDao extends Dao<FuncionarioSaude> {

    public FuncionarioSaude recuperaCpf(String cpf);

   

}
