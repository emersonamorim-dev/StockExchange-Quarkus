# Stock Exchange Quarkus - Mulesoft
Codificação em Java usando framework Quarkus de aplicação de bolsa de valores desenvolvido com banco de dados MySQL e aplicação está usando Docker para usar conteiner na aplicação.
Integração com Mulesoft e testes em Cucumber para implementação de BDD e TDD para teste de software.

## Estrutura do Projeto

O projeto segue a estrutura padrão do Maven e está organizado da seguinte forma:

- \`src/main/java\`: Contém o código fonte da aplicação.
- \`src/test/java\`: Contém os testes da aplicação.

Dentro de \`src/main/java\`, o código está organizado em pacotes:

- \`model\`: Contém as classes de modelo que representam as entidades do domínio da aplicação.
- \`repository\`: Contém os repositórios, que são responsáveis pela persistência dos dados.
- \`service\`: Contém os serviços, que contêm a lógica de negócios da aplicação.
- \`controller\`: Contém os controladores, que manipulam as solicitações HTTP e retornam respostas HTTP.

## Modelos

Os modelos representam as entidades do domínio da aplicação. Cada modelo corresponde a uma tabela no banco de dados. Atualmente, temos os seguintes modelos:

- \`Stock\`: Representa uma ação na bolsa de valores.
- \`Transaction\`: Representa uma transação de compra ou venda de ações.
- \`Payment\`: Representa um pagamento associado a uma transação.

## Repositórios

Os repositórios são responsáveis pela persistência dos dados. Eles fornecem métodos para criar, ler, atualizar e excluir registros no banco de dados. Atualmente, temos os seguintes repositórios:

- \`StockRepository\`: Fornece métodos para manipular ações.
- \`TransactionRepository\`: Fornece métodos para manipular transações.
- \`PaymentRepository\`: Fornece métodos para manipular pagamentos.

## Serviços

Os serviços contêm a lógica de negócios da aplicação. Eles usam os repositórios para persistir os dados e podem realizar operações complexas que envolvem vários modelos. Atualmente, temos os seguintes serviços:

- \`StockService\`: Fornece métodos para manipular ações.
- \`TransactionService\`: Fornece métodos para manipular transações.
- \`PaymentService\`: Fornece métodos para manipular pagamentos.

## Controladores

Os controladores manipulam as solicitações HTTP e retornam respostas HTTP. Eles usam os serviços para realizar operações e retornam os resultados dessas operações como respostas HTTP. Atualmente, temos os seguintes controladores:

- \`StockController\`: Manipula solicitações HTTP relacionadas a ações.
- \`TransactionController\`: Manipula solicitações HTTP relacionadas a transações.
- \`PaymentController\`: Manipula solicitações HTTP relacionadas a pagamentos.

## Executando a Aplicação

Para executar a aplicação, você precisa ter o Java e o Maven instalados. Você pode então executar o seguinte comando na raiz do projeto:

\`\`\`
mvn quarkus:dev
\`\`\`

Isso iniciará a aplicação em modo de desenvolvimento. Você pode então acessar a aplicação em \`http://localhost:8080\`.

## Testando a Aplicação

Para testar a aplicação, você pode executar o seguinte comando na raiz do projeto:

\`\`\`
mvn test
\`\`\`

## Autor
Emerson Amorim
