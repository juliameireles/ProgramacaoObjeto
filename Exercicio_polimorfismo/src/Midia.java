import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {}

    public Midia(int c, double p, String n) {
        codigo = c;
        preco = p;
        nome = n;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
    }

    public void printDados() {
        System.out.println(getTipo() + ": " + getDetalhes());
    }

    public void inserirDados(Scanner scanner) {

        System.out.println("Insira o código:");
        int cod = scanner.nextInt();
        setCodigo(cod);

        System.out.println("Insira o preço:");
        double preco = scanner.nextDouble();
        setPreco(preco);

        scanner.nextLine(); 

        System.out.println("Insira o nome:");
        String nome = scanner.nextLine();
        setNome(nome);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

 