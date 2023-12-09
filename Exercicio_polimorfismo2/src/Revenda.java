import java.util.ArrayList;
import java.util.Scanner;

public class Revenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        String continuarInsercao = "s";

        while (continuarInsercao.equalsIgnoreCase("s")) {
            System.out.println("Escolha o tipo de veículo a ser inserido (Moto/Carro):");
            String tipo = scanner.nextLine();

            if (tipo.equalsIgnoreCase("Moto")) {
                System.out.print("Insira o modelo da moto: ");
                String modelo = scanner.nextLine();
                System.out.print("Insira o preço da moto: ");
                double preco = scanner.nextDouble();
                System.out.print("Insira o ano da moto: ");
                int ano = scanner.nextInt();

                Moto moto = new Moto(modelo, preco, ano);
                veiculos.add(moto);
            } else if (tipo.equalsIgnoreCase("Carro")) {
                System.out.print("Insira o modelo do carro: ");
                String modelo = scanner.nextLine();
                System.out.print("Insira o preço do carro: ");
                double preco = scanner.nextDouble();
                System.out.print("Insira a quilometragem do carro: ");
                double km = scanner.nextDouble();

                Carro carro = new Carro(modelo, preco, km);
                veiculos.add(carro);
            }

            scanner.nextLine(); // Limpar o buffer do teclado

            System.out.print("Deseja inserir mais um veículo? (s/n): ");
            continuarInsercao = scanner.nextLine();
        }

        System.out.println("\nRelatório de Veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
        }

        double totalPrecos = 0;
        for (Veiculo veiculo : veiculos) {
            totalPrecos += veiculo.getPreco();
        }

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.ano >= 2008) {
                    moto.preco *= 1.1;
                }
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.km > 100000) {
                    carro.preco *= 0.92; 
                }
            }
        }

        System.out.println("\nTotal de preços antes dos ajustes: " + totalPrecos);

        double novoTotalPrecos = 0;
        for (Veiculo veiculo : veiculos) {
            novoTotalPrecos += veiculo.getPreco();
        }

        System.out.println("Novo total de preços após os ajustes: " + novoTotalPrecos);
    }
}