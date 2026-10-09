# Classes e objetos

**Nível:** Básico

## O que é?

Uma **classe** é um molde que descreve dados de algo. Um **objeto** é uma variável criada a partir desse molde. Neste exemplo, `Triangle` é a classe e `x` e `y` são objetos que representam triângulos.

## Para que serve?

Classes permitem reunir os dados que pertencem ao mesmo elemento. Em vez de criar variáveis soltas para os lados de cada triângulo, cada objeto guarda suas próprias medidas.

## Exemplo

```java
Triangle x = new Triangle();
x.a = 3.0;
x.b = 4.0;
x.c = 5.0;
```

## Como funciona?

- `Triangle.java` define os atributos `a`, `b` e `c`.
- `new Triangle()` instancia, isto é, cria um novo objeto.
- `Main.java` cria dois objetos: um para `x` e outro para `y`.
- Cada objeto recebe valores próprios, mesmo sendo criado pela mesma classe.

## Relação com Java básico

Você já usou variáveis e tipos como `double`. Agora esses dados podem ficar agrupados em um objeto, como os três lados de um triângulo.

## O que preciso lembrar?

- Classe é o molde.
- Objeto é uma instância criada com `new`.
- Objetos diferentes têm seus próprios valores.

## Exemplo prático

O programa lê os lados de dois triângulos e calcula suas áreas no programa principal. A versão anterior, sem objetos, está em [`../exemplos/triangle-sem-poo`](../exemplos/triangle-sem-poo/README.md); ela ajuda a perceber por que agrupar os lados em `Triangle` é mais organizado.
