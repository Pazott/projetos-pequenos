package atividades.ConverterMoeda;

public class ConversorMoeda implements ConversaoFinanceira{
    
    private double real;
    private double dolar;
    //getters
    public double getReal() {
        return real;
    }
    public double getDolar() {
        return dolar;
    }
    //setters
    public void setReal(double real) {
        this.real = real;
    }
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
    @Override
    public double converterDolarParaReal() {
        return dolar * real;
    }
    //Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
}
