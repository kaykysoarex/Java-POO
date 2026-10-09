# Product

**Nível:** Básico

## O que é?

`Product` é uma classe que representa um produto em estoque. Ela reúne nome, preço e quantidade, além das operações que usam esses dados.

## Para que serve?

Em vez de calcular o estoque no programa principal, o próprio produto sabe informar seu valor total, receber unidades e remover unidades.

## Exemplo

```java
public void addProducts(int quantity) {
    this.quantity += quantity;
}
```

## Como funciona?

- Os atributos `name`, `price` e `quantity` descrevem o produto.
- O construtor cria o produto já com seus dados iniciais.
- `totalValueInStock()` calcula `price * quantity`.
- `addProducts()` e `removeProducts()` alteram o estoque.
- `this.quantity` é o atributo do objeto; `quantity` é o parâmetro recebido pelo método.
- `toString()` prepara um texto amigável para mostrar o estado do produto.

## Relação com Java básico

Você já conhecia parâmetros e retorno de métodos. Aqui, os métodos usam esses recursos para trabalhar com os dados de um objeto específico.

## O que preciso lembrar?

- Um objeto pode ter dados e métodos relacionados.
- `this` ajuda a diferenciar o atributo do parâmetro com o mesmo nome.
- O método `toString()` é chamado quando o objeto é mostrado com `System.out.println`.

## Exemplo prático

`Program.java` cria um produto, mostra seus dados, adiciona unidades e remove unidades. Para compilar:

```bash
javac Product.java Program.java
java Program
```
