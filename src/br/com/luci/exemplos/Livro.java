package br.com.luci.exemplos;

public class Livro extends Produto implements Calculavel {
    private String autor;

    public Livro(double preco, String autor) {
        super(preco);
        this.autor = autor;
    }

    public double calcularPrecoFinal() {
        double preco = 0;
        return preco * 0.9;
    }
}
