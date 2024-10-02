# Sistema de Reserva e Avaliação de restaurantes

Esse projeto foi desenvolvido utilizando o Spring Boot, seguindo os princípios de Clean Architecture para garantir modularidade e fácil manutenção.

## Tecnologias usadas :computer:

- Java 17: Linguagem de programação principal.
- Spring Boot 3.3.4: Framework principal para criação do backend.
- Spring Web: Utilizado para construir APIs RESTful.
- Spring Data JPA: Facilita a persistência de dados em bancos de dados relacionais, utilizando Hibernate sob o capô.
- Spring Boot DevTools: Ferramenta de desenvolvimento para agilizar o processo de desenvolvimento com recursos como reinicialização automática.
- Lombok: Biblioteca para reduzir o código boilerplate como getters, setters, construtores, etc.
- MySQL Driver: Driver JDBC para conexão com banco de dados MySQL.
- Validation: Validação de beans utilizando Hibernate Validator.
- Java Mail Sender: Utilizado para envio de e-mails no sistema.


## Arquitetura :triangular_ruler:

Clean Architecture proposta por Robert C. Martin. esse conceito de arquitetura é dividido nas seguintes camadas:

- Entities (Regras de Negócio da Empresa): Classes que representam os objetos do domínio, como Restaurante, Reserva, e Avaliacao. Essas classes residem na camada central e são independentes de frameworks e tecnologias externas.
- Use Cases (Regras de Negócio da Aplicação): Classes que implementam a lógica de negócio específica para cada caso de uso, como CadastrarRestaurante, FazerReserva, etc. Eles orquestram a comunicação entre as entidades e os adaptadores.
- Interface Adapters (Adaptadores de Interface): Camada que adapta as entradas e saídas do sistema para os casos de uso e entidades. Inclui os controladores (RestauranteController, ReservaController) e repositórios (RestauranteRepository).
- Frameworks & Drivers: Implementação concreta de tecnologias externas, como banco de dados, frameworks web, bibliotecas de envio de e-mail e etc...

## Configuração do Projeto :gear:

- Java 17 ou superior instalado.
- Maven para gerenciamento de dependências.
- MySQL ou outro banco de dados relacional compatível.

## Configuração do Banco de Dados :dolphin:

Certifique-se de ter um banco de dados MySQL configurado e rodando. As configurações do banco de dados estão no arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/sistema-reserva-avaliacao-de-restaurantes
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
