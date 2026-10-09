package exercicios.entities;

public class Person {

    public String nome;
    public double preco;
    public int quantidade;

    public Person(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
    public Person(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;

    }
    public Person(String nome) {

        this.nome = nome;
        

    }
}
