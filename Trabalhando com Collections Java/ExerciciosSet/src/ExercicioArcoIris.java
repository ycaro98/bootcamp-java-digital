import java.util.*;

/*
Crie um conjunto contendo as cores do arco-íris e: vermelha, laranja, amarela, verde, azul, azul-escuro e violeta
Exiba todas as cores uma abaixo da outra
A quantidade de cores que o arco-íris tem
Exiba as cores em ordem alfabética
Exiba as cores na ordem inversa da que foi informada
Exiba todas as cores que começam com a letra ”v”
Remova todas as cores que não começam com a letra “v”
Limpe o conjunto

Confira se o conjunto está vazio
 */
public class ExercicioArcoIris {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo todas as cores do arco-íris: ");
        Set<String> cores = new HashSet<>();
        cores.add("vermelha");
        cores.add("laranja");
        cores.add("amarela");
        cores.add("verde");
        cores.add("azul");
        cores.add("azul-escuro");
        cores.add("violeta");
        System.out.println(cores);

        System.out.println("Imprima as cores uma abaixo da outra: ");
        for(String ignored : cores){
            System.out.println(ignored);
        }

        System.out.println("Quantas cores existem em um arco-íris: " + cores.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("Exiba as cores na ordem inversa do que foi informada");
        Set<String> cores3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(cores3);
        List<String> coresList = new ArrayList<>(cores3);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println("Mostre as cores iniciadas com v: ");
        for (String cor: cores) {
            if(cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("Remova as cores iniciadas em v: ");
        Iterator<String> iterator1 = cores.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().startsWith("v")) iterator1.remove();
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto");
        cores.clear();

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
    }
}