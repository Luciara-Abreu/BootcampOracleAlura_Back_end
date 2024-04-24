package br.com.luci.exemplos;

// Classe Produto
public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    public Produto(double preco) {
    }

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}
