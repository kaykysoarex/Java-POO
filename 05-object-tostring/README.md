# Object e `toString()`

**Nível:** Básico

## O que é?

Todo objeto em Java tem como base a classe `Object`. O método `toString()` pode ser redefinido para informar como um objeto deve aparecer em texto.

## Para que serve?

Ele facilita a exibição de objetos. Assim, `System.out.println(product)` mostra dados úteis em vez de uma identificação técnica da memória.

## Exemplo

```java
public String toString() {
    return name + ", $ " + String.format("%.2f", price);
}
```

## Como funciona?

- `toString()` deve retornar um `String`.
- Quando o objeto é concatenado com texto ou enviado ao `println`, Java usa esse método.
- O método pode chamar `totalValueInStock()` para também mostrar o total calculado.

## Relação com Java básico

Você já trabalhou com `String` e `System.out.println`. Agora um objeto pode definir a mensagem que será transformada em texto.

## O que preciso lembrar?

- `toString()` melhora a apresentação de um objeto.
- O retorno deve ser uma `String`.
- O exemplo completo está na classe [`Product`](../04-product/Product.java).

## Exemplo prático

No exemplo de `Product`, a linha abaixo mostra automaticamente o retorno de `toString()`:

```java
System.out.println("Product data: " + product);
```
