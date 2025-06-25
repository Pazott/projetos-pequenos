package ae.aulas;
public class aula2 {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anodelancamento = 2022;
        System.out.println("Ano de lançamento: " + anodelancamento);



        
        double media = (2.5 + 7.3 + 8.3) /3;
        double nota = media;
        int classificacao;
        classificacao = (int) (nota /2);



        System.out.println(classificacao + "estrelas");
        teste.main(args);
    }
}
class teste{
    public static void main(String[] args){
        int b = 2;
        int a = 3;
        char d = ('ã');

        System.out.println(d);



        boolean maior = (b > a);
        boolean menor = (b < a);
        boolean diferente = (b != a);
        boolean igual = (b == a);

        System.out.println(maior + "\n" + menor + "\n" + diferente + "\n" + igual);
    }
}
class questao{
    public static void main(String[] args){
        double temperatura_celsius = 24;
        double conversao_para_fahrenheit = (temperatura_celsius * 1.8) + 32;
        int tranformando_fahrenheit_em_int = (int) (conversao_para_fahrenheit);

        System.out.println(tranformando_fahrenheit_em_int);
    }
}
class questao_2{
    public static void main(String[] args){
        int nota_decimal_1 = 9;
        double nota_decimal_2 = 2.24;
        double media = (nota_decimal_1 + nota_decimal_2) /2;
        int converter_decimal_para_inteiro = (int) (media);
        System.out.println(converter_decimal_para_inteiro);
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        
        char charlizard = ('d');
        String stringado = ("batata");
        System.out.println(charlizard + stringado);
        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

        double precoProduto = 4.25;
        int quantidade = 2;
        double conta_do_mercado = precoProduto * quantidade;
        System.out.println(conta_do_mercado);
        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double valorEmDolares = 10;
        double reais = 4.94;
        double conversao_direta_dolar_para_real = valorEmDolares * reais;
        System.out.println(conversao_direta_dolar_para_real);
        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double precoOriginal = 25;
        double percentualDesconto = 15;
        double formula_para_porcentagem = (precoOriginal * percentualDesconto) /100;
        System.out.println(formula_para_porcentagem); 
        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
    }
}
