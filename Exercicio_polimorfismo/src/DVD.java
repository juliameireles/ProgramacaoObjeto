import java.util.Scanner;

class DVD extends Midia {
    private int nFaixas;

    public DVD() {}

    public DVD(int c, double p, String s, int f) {
        super(c, p, s);
        nFaixas = f;
    }

    
    public String getTipo() {
        return "DVD";
    }

   
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    public void setFaixas(int f) {
        nFaixas = f;
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

        System.out.println("Insira o número de faixas do DVD:");
        int faixas = scanner.nextInt();
        setFaixas(faixas);
    }

}
