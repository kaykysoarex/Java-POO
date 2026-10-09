# Estudos de POO com Java

Este repositório é meu caderno de estudos de **Programação Orientada a Objetos (POO) com Java**. Ele reúne exemplos pequenos, separados por assunto, para facilitar a revisão e registrar a evolução dos estudos.

## Objetivo do repositório

- Estudar cada conceito em exemplos simples e compiláveis.
- Comparar uma solução sem POO com a organização usando classes e objetos.
- Guardar exercícios e exemplos práticos do módulo.
- Manter uma trilha de estudo fácil de consultar depois.

## Conteúdos estudados

- Classes e objetos
- Atributos
- Métodos
- Instanciação de objetos
- Reaproveitamento de código
- Delegação de responsabilidades
- Uso de `this`
- `Object` e `toString()`
- Membros estáticos
- Métodos estáticos
- Constantes (`PI` e `IOF`)
- Conversão de moeda com uma classe auxiliar

> O diretório de encapsulamento foi preparado, mas não é considerado conteúdo estudado neste momento: ainda não há exemplo do material para ele.

## Mapa de estudo

```text
POO Java
│
├── Classes e objetos
├── Atributos
├── Métodos
├── Instanciação
├── Reaproveitamento e delegação
├── Product
├── Object / toString()
├── Membros estáticos
├── Calculator
├── CurrencyConverter
└── Exercícios
```

## Como estudar os exemplos

Entre em uma pasta e compile somente os arquivos dela. Por exemplo:

```bash
cd 04-product
javac Product.java Program.java
java Program
```

Os exemplos não usam `package`; por isso, pastas diferentes podem ter classes com nomes iguais sem se misturarem.

## Evolução dos estudos

| Etapa | Foco |
| --- | --- |
| 01 | Criar objetos a partir de uma classe `Triangle` |
| 02 | Colocar o cálculo de área dentro do próprio objeto |
| 04 e 05 | Modelar um produto e apresentar suas informações com `toString()` |
| 06 | Usar uma classe de utilidade com membros estáticos |
| 07 | Aplicar constante e método estático em um exercício de conversão |

## Conteúdo extra

Nenhum conceito extra foi adicionado. Os arquivos seguem apenas os assuntos e exemplos citados para este módulo.
