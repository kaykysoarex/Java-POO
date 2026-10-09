# Atributos e métodos

**Nível:** Básico

## O que é?

**Atributos** guardam o estado de um objeto. **Métodos** descrevem ações ou cálculos que ele sabe realizar. Em `Triangle`, os lados são atributos e `area()` é um método.

## Para que serve?

O método evita repetir a fórmula da área em outras partes do programa. A regra de cálculo fica próxima dos dados que ela usa.

## Exemplo

```java
public double area() {
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}
```

## Como funciona?

- `a`, `b` e `c` são lidos diretamente pelo método porque pertencem ao mesmo objeto.
- `x.area()` calcula a área usando os lados do objeto `x`.
- `y.area()` usa a mesma lógica, mas com os lados do objeto `y`.
- A fórmula de Heron continua a mesma; somente mudou o lugar em que ela fica.

## Relação com Java básico

Você já estudou métodos. Em POO, eles podem ficar associados a uma classe e usar os atributos do objeto que os chamou.

## O que preciso lembrar?

- Atributos representam dados.
- Métodos representam comportamentos.
- Colocar o cálculo em `Triangle` reaproveita código.
- Isso é delegação de responsabilidades: o triângulo calcula a própria área.

## Exemplo prático

`Main.java` cria dois triângulos e chama o mesmo método para ambos. Assim, não há duas cópias da fórmula no programa principal.
