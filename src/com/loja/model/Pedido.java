package com.loja.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private List<Produto> produtos;

    public Pedido(int numero) {
        this.numero = numero;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public int getNumero() {
        return numero;
    }
}
