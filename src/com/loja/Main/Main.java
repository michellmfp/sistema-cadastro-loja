package com.loja.main;

import com.loja.model.Cliente;
import com.loja.model.Pedido;
import com.loja.model.Produto;
import com.loja.model.Loja;

public class Main {
    public static void main(String[] args) {
        // Criação da loja
        Loja loja = new Loja("Minha Loja");

        // Criando Produtos
        Produto p1 = new Produto("Camiseta", 39.90);
        Produto p2 = new Produto("Calça Jeans", 89.90);

        // Adicionando produtos à loja
        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);

        // Criando um Cliente
        Cliente cliente = new Cliente(1, "Richard", "richard@gmail.com");

        // Criando um pedido para o cliente
        Pedido pedido = new Pedido(1, cliente);

        // Adicionando produtos ao pedido
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        // Adicionando o pedido à loja
        loja.adicionarPedido(pedido);

        // Exibindo informações sobre a loja, produtos e pedidos
        System.out.println(loja);
    }
}
