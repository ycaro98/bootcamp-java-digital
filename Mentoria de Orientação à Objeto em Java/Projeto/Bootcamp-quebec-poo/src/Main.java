public class Main {
    public static void main(String[] args) {
    Vendedor joaoVendedor =
            new Vendedor("João vendedor", "123456",10.0,5);
    double salarioJoao = joaoVendedor.calcularSalario();
    System.out.println("O Salário de João é: " + salarioJoao);

    Consultor mariaConsultor =
            new Consultor("Maria Consultor", "032164", 100.0, 10L);
    System.out.println("O Salário de Maria é: " + mariaConsultor.calcularSalario());
    }

}W