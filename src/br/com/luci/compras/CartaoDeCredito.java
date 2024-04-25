package br.com.luci.compras;

import br.com.luci.compras.Compra;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaCompras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite; // Inicializa o saldo com o limite
        this.listaCompras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        // Verifica se o saldo disponível é suficiente para cobrir o valor da compra
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor(); // Atualiza o saldo disponível
            this.listaCompras.add(compra);
            return true; // Retorna verdadeiro indicando que a compra foi realizada com sucesso
        } else {
            return false; // Retorna falso indicando que o saldo disponível é insuficiente para a compra
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return listaCompras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n*********************************************\n");
        sb.append("COMPRAS REALIZADAS:\n");
        for (Compra compra : listaCompras) {
            sb.append(compra.toString()).append("\n");
        }
        sb.append("Limite: ").append(limite).append("\n");
        sb.append("Saldo: ").append(saldo).append("\n");
        sb.append("*********************************************\n");
        return sb.toString();
    }
}
