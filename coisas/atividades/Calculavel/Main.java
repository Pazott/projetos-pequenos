package atividades.Calculavel;

import atividades.Calculavel.src.Livros;
import atividades.Calculavel.src.ProdutoFisico;

public class Main {
    public static void main(String[] args) {
        Livros livro = new Livros();
        ProdutoFisico produto = new ProdutoFisico();
        
        livro.setPreco(20);
        livro.setDesconto(30);
        livro.setQuantidade(6);
        double precofinalliv = livro.calcularPrecoFinal();

        produto.setDesconto(50);
        produto.setPreco(100);
        produto.setPreco(2);
        double precofinalprod = produto.calcularPrecoFinal();

        System.out.println("O preço total do produto incluindo o desconto é de R$" + precofinalprod);
        System.out.println("O preço total do produto incluindo o desconto é de R$" + precofinalliv);
    }
}
