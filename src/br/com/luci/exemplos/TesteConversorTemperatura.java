package br.com.luci.exemplos;

// Classe de Teste
public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
    }
}
