package com.sgp.modelos;  // Declaração do pacote

public class Produto {
    
    private String nome;  // Atributo privado, acessível somente dentro da classe Produto
    private int quantidade;  // Atributo privado, acessível somente dentro da classe Produto
    private double preco; // Preço do produto

    // Construtor que recebe nome e quantidade como parâmetros
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = 0.0;
    }

    // Construtor sobrecarregado que recebe apenas o nome
    // Inicializa com valores padrão
    public Produto() {
        this.nome = "Produto Padrão";
        this.quantidade = 0;
        this.preco = 10.0;
    }

    // Construtor que inclui preço
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Método que exibe informações do produto
    public void exibirInfo() {
        System.out.println("Produto: " + nome + " Quantidade: " + quantidade);
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    
    // Retorna o nome do produto
    public String getNome() {
        return nome;
    }

    // Retorna a quantidade do produto
    public int getQuantidade() {
        return quantidade;
    }

    // Retorna o preço do produto
    public double getPreco() {
        return preco;
    }

    // Define um novo nome para o produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define uma nova quantidade para o produto
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Define um novo preço para o produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
}