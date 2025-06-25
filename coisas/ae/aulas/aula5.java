package ae.aulas;
import java.util.Scanner;


public class aula5 {
    
}
class pessoa{
    String helloworld;

    void mostrarolamundo(){
        System.out.println(helloworld);
    }
}    

class calculadora{

        Scanner numero = new Scanner(System.in);
        
        String opcoes = "Digite um numero que vai ser multiplicado por 2";

    void calculando(){
        System.out.println(opcoes);
        double numeros = numero.nextDouble();
        double multiplica = numeros * 2;
        
        System.out.println(multiplica);
    }
}


class musica{
    public static void main(String[] args) {
        String titulo = "Valsinha";
        String artista = "Chico Buarque";
        int ano_lancamento = 1971;


        for(int i = 0; i < 3; i++);
            System.out.println("diga sua avaliação");


        System.out.println("Nome da Música: " + titulo + "\nNome do artista da música: "+ artista + "\nLançada em: " + ano_lancamento);
    }
}