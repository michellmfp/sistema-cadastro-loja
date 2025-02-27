package com.loja.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private List<Produto> produtos;
    private List<Pedido> pedidos;

    public Loja(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Loja: " + nome + "\nProdutos: " + produtos + "\nPedidos: " + pedidos;
    }
}
