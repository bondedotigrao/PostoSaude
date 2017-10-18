
package teste;

import controller.FuncionarioController;
import java.util.Scanner;
import model.funcionario.FuncionarioHibernate;
import model.funcionario.FuncionarioSaude;

public class main {
    public static void main(String args[]){
        
        Scanner ler =new Scanner(System.in);
    int codigo;
    String nome;
    String cpf;
    String especialidade;
    
            System.out.println("Digite o codigo");  
            codigo = ler.nextInt();
            System.out.println("Digite o nome do funcionário");
            nome = ler.next();
            System.out.println("Digite o cpf do funcionario");
            cpf = ler.next();
            System.out.println("Didite a especialidade");
            especialidade = ler.next();
        FuncionarioSaude fs = new FuncionarioSaude(nome,cpf,especialidade,codigo);
        
        new FuncionarioController().registrarFuncionarioSaude(fs);
        
        
    }
}
