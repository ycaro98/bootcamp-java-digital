package br.java.dio.heranca.exerc1;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        /*
        downcast(não é recomendado trabalhar dentro da programação orientada a objetos)
         Vendedor vendedor_ = (Vendedor) new Funcionario();*/
    }
}
