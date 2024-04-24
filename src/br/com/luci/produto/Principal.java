package br.com.luci.produto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        var Televisor = new Produto("Televisor", "Toshiba", 3000, 30);
        var SansungGalax = new Produto("A32", "Sansung", 2000, 20);
        var DoceDeLeite = new ProdutoPerecível("Doce de Leite", "Elege", 4.39, 10);

        LocalDate dataValidade = LocalDate.of(2024, 10, 3);

        DoceDeLeite.setDataValidade(dataValidade);

        listaDeProdutos.add(Televisor);
        listaDeProdutos.add(SansungGalax);

        System.out.println(Televisor.toString());
        System.out.println(SansungGalax.toString());
        System.out.println(DoceDeLeite.toString());

        Produto p1 = new Produto("Caneta", "clarinex",  1.50, 30);
        Produto p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());


    }
}
