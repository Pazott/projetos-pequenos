package projetocalc.classes;

public interface Mensagens {

        //Inglês -- English
        public String introduction = """
                        Welcome to the calculator!
                        
                        Enter a number that you wants to a operation:

                        1- Addition             4- Multiplication
                        2- Subtraction          5- Potencialization
                        3- Division             6- Radicalization

                        0- Close program        9- Change language
                        """;
        
        public String primnumb = "Enter the first number of the operation: ";
        
        public String segnum = "Enter the second number of the operation: ";
        
        public String language = "Changing language to brazilian portuguese...";

        public String close = """
                        Thanks for using the program!
                        Closing the program...
                        """;
        public String error = "Please, enter only number that are in above!";
        
        public String error2 = "Try to enter number in integer number!";
        
        public String except = "An error occurred, please try again!";

        //Brazilian portuguese -- Português brasileiro
        
        public String introducaoPtBR = """               
        Boas vindas a calculadora!
        
        Digite o numero da qual operação deseja realizar:

        1- Adição               4- Multiplicação
        2- Subtração            5- Potencialização 
        3- Divisão              6- raciacização

        0- Fechar Programa      9- Trocar linguagem
        """;
        
        public String primnumPTBR = "Digite o primeiro número: ";
        
        public String segnumPTBR = "Digite o segundo número: ";
        
        public String linguagem = "O idioma está sendo trocado para Inglês...";

        public String fecharPtBR = "Muito obrigado por usar o programa!";
        
        public String erroPtBR = "Digite apenas os numeros indicados acima!";
        
        public String entradainvalidaPTBR = "Entrada inválida! Digite apenas números da forma que está escrita acima!";
        
        public String exceptPtBR = "Ocorreu um erro, tente novamente!";


}
