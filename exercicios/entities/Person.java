package exercicios.entities;

public class Person {

    private String nome;
    private int idade;
    private String email;

    public Person(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        }
    }

    public String introduzir() {
        return "Olá! Meu nome é " + nome
                + ", tenho " + idade
                + " anos e meu e-mail é " + email + ".";
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nIdade: " + idade
                + "\nE-mail: " + email;
    }
}
