package br.com.luci.compras;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        CartaoDeCredito novoCartao = new CartaoDeCredito(200.00);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite 0 para sair ou 1 para continuar:");
            sair = leitura.nextInt();

            if (sair == 0) {
                break;
            }

            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = novoCartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para realizar a compra.");
                System.out.println(novoCartao.toString());
            }
        }
    }
}

