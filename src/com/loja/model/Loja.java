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
}
