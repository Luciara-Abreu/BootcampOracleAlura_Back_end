package br.com.luci.ecommerce;

//Classe Principal
public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());
    }
}