package atividades.Calculavel.src;
import atividades.Calculavel.interfa.Calculavel;

public class Livros extends algo implements Calculavel {
    algo coisas = new algo();
    
    public Livros(){
        setQuantidade(0);
        setDesconto(0);
        setPreco(0);
    }
    
    @Override
    public double calcularPrecoFinal() {
        return (getPreco() * getQuantidade()) * (getDesconto() / 100);
    }
}
    //Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
    
    //Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
