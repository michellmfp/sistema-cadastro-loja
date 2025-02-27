# 🚀 Sistema de Loja - Java

Este projeto simula um **sistema de loja** em **Java**, onde é possível cadastrar produtos, clientes e pedidos. O sistema permite adicionar produtos a uma loja e criar pedidos feitos por clientes.

## Funcionalidades

- **Cadastrar produtos**: É possível adicionar produtos com nome e preço à loja. 🏷️
- **Cadastrar clientes**: Cada cliente é identificado por um ID, nome e email. 👤
- **Criar pedidos**: Os clientes podem fazer pedidos, incluindo os produtos desejados. 🛒
- **Exibir informações da loja**: A loja exibe seus produtos e pedidos registrados. 📜

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento do sistema. ☕️

## Como Rodar o Projeto

1. Clone o repositório para a sua máquina:
    ```bash
    git clone https://github.com/michellmfp/sistema-de-loja-java.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd sistema-de-loja-java
    ```
3. Compile e execute o código:
    - Se você estiver usando **IDE como IntelliJ ou VS Code**, basta abrir o projeto e executar.
    - Se estiver utilizando o terminal, compile o código com:
    ```bash
    javac com/loja/Main/Main.java
    ```
    E então, execute o programa com:
    ```bash
    java com.loja.Main.Main
    ```

## Como Funciona

- O sistema cria uma loja com produtos.
- Clientes podem ser cadastrados e fazer pedidos com os produtos da loja.
- Os pedidos ficam registrados na loja e podem ser visualizados.

## Estrutura do Projeto

- `com.loja.model`:
    - **Produto**: Classe que representa um produto com nome e preço.
    - **Cliente**: Classe que representa um cliente com ID, nome e email.
    - **Pedido**: Classe que representa um pedido feito por um cliente, incluindo os produtos adquiridos.
    - **Loja**: Classe que representa a loja, com a funcionalidade de adicionar produtos e pedidos.

- `com.loja.Main.Main`: Classe principal para rodar o sistema e exibir as informações.

## Contribuições

Sinta-se à vontade para contribuir com melhorias, correções ou novas funcionalidades. Para isso, siga o fluxo de **Pull Request**:

1. Faça um fork do repositório. 🍴
2. Crie uma branch para sua modificação. 🌱
3. Faça o commit com uma mensagem clara sobre o que foi alterado. 📝
4. Abra um pull request. 🔁
