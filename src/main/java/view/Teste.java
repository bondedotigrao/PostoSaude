package view;

import controller.EnderecoController;
import controller.FuncionarioController;
import controller.PacienteController;
import java.util.List;
import model.Endereco;
import model.EnderecoModel;
import model.FuncionarioSaude;
import model.FuncionarioSaudeModel;
import model.Paciente;
import model.hibernate.EnderecoHibernate;
import model.hibernate.FuncionarioHibernate;
import model.hibernate.PacienteHibernate;

public class Teste {

    public static void main(String args[]) {
        
       // FuncionarioSaude fs = new FuncionarioSaude("Bruno", "111111108", "Médica");
         //FuncionarioHibernate fh = new FuncionarioHibernate();
        //FuncionarioSaudeModel fh = new FuncionarioSaudeModel();
        // FuncionarioController fh = new FuncionarioController();
        //  int codigo=1;
        // fh.deletar(fh.recuperaCodigo(codigo));
        //fh.cadastrarFuncSaude(fs);
        //int codigo = 1;
        //int cod=2;
      //fh.cadastrarFuncSaude(fs);
        //fh.removerFuncSaude(fh.recuperar(cod));
        //fh.registrarFuncionarioSaude(fs);
        
        
        
        //Endereço:
        
        Endereco end = new Endereco("Garanhuns", "55294-209", "Magno", "João Gabiralde Almeida", 55);
        //EnderecoModel eh = new EnderecoModel();
        //EnderecoController eh = new EnderecoController();
        // eh.deletar(eh.recuperaCep("55294-209"));
        //int cod=4;
        //eh.removerEndereco(eh.recuperarID(cod));
        
        
        //Paciente:
        
         Paciente paciente = new Paciente("M", "M", "M", "M", "M", 5, "M", "M", end);
        //PacienteHibernate ph = new PacienteHibernate();
        //ph.deletar(ph.recuperar(1));
        PacienteController pc = new PacienteController();
        pc.recuperarTodos();

    }
}
