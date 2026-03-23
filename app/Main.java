package com.sgp.testes; // Declaração do pacote

import com.sgp.modelos.Produto;

public class Teste { // Definição da classe Teste

    public static void main(String[] args) {
        // Testando o método com um produto não inicializado
        Produto produtoNulo = null;
        imprimirProduto(produtoNulo);

        // Testando o método com um produto inicializado
        Produto produto = new Produto("Caderno", 10);
        produto.setPreco(15.5);
        imprimirProduto(produto);

        // Testando o construtor com valores padrão
        Produto produtoPadrao = new Produto();
        System.out.println("\nTestando construtor com valores padrão:");
        imprimirProduto(produtoPadrao);

        // Testando construtor com preço
        Produto produtoComPreco = new Produto("Caneta", 20, 2.5);
        System.out.println("\nTestando construtor com preço:");
        imprimirProduto(produtoComPreco);

        // Acesso ao método público
        produto.exibirInfo();

        // Acessando o atributo através do getter público
        System.out.println("Nome (público): " + produto.getNome());

        // Modificando o atributo privado através do setter
        produto.setNome("Lápis");
        System.out.println("Nome modificado (setter): " + produto.getNome());

        // Modificando a quantidade através do setter
        produto.setQuantidade(50);
        System.out.println("Produto após modificações: " + produto.toString());
    }

    // Método estático para imprimir informações de um produto
    public static void imprimirProduto(Produto produto) {
        if (produto == null) {
            System.out.println("Produto não inicializado!");
            return;
        }
        System.out.println(produto);
        produto.exibirInfo();
    }
}