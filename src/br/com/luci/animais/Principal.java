package br.com.luci.animais;

import br.com.luci.screenmatch.modelos.Filme;
import br.com.luci.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Cachorro doguinho = new Cachorro("baraõzinho", 2, "M", 70.5, 4);
        var doguinho2 = new Cachorro("Lulu", 1, "F", 50, 4);

        ArrayList<Animal> listaCachorro = new ArrayList();
        listaCachorro.add(doguinho);
        listaCachorro.add(doguinho2);

        /*
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
        */

        for (Animal item: listaCachorro){
            //System.out.println(item.toString());
            Animal animal = (Animal) item;
            System.out.println(animal.toString());
        }

    }
}
