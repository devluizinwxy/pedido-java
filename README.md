# Projeto Pedido Java

## Descrição

Este projeto é uma aplicação Java que permite ler os dados de um pedido com **N itens** (quantidade informada pelo usuário) e gerar um **sumário do pedido** com informações do cliente, produtos, quantidade, preços e total.  

O objetivo é praticar conceitos de **Programação Orientada a Objetos**, incluindo **composição de classes**, **enumerações** e **uso de `BigDecimal` e datas**.

---

## Estrutura do Projeto

### Classes

- **Main**  
  Responsável pela execução do programa, leitura de dados do usuário e exibição do resumo do pedido.

- **Client**  
  Representa o cliente, contendo:
  - Nome
  - Email
  - Data de nascimento

- **Product**  
  Representa um produto, contendo:
  - Nome do produto
  - Preço (`BigDecimal`)

- **OrderItem**  
  Representa um item do pedido, contendo:
  - Quantidade
  - Preço do item
  - Produto associado
  - Método `subTotal()` para calcular o subtotal do item

- **Order**  
  Representa o pedido, contendo:
  - Data e hora do pedido (`LocalDateTime`)
  - Status do pedido (`OrderStatus`)
  - Cliente associado
  - Lista de itens (`OrderItem`)
  - Métodos para adicionar/remover itens e calcular o total do pedido
  - Método `toString()` para exibir o sumário do pedido

- **OrderStatus**  
  Enum que define os possíveis status do pedido:
  - `PENDING_PAYMENT` (Aguardando pagamento)
  - `PROCESSING` (Processando)
  - `SHIPPED` (Enviado)
  - `DELIVERED` (Entregue)

---

## Funcionalidades

1. Ler dados do cliente:
   - Nome
   - Email
   - Data de nascimento

2. Ler dados do pedido:
   - Status do pedido
   - Quantidade de itens

3. Para cada item:
   - Nome do produto
   - Preço do produto
   - Quantidade do produto

4. Exibir sumário completo do pedido:
   - Data/hora do pedido
   - Status do pedido
   - Dados do cliente
   - Lista de itens (nome, preço, quantidade, subtotal)
   - Total do pedido

---

## Tecnologias e Conceitos Usados

- Java 17+
- `BigDecimal` para valores monetários
- `LocalDate` e `LocalDateTime` para datas
- Enumerações (`OrderStatus`)
- Composição de classes (Client → Order → OrderItem → Product)
- Streams para cálculo do total do pedido

---

## Exemplo de Uso

