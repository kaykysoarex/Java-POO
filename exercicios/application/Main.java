package exercicios.application;

import java.util.Scanner;
import exercicios.entities.Person;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = sc.nextLine();

        Person person = new Person(nome, idade, email);

        System.out.println("\n--- Dados cadastrados ---");
        System.out.println(person);

        System.out.println("\n" + person.introduzir());

        System.out.print("\nDigite a nova idade: ");
        int novaIdade = sc.nextInt();

        person.setIdade(novaIdade);

        System.out.println("\n--- Dados atualizados ---");
        System.out.println(person);

        sc.close();
    }
}