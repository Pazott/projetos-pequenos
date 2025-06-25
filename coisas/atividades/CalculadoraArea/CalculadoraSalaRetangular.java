package atividades.CalculadoraArea;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private int largura;
    private int altura;

    public int getLargura() {
        return largura;
    }
    public int getAltura() {
        return altura;
    }    
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    public int calcularPerimetro() {
        return (altura * 2) + (largura * 2);
    }    
    //Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
    
    //Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
    
    //Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
    
    //Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
}
