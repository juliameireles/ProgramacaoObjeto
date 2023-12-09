import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DVD dvd = new DVD();
        System.out.println("Inserindo dados para o DVD:");
        inserirDadosComExcecao(dvd, scanner);

        CD cd = new CD();
        System.out.println("\nInserindo dados para o CD:");
        inserirDadosComExcecao(cd, scanner);

        System.out.println("\nDetalhes do DVD:");
        dvd.printDados();

        System.out.println("\nDetalhes do CD:");
        cd.printDados();

        scanner.close();
    }

    private static void inserirDadosComExcecao(Midia midia, Scanner scanner) {
        boolean dadosInseridos = false;

        do {
            try {
                midia.inserirDados(scanner);
                dadosInseridos = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira o dado corretamente.");
                scanner.nextLine(); // Limpar o buffer
            }
        } while (!dadosInseridos);
    }
}



