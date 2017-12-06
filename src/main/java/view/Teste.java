//package view;
//
//import controller.AgendamentoController;
//import controller.PacienteController;
//import controller.PostoController;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import model.classes.Endereco;
//
//import model.classes.FuncionarioSaude;
//import model.PostoModel;
//import model.classes.AgendamentoConsultas;
//import model.classes.Paciente;
//import model.classes.Posto;
//import model.hibernate.AgendamentoHibernate;
//import model.hibernate.PacienteHibernate;
//
//public class Teste {
//
//    public static void main(String args[]) {
//
//        ArrayList<FuncionarioSaude> ad = new ArrayList<>();
//        ArrayList<AgendamentoConsultas> agen = new ArrayList<>();
//        Endereco end = new Endereco("Garanhuns", "55294-209", "Magno", "João Gabiralde Almeida", 55, "Casa");
//        PostoController pc = new PostoController();
//        PacienteController pcc = new PacienteController();
//        //Paciente paciente = new Paciente("M", "M", "M", "M", "M", 5, "M", "M", end);
//       // pcc.registrarPaciente(paciente);
////
//        Posto posto = new Posto("PSF Miracica", end, ad, agen);
////
////
//        
//        pc.registrarPosto(posto);
//        posto = pc.recuperarTodos().get(0);
//
//        Paciente pa = pcc.recuperarTodos().get(0);
//
//        FuncionarioSaude fs = new FuncionarioSaude("bla", "52521108", "Médica", posto);
//        ad.add(fs);
//        posto.setFuncSaude(ad);  
//        
//        AgendamentoConsultas ac = new AgendamentoConsultas(new Date(),
//                posto.getFuncSaude().get(0), paciente);
//        ac.setPosto(posto);
//        
//        posto.getAgendamentos().add(ac);
//
//        pc.alterarPosto(posto);
//
//        //////////
//    }
//}
