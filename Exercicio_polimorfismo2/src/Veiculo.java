class Veiculo {
    String modelo;
    double preco;

    Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    double getPreco() {
        return preco;
    }

    void printDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + preco);
    }
}
