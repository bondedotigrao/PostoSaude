package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.FuncionarioSaude;
import model.FuncionarioSaudeModel;
@ManagedBean
@SessionScoped
public class FuncionarioController {

    FuncionarioSaudeModel fsm = new FuncionarioSaudeModel();

    public void registrarFuncionarioSaude(FuncionarioSaude func) {
        fsm.cadastrarFuncSaude(func);
    }

    public void removerFuncionarioSaude(FuncionarioSaude func) {
        fsm.removerFuncSaude(func);
    }

    public void alterarFuncionarioSaude(FuncionarioSaude func) {
        fsm.alterarFuncSaude(func);
    }

    public FuncionarioSaude recuperarID(Integer codigo) {
         return fsm.recuperar(codigo);
    }

    public List<FuncionarioSaude> recuperarTodos() {
        return fsm.RecuperarTodos();
    }
}
