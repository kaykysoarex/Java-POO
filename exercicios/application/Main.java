package exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.entities.Product;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Product product = new Product(nome, preco, quantidade);

        System.out.println(product.toString());

        System.out.println("Quantas unidades gostaria de adicionar?");
        int adcQuanti = sc.nextInt();

        product.adcProdutos(adcQuanti);
        System.out.println(product.toString());

        System.out.println("Quantas unidades gostaria de remover?");
        int rmvQuanti = sc.nextInt();

        product.rmvProdutos(rmvQuanti);
        System.out.println(product.toString());

        sc.close();
    }
}