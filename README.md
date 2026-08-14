☕ Demo DAO JDBC

Projeto desenvolvido durante meus estudos de Java, com foco em acesso a banco de dados utilizando JDBC (Java Database Connectivity) e aplicação do padrão de projeto DAO (Data Access Object).

O projeto simula um pequeno sistema de vendas e departamentos, permitindo praticar operações de persistência de dados diretamente com Java e MySQL.

🎯 Objetivo

O principal objetivo deste projeto foi compreender, na prática, como uma aplicação Java pode se conectar e interagir com um banco de dados relacional utilizando JDBC.

Durante o desenvolvimento, foram praticados conceitos fundamentais para a construção de uma camada de acesso a dados.

🛠️ Tecnologias utilizadas
☕ Java
🗄️ MySQL
🔌 JDBC
🏗️ Padrão DAO
💻 IntelliJ IDEA
🔧 Git e GitHub
📚 Conceitos praticados
Conexão com o banco de dados

Configuração e gerenciamento da conexão entre a aplicação Java e o MySQL.

Operações CRUD

Implementação de operações para:

INSERT — inserir registros
SELECT — consultar registros
UPDATE — atualizar registros
DELETE — remover registros
PreparedStatement

Utilização de PreparedStatement para executar comandos SQL parametrizados, trabalhando com placeholders (?) e evitando a construção direta de consultas com valores concatenados.

Generated Keys

Recuperação das chaves geradas automaticamente pelo banco após uma operação de inserção utilizando getGeneratedKeys().

Padrão DAO

Aplicação do padrão Data Access Object (DAO) para separar a lógica de acesso ao banco de dados das demais partes da aplicação.

Essa separação ajuda a manter o código mais organizado e facilita futuras alterações na camada de persistência.

📂 Estrutura do projeto
src
├── application
│   └── Classes responsáveis pela execução da aplicação
│
├── db
│   └── Classes responsáveis pela conexão e gerenciamento do banco
│
└── model
    ├── dao
    │   └── Interfaces e implementações dos DAOs
    │
    └── entities
        └── Classes que representam as entidades do sistema

database
└── coursejdbc.sql
    └── Script para criação e configuração do banco de dados

db.properties.example
└── Exemplo de configuração da conexão com o banco
🗃️ Banco de dados

O projeto utiliza MySQL e trabalha principalmente com as entidades:

Seller
Department

A relação entre elas permite praticar consultas envolvendo diferentes tabelas e operações de persistência.

📄 Script do banco

O projeto disponibiliza o arquivo:

database/coursejdbc.sql

Esse script contém a estrutura necessária para criar o banco de dados, suas tabelas e os dados iniciais utilizados pelo projeto.

Dessa forma, quem clonar o projeto poderá configurar o banco de dados localmente sem precisar criar as tabelas manualmente.

⚙️ Como executar o projeto
1. Clone o repositório
git clone https://github.com/Kallel-19/demo-dao-jdbc.git
2. Crie o banco de dados

Abra o MySQL Workbench ou outro cliente MySQL e execute o script:

database/coursejdbc.sql

O script será responsável por criar o banco coursejdbc, suas tabelas e os dados necessários para executar o projeto.

3. Configure a conexão

O projeto disponibiliza um arquivo de exemplo:

db.properties.example

Copie esse arquivo e renomeie para:

db.properties

Depois, configure suas credenciais do MySQL:

user=SEU_USUARIO
password=SUA_SENHA
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false

⚠️ O arquivo db.properties contém informações de configuração local e não deve ser enviado ao GitHub. Por isso, ele está incluído no .gitignore.

4. Execute a aplicação

Abra o projeto na sua IDE, configure o JDK e execute as classes presentes no pacote application.

🔐 Segurança

As credenciais do banco de dados não são armazenadas diretamente no repositório.

O projeto utiliza:

db.properties

para as configurações locais e:

db.properties.example

como modelo para quem deseja executar o projeto.

Dessa forma, informações como usuário e senha do MySQL não precisam ser expostas publicamente.

💡 O que aprendi

Este projeto foi importante para entender melhor o caminho que os dados percorrem entre uma aplicação Java e um banco de dados.

Além de praticar SQL, pude compreender conceitos como:

Java → JDBC → DAO → Banco de Dados

Também pude entender melhor a importância de separar responsabilidades dentro da aplicação, utilizando o padrão DAO para organizar a camada responsável pelo acesso aos dados.

Essa experiência serviu como base para meus estudos posteriores relacionados ao desenvolvimento Back-End e à construção de aplicações mais estruturadas.

🚀 Próximos passos

Continuar evoluindo meus conhecimentos em Java e desenvolvimento Back-End, avançando para tecnologias e conceitos como:

Spring Boot
Spring Data JPA
APIs REST
Persistência com JPA/Hibernate
Arquitetura de aplicações

📌 Projeto desenvolvido para fins educacionais e de estudo.

🔗 Repositório:
https://github.com/Kallel-19/demo-dao-jdbc

⭐ Se este projeto foi útil para você, fique à vontade para deixar uma estrela no repositório!
