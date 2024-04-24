package br.com.luci.produto;

import java.time.LocalDate;

public class ProdutoPerecível extends Produto {
    private LocalDate dataValidade;

    public ProdutoPerecível(String nome, String marca, double preco, int quantidade) {
        super(nome, marca, preco, quantidade);
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    @Override
    public String toString() {
        return "Produto{" +
           "\n==================================================================================================\n" +
           ", Data de Validade = " + dataValidade +
           "\n==================================================================================================\n" +
        '}';
    }
}