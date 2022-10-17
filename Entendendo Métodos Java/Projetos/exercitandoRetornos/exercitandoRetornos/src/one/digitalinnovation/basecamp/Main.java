package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 9, 9);
        System.out.println("Área do Trapézio: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("Área do Losango: " + areaLosango);
    }
}