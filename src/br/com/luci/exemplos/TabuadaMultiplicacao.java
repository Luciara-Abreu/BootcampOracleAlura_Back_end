package br.com.luci.exemplos;

// Classe TabuadaMultiplicacao implementando Tabuada
public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de multiplicação do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

