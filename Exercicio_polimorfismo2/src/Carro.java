import java.util.Scanner;

class Carro extends Veiculo {
    double km;

    Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    void setKm(double km) {
        this.km = km;
    }

    void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a quilometragem do carro: ");
        this.km = scanner.nextDouble();
    }
}


