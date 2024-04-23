
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lancamento?");
        int anoLancamento = leitura.nextInt();

        System.out.println("Qual o ano de lancamento?");
        double avaliação = leitura.nextDouble();


        System.out.println("Legal!! Também gosto do filme " + filme + "Muito obrigado pelas informações!");
    }
}
