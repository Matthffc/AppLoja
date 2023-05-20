package br.com.SistemaLoja;


import br.com.SistemaLoja.model.Loja.Loja;
import br.com.SistemaLoja.model.Produto.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camisa Nike1", 10.00, 10);
        Produto p2 = new Produto("Camisa Nike2", 10.00, 10);
        Produto p3 = new Produto("Camisa Nike3", 10.00, 10);
        Produto p4 = new Produto("Camisa Nike4", 10.00, 10);
        Produto p5 = new Produto("Camisa Nike5", 10.00, 10);
        Loja l = new Loja();
        l.adicionarProduto(p1);
        l.adicionarProduto(p2);
        l.adicionarProduto(p3);
        l.adicionarProduto(p4);
        l.adicionarProduto(p5);

        System.out.println(l.exibirEstoque());
        }

}
