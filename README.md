# Caça-Cobranças | Java

## Sobre o projeto

O Caça-Cobranças é um analisador de transações financeiras desenvolvido em Java.

O objetivo é ajudar a identificar possíveis cobranças duplicadas em extratos bancários, facilitando a conferência das movimentações.

## Como funciona

O sistema:

1. Lê um arquivo CSV contendo transações financeiras.
2. Converte os dados em objetos Java.
3. Armazena as transações em uma lista.
4. Compara estabelecimento, data e valor de cada movimentação.
5. Identifica pares de transações com informações iguais.
6. Exibe um relatório com os resultados da análise.

## Tecnologias utilizadas

- Java
- Programação orientada a objetos
- ArrayList
- BigDecimal
- LocalDate
- Manipulação de arquivos CSV

## Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Certifique-se de que o arquivo `extrato.csv` está na raiz do projeto.
3. Execute a classe `Main.java`.
4. Confira o resultado da análise no terminal.

## Limitações

O sistema utiliza uma regra simples de comparação. Transações com os mesmos dados não necessariamente representam cobranças indevidas.

O programa trabalha com dados fictícios e tem finalidade educacional.

## Próximas melhorias

- Identificar transações semelhantes em datas próximas.
- Permitir selecionar diferentes arquivos CSV.
- Melhorar o tratamento de arquivos inválidos.
- Exportar os resultados da análise.