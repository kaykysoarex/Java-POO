package exercicios.entities;

/**
 * Product
 */
public class Product {

    private String nome;
    private double preco;
    private int quantidade;

    public Product(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            System.out.println("Nome invalido");
        } else {
            this.nome = nome;
        }
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Valor invalido");
        } else {
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Digite uma quantidade maior que 0");
        } else {
            this.quantidade = quantidade;
        }
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void adcProdutos(int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Digite um valor positivo!");
        } else {
            this.quantidade += quantidade;
        }
    }

    public void rmvProdutos(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Adicione um valor positivo ou maior que 0");
        } else if (quantidade > this.quantidade) {
            System.out.println("A quantidade digitada é maior que o valor disponivel em estoque!");
        } else {
            this.quantidade -= quantidade;
        }
    }

    public String toString() {
        return "Nome: " + getNome() + " | Preço: " + String.format("%.2f", preco) + " | Quantidade: " + getQuantidade()
                + " | Valor total: " + String.format("%.2f", valorTotalEstoque());
    }
}