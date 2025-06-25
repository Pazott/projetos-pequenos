package atividades.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double celsius;
    private double fahrenheit; 

    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return celsius + 33.8;
    }
    public double fahrenheitParaCelsius() {
        return fahrenheit - 33.8;
    }
}
    //Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
    
    //Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
    
    //Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
