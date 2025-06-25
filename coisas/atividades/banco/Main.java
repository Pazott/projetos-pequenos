package atividades.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente contacorrente = new ContaCorrente();
        
        contacorrente.setdinheiro(1000.42);
        
        int i = 1;
        while(i == 1){
            System.out.println(contacorrente.getmenu());
            System.out.println(contacorrente.getopcoes());
            
            int opcoes = scanner.nextInt();
            
            
            if(opcoes == 1){
                System.out.println(contacorrente.getconsultarSaldo());
            }
            //consultar saldo
            if(opcoes == 2){
                System.out.println("Digite o número do dinheiro que deseja ser depositado: \n");
                
                double depositar = scanner.nextDouble();
                contacorrente.setdepositar(depositar);

                System.out.println("Foi efetuado um deposito de R$" + depositar);
            }
            //depositar
            if(opcoes == 3){
                System.out.println("Digite o número do dinheiro que deseja ser sacado: \n");

                double sacar = scanner.nextDouble();
                contacorrente.setsacar(sacar);

                System.out.println("Foi efetuado um saque de R$" + sacar);
            }
            //sacar
            if(opcoes == 4){
                System.out.println(contacorrente.gettarifa());
            }
            //consultar tarifas
            if(opcoes == 5){
                i = 0;
            }
            else{
                System.out.println("\nDigite uma opção de 1 a 5, por favor.");
            }



        }
    scanner.close();
    }
}
