
package controller;

import model.funcionario.FuncionarioSaude;
import model.funcionario.FuncionarioSaudeModel;


public class FuncionarioController {
    
    public void registrarFuncionarioSaude(FuncionarioSaude func) {
		FuncionarioSaudeModel funcModel = new FuncionarioSaudeModel();
		funcModel.cadastrarFuncSaude(func);
	}
    
}
