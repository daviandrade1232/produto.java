package util;

public class Validacoes {

    public static boolean quantidadeValida(int quantidade) {

        if (quantidade < 0) {
            return false;
        }

        return true;
    }

    public static String mensagemErroQuantidade(int quantidade) {

        if (quantidade < 0) {
            return "Erro: Quantidade não pode ser negativa";
        }

        return "";
    }

    public static boolean precoValido(double preco) {

        if (preco < 0) {
            return false;
        }

        return true;
    }

    public static String mensagemErroPreco(double preco) {

        if (preco < 0) {
            return "Erro: Preço não pode ser negativo";
        }

        return "";
    }

    // valida nome
    public static boolean nomeValido(String nome) {

        if (nome == null) {
            return false;
        }

        if (nome.trim().isEmpty()) {
            return false;
        }

        if (nome.matches(".*\\d+.*")) {
            return false;
        }

        return true;
    }

    public static String mensagemErroNome(String nome) {

        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: O nome não pode estar vazio";
        }

        if (nome.matches(".*\\d+.*")) {
            return "Erro: O nome não pode conter números";
        }

        return "";
    }
}