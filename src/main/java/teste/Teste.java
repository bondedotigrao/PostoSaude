/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.List;
import model.funcionario.FuncionarioHibernate;
import model.funcionario.FuncionarioSaude;
import model.funcionario.FuncionarioSaudeModel;

/**
 *
 * @author Milena Macedo
 */
public class Teste {
 
   public static void main(String args[]){
  // public FuncionarioSaude(String nome, String cpf, String especialidade, int codigo) {
       FuncionarioSaude fs = new FuncionarioSaude("João","75008513400","casa",17);
       FuncionarioSaudeModel fh = new FuncionarioSaudeModel();
      fh.cadastrarFuncSaude(fs);
      
   }
}

