package teste;

import controller.FuncionarioController;
import java.util.List;
import model.FuncionarioSaude;
import model.FuncionarioSaudeModel;

public class Teste {

    public static void main(String args[]) {
       FuncionarioSaude fs = new FuncionarioSaude("Pedro", "65008513400", "vfda");
         FuncionarioController  fh = new FuncionarioController();
         
         fh.registrarFuncionarioSaude(fs);
       
    }
}
