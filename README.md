# Verificação de Número Primo em Java

## Descrição

Este programa verifica se um número inteiro é primo utilizando a
linguagem Java e a interface gráfica da classe `JOptionPane`, da
biblioteca `javax.swing`.

Um número primo é um número inteiro maior que 1 que possui exatamente
dois divisores positivos: 1 e ele mesmo.

O programa solicita ao usuário um número inteiro por meio de uma janela
de entrada e apresenta, em uma janela de mensagem, se o número informado
é primo.

## Objetivos

-   Compreender o conceito de número primo.
-   Utilizar variáveis inteiras e booleanas.
-   Receber dados por meio de janelas gráficas com `JOptionPane`.
-   Aplicar estruturas condicionais (`if` e `else`).
-   Utilizar o operador módulo (`%`) para verificar divisibilidade.
-   Aplicar uma estrutura de repetição `for`.
-   Apresentar o resultado por meio de uma janela gráfica.
-   Analisar a lógica e a complexidade do algoritmo.

## Conceito matemático

Um número primo é um inteiro maior que 1 que possui exatamente dois
divisores positivos: 1 e ele mesmo.

Exemplos:

    Número Classificação   Justificativa
  -------- --------------- -------------------------------------------------
         2 Primo           Possui como divisores positivos apenas 1 e 2.
         3 Primo           Possui como divisores positivos apenas 1 e 3.
         4 Não primo       É divisível por 1, 2 e 4.
         9 Não primo       É divisível por 1, 3 e 9.
        17 Primo           Possui como divisores positivos apenas 1 e 17.
         1 Não primo       Não possui exatamente dois divisores positivos.

## Funcionamento do programa

O programa realiza as seguintes etapas:

1.  **Inicialização:** declara a variável `n`, que armazena o número
    informado, e a variável booleana `ePrimo`, inicialmente definida
    como `true`.
2.  **Entrada de dados:** utiliza `JOptionPane.showInputDialog()` para
    solicitar um número inteiro. O texto recebido é convertido para
    `int` com `Integer.parseInt()`.
3.  **Validação inicial:** se `n` for menor ou igual a 1, define
    `ePrimo = false`.
4.  **Tratamento do número 2:** considera o número 2 primo.
5.  **Verificação de números pares:** se o número for par e maior que 2,
    define `ePrimo = false`.
6.  **Contagem de divisores ímpares:** para números ímpares maiores que
    2, percorre os valores ímpares de 1 até `n` e conta quantos dividem
    o número exatamente.
7.  **Classificação:** se a contagem de divisores for maior que 2,
    define `ePrimo = false`.
8.  **Saída:** utiliza `JOptionPane.showMessageDialog()` para informar
    se o número é primo.

**Observação sobre o algoritmo:** o laço percorre todos os números
ímpares até `n`, embora bastasse testar possíveis divisores até a raiz
quadrada de `n`. A implementação é adequada para demonstrar
condicionais, repetição e o operador módulo, mas pode ser otimizada para
números maiores.

## Código-fonte

O arquivo `Principal.java` contém a implementação do programa.

O arquivo `pom.xml`, caso o projeto utilize Apache Maven, deve estar na
raiz do projeto e conter as configurações necessárias para compilar e
executar a aplicação. O código apresentado, por si só, não exige
dependências externas: `JOptionPane` faz parte das bibliotecas padrão do
Java.

## Tecnologias utilizadas

-   **Java:** linguagem de programação utilizada na implementação.
-   **`javax.swing.JOptionPane`:** classe utilizada para apresentar
    janelas de entrada e de mensagem.
-   **`Integer.parseInt()`:** método que converte o texto digitado para
    um valor do tipo `int`.
-   **Operador módulo (`%`):** utilizado para verificar se uma divisão é
    exata.

## Pré-requisitos

Antes de executar o projeto, instale o Java Development Kit (JDK).

Se o projeto utilizar Maven, instale também o Apache Maven. Verifique as
instalações com:

``` bash
java -version
javac -version
mvn -version
```

## Como executar

### Opção 1: compilar e executar diretamente

No terminal, no diretório que contém `Principal.java`, execute:

``` bash
javac Principal.java
java Principal
```

O programa abrirá uma janela para a entrada do número e outra para
exibir o resultado.

### Opção 2: executar com Maven

Se o projeto estiver configurado com Maven e com o plugin Maven Exec,
execute no diretório que contém `pom.xml`:

``` bash
mvn compile
mvn exec:java -Dexec.mainClass="Principal"
```

O comando pressupõe que a classe `Principal` esteja no pacote padrão e
que o plugin Maven Exec esteja configurado no `pom.xml`. Se a classe
estiver em um pacote nomeado, informe seu nome completo no parâmetro
`exec.mainClass`.

## Exemplos de execução

### Exemplo 1: número primo

Entrada na janela:

``` text
17
```

Mensagem apresentada:

``` text
17 é um número primo.
```

### Exemplo 2: número composto

Entrada na janela:

``` text
9
```

Mensagem apresentada:

``` text
9 não é um número primo.
```

### Exemplo 3: número menor que 2

Entrada na janela:

``` text
1
```

Mensagem apresentada:

``` text
1 não é um número primo.
```

### Exemplo 4: número par maior que 2

Entrada na janela:

``` text
20
```

Mensagem apresentada:

``` text
20 não é um número primo.
```

## Conceito fundamental: operador módulo

O operador `%` retorna o resto de uma divisão inteira.

``` java
if (n % i == 0) {
    contaDivisores = contaDivisores + 1;
}
```

Quando `n % i == 0`, significa que `i` divide `n` sem deixar resto. O
programa utiliza essa propriedade para contar divisores.

## Complexidade do algoritmo

-   **Complexidade de tempo:** `O(n)` no pior caso, pois o laço percorre
    os números ímpares até `n`.
-   **Complexidade de espaço auxiliar:** `O(1)`, pois utiliza uma
    quantidade fixa de variáveis, independentemente do valor de entrada.

Para melhorar o desempenho, uma implementação pode testar divisores
ímpares apenas até a raiz quadrada de `n`, interrompendo a busca quando
encontrar um divisor. Essa otimização reduz significativamente a
quantidade de verificações para números grandes.

## Limitações

-   A entrada é convertida para `int`, portanto precisa estar dentro dos
    limites desse tipo.
-   Se o usuário cancelar a janela ou informar texto que não represente
    um inteiro válido, `Integer.parseInt()` pode lançar uma exceção.
-   O algoritmo percorre todos os números ímpares até `n`, o que pode
    ser lento para valores grandes.
-   O programa apresenta o resultado em janelas gráficas, não no
    terminal.

## Conclusão

O programa demonstra como verificar se um número é primo utilizando
Java, estruturas condicionais, repetição, variáveis booleanas e o
operador módulo. A interface `JOptionPane` permite receber dados e
apresentar resultados por meio de janelas gráficas.

A implementação é útil para o estudo introdutório de algoritmos e pode
ser aprimorada com validação de entrada e uma busca de divisores
limitada à raiz quadrada do número.
