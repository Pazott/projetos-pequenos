package atividades.ConversorTemperatura;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.setCelsius(20);
        temperatura.setFahrenheit(70);

        System.out.println("ºC " + temperatura.fahrenheitParaCelsius());
        System.out.println("ºF " + temperatura.celsiusParaFahrenheit());
    }
}
 