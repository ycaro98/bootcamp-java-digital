import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         List<Double> temperatura = new ArrayList<>();

         //Adicionando as temperaturas da lista
         int count = 0;
         while (true) {
             if (count == 6) break;

             System.out.println("Digite a temperatura: ");
             double temp = scanner.nextDouble();
             temperatura.add(temp);
             count++;
         }
        System.out.println("--------------");

         //exibindo todas as temperaturas
        double media = temperatura.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        //exibindo as temperaturas acima da média
        System.out.println("Temperaturas acima da média: ");
        temperatura.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));

        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperatura.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if(temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n");
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n");
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n");
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }



    }
}