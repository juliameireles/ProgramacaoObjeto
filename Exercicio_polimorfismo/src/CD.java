import java.util.Scanner;

class CD extends Midia {
    private int nMusicas;

    public CD() {}

    public CD(int c, double p, String s, int m) {
        super(c, p, s);
        nMusicas = m;
    }

   
    public String getTipo() {
        return "CD";
    }

  
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    public void setMusicas(int m) {
        nMusicas = m;
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

        System.out.println("Insira o número de músicas do CD:");
        int musicas = scanner.nextInt();
        setMusicas(musicas);
    }
}