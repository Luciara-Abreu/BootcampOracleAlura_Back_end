import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class ListaComCollectionsSort {
    public static void main(String[] args) {
        List<Integer> listNumeros = new LinkedList<>();
        listNumeros.add(10);
        listNumeros.add(5);
        listNumeros.add(2);
        listNumeros.add(4);
        listNumeros.add(9);
        listNumeros.add(1);
        listNumeros.add(3);
        listNumeros.add(8);
        listNumeros.add(6);
        listNumeros.add(7);

        // Ordenação em ordem crescente
        Collections.sort(listNumeros);
        System.out.println("Ordenação crescente:");
        System.out.println(listNumeros);
        System.out.println();

        // Ordenação em ordem decrescente
        Collections.sort(listNumeros, Collections.reverseOrder());
        System.out.println("Ordenação decrescente:");
        System.out.println(listNumeros);
        System.out.println();
    }
}
