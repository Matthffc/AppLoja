package br.com.SistemaLoja.model.Loja;

import br.com.SistemaLoja.model.Produto.Produto;

import java.util.ArrayList;

public class Loja{
    private ArrayList<Produto> estoque;

    public Loja() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public String realizarVenda(String nomeProduto, int quantidade) {
        for (Produto produto : estoque) {
            if (produto.getNome().equals(nomeProduto)) {
                if (produto.getQuantidade() >= quantidade) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    double valorTotal = produto.getPreco() * quantidade;
                    return "Venda realizada - Produto: " + produto.getNome() +
                            " | Quantidade: " + quantidade +
                            " | Valor Total: " + valorTotal;
                } else {
                    return "Quantidade insuficiente em estoque para o produto: " + produto.getNome();
                }
            }
        }
        return "Produto não encontrado no estoque: " + nomeProduto;
    }

    public String exibirEstoque() {
        StringBuilder estoqueString = new StringBuilder();
        estoqueString.append("Estoque da Loja:\n");
        for (Produto produto : estoque) {
            estoqueString.append("Nome: ").append(produto.getNome())
                    .append(" | Preço: ").append(produto.getPreco())
                    .append(" | Quantidade: ").append(produto.getQuantidade())
                    .append("\n");
        }
        return estoqueString.toString();
    }
}

