
package exercicios.entities;

/**
 * Person
 */
public class Person {

    private String nome;
    private int idade;
    private String email;

    public Person(String nome, int idade, String email) {

        this.nome = nome;
        this.idade = idade;
        this.nome = email;
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

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setEmail(String nome){
        this.email = email;
    }
}
