package exercicios.entities;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public Product(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
    public Product(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;

    }
    public Product(String nome) {

        this.nome = nome;
        

    }
}
