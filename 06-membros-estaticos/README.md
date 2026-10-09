# Membros estáticos e Calculator

**Nível:** Intermediário

## O que é?

Um membro estático pertence à classe, e não a um objeto específico. Por isso, `Calculator.circumference(radius)` é chamado usando o nome da classe.

## Para que serve?

É útil para operações que não precisam guardar dados diferentes para cada objeto. O cálculo de circunferência e volume depende apenas do raio recebido.

## Exemplo

```java
public static final double PI = 3.14159;

public static double circumference(double radius) {
    return 2.0 * PI * radius;
}
```

## Como funciona?

- `static` permite chamar o método sem criar `new Calculator()`.
- `PI` é uma constante: `final` impede que seu valor seja alterado.
- Métodos estáticos usam o parâmetro `radius` e a constante `PI` para realizar os cálculos.
- Uma versão com membros de instância exigiria criar um objeto antes de chamar os métodos; nesta evolução, a classe é usada diretamente.

## Relação com Java básico

Você já usou métodos como `Math.sqrt()`. Eles também são chamados pelo nome da classe porque são estáticos. `Calculator` segue a mesma ideia.

## O que preciso lembrar?

- Membro estático pertence à classe.
- Método estático é chamado por `NomeDaClasse.metodo()`.
- `static final` representa uma constante.

## Exemplo prático

`Program.java` lê um raio e usa `Calculator` para calcular circunferência e volume da esfera.
