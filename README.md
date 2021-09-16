# Projeto de estudos Spring Data JPA 
projeto pessoal para estudo de Spring Data JPA, utilizando o conhecimento adquirido no curso de Spring Data JPA da Alura

## Tecnologias 

Tecnologias utilizadas nesse projeto:
* [Java 11+](https://www.oracle.com/br/java/technologies/javase-downloads.html)
* [Maven 3.8.1](https://maven.apache.org/download.cgi)
* [PostgreSQL](https://www.postgresql.org/download/)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

## Instalação 
Clone o repositorio do projeto 
```bash 
  git clone https://github.com/leo-jansen/teste-hibernate.git
  cd teste-spring-data
```
Alterar as variaveis do banco de dados no arquivo ``application.properties``, no diretório `src/main/resources/`, 
depois instale as dependencias do projeto
```bash 
  mvn clean install
```
Crie uma database `alura` no seu banco de dados. Execute o programa com o comando  
```bash 
  mvn exec:java -Dexec.mainClass="br.com.alura.springadata.SpringDataApplication" 
```
ou importe para o sua IDE e execute o arquivo `SpringDataApplication.java`
