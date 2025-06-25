package ae.aulas;
import java.util.Scanner;
public class aula4 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        String pularlinhas = "\n\n";
        String separacao = "---------------------------------------------------------\n";
        String boasvindas = "Seja bem vindo a sua conta bancaria.\n\n";
        String nomeusuario = "Tiago Carlos Nascimento Dias";
        String conta = "Corrente";
        
        double dinheiro = 1000.00; // double do dinheiro
        String real = "R$ ";  // fazendo com que a variavel dinheiro receba uma string para ficar com o R$ antes do valor

        String nome = String.format("%-17s %s\n","Nome do usuário:",nomeusuario,"\n"); // nome do usuario da conta
        String tipoconta = String.format("%-17s %s\n","Tipo de conta:",conta,"\n"); // tipo de conta acessada
    
        
        String escreva = "Escreva um número de 1 a 4 para fazer qualquer operação desejada";
        String menuoperacoes = "operações" + pularlinhas + "1- Consultar Saldo.\n" + "2- Receber valor.\n" + "3- Transferir valor.\n" + "4- Sair.\n" + pularlinhas + escreva;
        
        String operacoes = pularlinhas + separacao + menuoperacoes;
        //menu de operações disponíveis
        
        String msgrcbts = "Digite o valor que vai ";
        String msgsair = "Muito obrigado por usar nosso banco!\nVolte sempre!!";
        String msgopc = "Essa opção não está disponível.";

        String oseusaldo = "O seu salda atual é:    " + real;

        int sair = 0;

        while (sair == 0) {
            System.out.println(separacao + boasvindas + nome + tipoconta + "Saldo Da conta: R$" + dinheiro + "\n" + separacao);
            System.out.println(operacoes);
            int opcoes = batata.nextInt();

            if (opcoes == 1){//Opção para ver o saldo do usuário
                System.out.println(oseusaldo + dinheiro);
            }
            else if (opcoes == 2){//Opção para receber um determinado valor definido por dinheiroreceber
                System.out.println(msgrcbts + "receber:\n");

                double dinheiroreceber = batata.nextDouble();
                dinheiro += dinheiroreceber;

                System.out.println(oseusaldo + dinheiro);
            }
            else if (opcoes == 3){//Opção para transferir um valor
                System.out.println(msgrcbts + "transferir:\n");

                double dinheirotransferir = batata.nextDouble();
                dinheiro -= dinheirotransferir;

                System.out.println(oseusaldo + dinheiro);
            }
            else if (opcoes == 4){//Opção para sair do aplicativo
                System.out.println(msgsair);
                sair = 1;
            }
            else{//Para caso a pessoa digite um valor que nao esteja entre 1 a 4 retorne uma mensagem
                System.out.println(msgopc);
            }
        }
        batata.close();
    }
}