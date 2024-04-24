package br.com.luci.screenmatch.primcipalComListas;

import br.com.luci.screenmatch.modelos.Filme;
import br.com.luci.screenmatch.modelos.Serie;
import br.com.luci.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            } else if (item instanceof Serie) {
                Serie serie = (Serie) item;
                System.out.println("Temporadas: " + serie.getTemporadas());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        buscaPorArtista.add("Luci Abreu");
        System.out.println(buscaPorArtista);
        System.out.println("--------------------------------------------------------------------------");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Listas ordenadas por datas");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);


    }
}
