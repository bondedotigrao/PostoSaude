package view;


import controller.FuncionarioController;
import controller.PacienteController;
import controller.PostoController;
import java.util.ArrayList;
import java.util.List;
import model.classes.Endereco;

import model.classes.FuncionarioSaude;
import model.FuncionarioSaudeModel;
import model.PostoModel;
import model.classes.AgendamentoConsultas;
import model.classes.Paciente;
import model.classes.Posto;
import model.hibernate.AgendamentoHibernate;
import model.hibernate.FuncionarioHibernate;
import model.hibernate.PacienteHibernate;

public class Teste {

        
    public static void main(String args[]) {

        ArrayList<FuncionarioSaude> ad = new ArrayList<>();
        Endereco end = new Endereco("Garanhuns", "55294-209", "Magno", "João Gabiralde Almeida", 55);
        
        Posto posto = new Posto("PSF Miracica", end, ad);

        PostoModel pot = new PostoModel();
        PostoController pc = new PostoController();

        FuncionarioSaude fs = new FuncionarioSaude("bla", "52521108", "Médica", posto);

        ad.add(fs);
        
       posto.setFuncSaude(ad);
       Paciente paciente = new Paciente("M", "M", "M", "M", "M", 5, "M", "M", end);
       PacienteHibernate ph = new PacienteHibernate();
       pot.cadastrarPosto(posto);
       
       PacienteController pcc = new PacienteController();
       
       pcc.registrarPaciente(paciente);
       AgendamentoConsultas ac = new AgendamentoConsultas("14/07/1998","12:50",fs,posto,paciente);
       AgendamentoHibernate ah = new AgendamentoHibernate();
       ah.inserir(ac);
       
       // pc.registrarPosto(posto);
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
        //EnderecoModel eh = new EnderecoModel();
        //EnderecoController eh = new EnderecoController();
        // eh.deletar(eh.recuperaCep("55294-209"));
        //int cod=4;
        //eh.removerEndereco(eh.recuperarID(cod));
        //Paciente:
        //ph.deletar(ph.recuperar(1));
        //PacienteController pc = new PacienteController();
        //pc.recuperarTodos();
        // public Posto(int codigo, String nome, Endereco endereco, FuncionarioSaude funcSaude)
    }
}
