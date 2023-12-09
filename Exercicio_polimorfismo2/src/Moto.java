import java.util.Scanner;

class Moto extends Veiculo {
    int ano;

    Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o ano da moto: ");
        this.ano = scanner.nextInt();
    }
}