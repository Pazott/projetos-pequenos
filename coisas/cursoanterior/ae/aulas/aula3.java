package ae.aulas;
import java.util.Scanner;
import java.util.Random;

public class aula3 {
    public static void main(String[] args){
        int ano_de_lancamento = 2022;
        boolean incluido_no_plano = true;

        String tipo_plano = "plus";

        if (ano_de_lancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }
        else {
            System.out.println("filme retrô que vale  a pena assistir!");
        }
        if (incluido_no_plano == true && tipo_plano.equals("plus")) {
            System.out.println("Filme liberado");
        }
        else {
            System.out.println("deve pagar a locação");
        }
    leitura.main(args);
    }
}

class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito.");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento.");
        int ano_de_lancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme.");
        double avaliacao = leitura.nextDouble();
    
        System.out.println(filme + "\n" + ano_de_lancamento + "\n" + avaliacao);
        leitura.close();
    }
}

class loop{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        
        double media_avaliacao = 0;
        
        //for
        //a primeira variavel i é o nome  dada para o for e apenas aquele for, criando uma variavel de qualquer nome e qualquer valor que seja um numero.
        //a segunda variavel i é uma condição atribuida a primeira variável.
        //a terceira variavel i é como a variavel vai superar a condição
        for (long i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação \n" + i);
            double nota = leitura.nextDouble();
            media_avaliacao += nota;
        }

        System.out.println(media_avaliacao/3);
        leitura.close();
    }
}

class outroloop{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            totalDeNotas++;
        }

        System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);
        leitura.close();
    }
}

class questao1{
    public static void main(String[] args){
        int resultado = new Random().nextInt(100);
        Scanner adivinhacao = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++);
            System.out.println("chute um número de 0 a 100.\n Apenas possui 5 tentativas");
            int adivenho = adivinhacao.nextInt();
            if(adivenho == resultado){
                System.out.println("Acertou AEAEAE" + adivenho);}
            if(adivenho != resultado){
                System.out.println("Que isso po, errou demais");}
            if(adivenho < 0){
                System.out.println("O cabeça dura, só pôe um número abaixo de 101 e acima de -1 `-´");}
            if(adivenho > 100){
                System.out.println("O cabeça dura, só pôe um número abaixo de 101 e acima de -1 `-´ ");}
        
    adivinhacao.close();
    }
}
