# Ecommerce System

Projeto em Java que simula um **sistema simples de e-commerce**, focado na modelagem de classes e regras básicas de negócio, utilizando conceitos fundamentais de **Programação Orientada a Objetos (OOP)**.

## Funcionalidades

### 👤 Customer
- Criação de clientes com **ID** e **nome**
- Associação de pedidos ao cliente
- Armazenamento do histórico de pedidos

### 📦 Product
- Cadastro de produtos com:
  - ID
  - Nome
  - Preço
  - Estoque
- Atualização de preço
- Controle de estoque (entrada e saída)
- Validação de valores inválidos

### 🧾 OrderItem
- Representa um item de compra
- Associa um **produto** a uma **quantidade**
- Cálculo de subtotal (preço × quantidade)

### 🛒 ShoppingCart
- Adicionar produtos ao carrinho
- Remover produtos do carrinho
- Visualizar itens do carrinho
- Calcular o valor total da compra
- Limpar o carrinho após finalização do pedido

### 📑 Order
- Criação de pedidos a partir do carrinho
- Cálculo do valor total do pedido
- Verificação de estoque antes da finalização
- Atualização do estoque dos produtos
- Associação do pedido ao cliente
- Controle de status do pedido (`PROCESSANDO` → `FINALIZADO`)

## Estrutura do Projeto

- **Customer**
  - Representa o cliente do sistema
  - Mantém uma lista de pedidos realizados

- **Product**
  - Representa um produto disponível para compra
  - Controla preço e estoque

- **OrderItem**
  - Representa um produto dentro do pedido
  - Armazena quantidade e subtotal

- **ShoppingCart**
  - Gerencia os itens adicionados pelo cliente
  - Responsável pelo cálculo do total antes do pedido

- **Order**
  - Representa o pedido final
  - Responsável por validar estoque, finalizar a compra e registrar o pedido

## Fluxo Básico do Sistema

1. Cliente adiciona produtos ao `ShoppingCart`
2. O carrinho calcula o total
3. Um `Order` é criado a partir do carrinho
4. O pedido verifica se há estoque suficiente
5. O estoque é atualizado
6. O pedido é associado ao cliente
7. O carrinho é limpo
8. O pedido é finalizado

## Conceitos de OOP Aplicados

- Encapsulamento
- Composição (`Order → OrderItem → Product`)
- Associação (`Customer → Order`)
- Validação de dados
- Uso de Collections (`ArrayList`)
- Separação de responsabilidades

## Tecnologias Utilizadas

- Java
- Java Collections Framework
- Programação Orientada a Objetos (OOP)

## Objetivo do Projeto

Projeto desenvolvido para **praticar a modelagem de um sistema de e-commerce em Java**, focando em lógica de negócio, organização de código e aplicação correta dos conceitos de OOP.

📌 Projeto sem interface gráfica, focado exclusivamente na lógica do sistema.
