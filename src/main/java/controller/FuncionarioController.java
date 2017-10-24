package controller;


import java.util.List;
import model.FuncionarioSaude;
import model.FuncionarioSaudeModel;

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

    public void recuperarID(FuncionarioSaude func) {
        fsm.recuperar(func);
    }

    public List<FuncionarioSaude> recuperarTodos(FuncionarioSaude func) {
        return fsm.RecuperarTodos(func);
    }
}
