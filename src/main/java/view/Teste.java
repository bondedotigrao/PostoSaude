package view;

import controller.FuncionarioController;
import java.util.List;
import model.Endereco;
import model.FuncionarioSaude;
import model.FuncionarioSaudeModel;
import model.hibernate.EnderecoHibernate;
import model.hibernate.FuncionarioHibernate;

public class Teste {

    public static void main(String args[]) {
        FuncionarioSaude fs = new FuncionarioSaude("Bruno", "111111108", "Médica");

        // FuncionarioHibernate fh = new FuncionarioHibernate();
        FuncionarioSaudeModel fh = new FuncionarioSaudeModel();
        // FuncionarioController fh = new FuncionarioController();
//  int codigo=1;
// fh.deletar(fh.recuperaCodigo(codigo));
        fh.cadastrarFuncSaude(fs);
        //fh.registrarFuncionarioSaude(fs);
// public Endereco(int id_end, String ciade, String cep, String bairro, String rua, int numero)
//
//Endereco end = new Endereco("Garanhuns","55294-209","Magno","João Gabiralde Almeida",55);
//    EnderecoHibernate eh = new EnderecoHibernate();
//   eh.deletar(eh.recuperaCep("55294-209"));
//   //eh.inserir(end);
    }
}
