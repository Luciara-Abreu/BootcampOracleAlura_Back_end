package br.com.luci.compras;

public class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Fatura = '" + descricao + '\'' +
                ", valor=" + valor;
    }

   public int comparteTo(Compra outraCompra) {
        return  Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));

    }
}
