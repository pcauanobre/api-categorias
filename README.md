# API de Categorias - README

## Descrição

Este repositório contém uma aplicação **Spring Boot** criada como parte de um trabalho acadêmico. O objetivo principal é fornecer uma API para gerenciamento de categorias, incluindo as operações básicas de cadastro, listagem, atualização e exclusão.

---

## Estrutura do Repositório

- **src**  
  Contém o código-fonte do projeto (controladores, serviços, repositórios e entidades).

- **target**  
  Diretório gerado após a compilação, onde ficam os artefatos construídos (arquivo `.jar` ou `.war`, por exemplo).

- **pom.xml**  
  Arquivo de configuração do Maven, responsável pelas dependências e plugins do projeto.

- **mvnw** e **mvnw.cmd**  
  Scripts que permitem executar o Maven mesmo sem instalá-lo localmente.

- **HELP.md**  
  Arquivo que pode conter instruções adicionais ou anotações sobre o projeto.

---

## Funcionalidades

- **Criar novas categorias**
- **Listar todas as categorias**
- **Buscar categorias por ID**
- **Atualizar informações de uma categoria**
- **Excluir categorias do sistema**

---

## Como Executar

1. **Clonar o repositório** para a sua máquina local.
2. **Abrir o projeto** em uma IDE compatível com projetos Maven ou via linha de comando.
3. **Executar a aplicação** utilizando o comando do Maven (ou por meio da sua IDE de preferência).

Por padrão, a aplicação estará disponível na porta `8080`. Para verificar o funcionamento, basta acessar os endpoints configurados, por exemplo:  
http://localhost:8080/api/categorias

---

## Observações

- Este projeto utiliza o **Spring Boot**, facilitando a inicialização e configuração da aplicação.
- O uso de um banco de dados (por exemplo, **H2** ou outro de sua preferência) pode ser configurado no arquivo de propriedades da aplicação.
- O repositório está estruturado de forma a demonstrar os princípios básicos de organização de um projeto Spring Boot com camadas de **Controller**, **Service** e **Repository**.
