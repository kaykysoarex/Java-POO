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

    public void setNome() {
        if (nome == "") {
            System.out.println("Nome invalido");
        } else {
            this.nome = nome;
        }
    }

    public void setPreco() {
        if (preco < 0) {
            System.out.println("Digite um valor maior que 0");
        } else {
            this.preco = preco;
        }
    }

    public void setQuantidade() {
        if (quantidade < 0) {
            System.out.println("Digite uma quantidade maior que 0");
        }
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public int adcProdutos(int quantidade) {
        return this.quantidade += quantidade;
    }

    public int rmvProdutos(int quantidade) {
        return this.quantidade -= quantidade;
    }

    public String toString() {
        return "Nome: " + getNome() + " | Preço: " + String.format("%.2f", getPreco()) + " | Quantidade: " + getQuantidade();
    }
}