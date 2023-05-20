package br.com.SistemaLoja.model.Produto;

import br.com.SistemaLoja.model.e.EProdutos;

public class Produto{
    private String nome;
    private double preco;
    private int quantidade;

    private EProdutos eProdutos;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e setters


    public EProdutos geteProdutos() {
        return eProdutos;
    }

    public void seteProdutos(String produto) {
        if (produto.equalsIgnoreCase("Camisa")) {
            this.eProdutos = EProdutos.Camisa;
        } else if (produto.equalsIgnoreCase("Bone")) {
            this.eProdutos = EProdutos.Bone;
        } else if (produto.equalsIgnoreCase("Moletom")) {
            this.eProdutos = EProdutos.Moletom;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
