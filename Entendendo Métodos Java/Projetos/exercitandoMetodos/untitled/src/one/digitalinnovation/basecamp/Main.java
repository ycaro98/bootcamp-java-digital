package one.digitalinnovation.basecamp;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */
public class Main {
    public static void main(String[] args) {


        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagens(9);
        Mensagem.obterMensagens(14);
        Mensagem.obterMensagens(22);

        // Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 3);
    }
}