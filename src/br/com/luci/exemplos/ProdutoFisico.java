package br.com.luci.exemplos;

public class ProdutoFisico extends Produto implements Calculavel {
    public ProdutoFisico(double preco) {
        super(preco);
    }

    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        double preco = 0;
        return preco * 1.05;
    }
}
