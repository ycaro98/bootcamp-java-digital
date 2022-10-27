import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
-Crie um dicionário e relacione os estados e suas populações;
-Substitua a população do estado do RN por 3.534.165;
-Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
-Exiba a população PE;
-Exiba todos os estados e suas populações na ordem que foi
informado;
-Exiba os estados e suas populações em ordem alfabética;
-Exiba o estado com o menor população e sua quantidade;
-Exiba o estado com a maior população e sua quantidade;
-Exiba a soma da população desses estados;
-Exiba a média da população deste dicionário de estados;
-Remova os estados com a população menor que 4.000.000;
-Apague o dicionário de estados;

Confira se o dicionário está vazio.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> estadosNordeste = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        System.out.println(estadosNordeste.toString());

        System.out.println("Substitua a população do estado do RN por 3.534.165: ");
        estadosNordeste.put("RN",3534165);
        System.out.println(estadosNordeste);

        System.out.println("Confira se o estado PB está no dicionário: " + estadosNordeste.containsKey("PB")
                + " caso não adicione: PB - 4.039.277");
        estadosNordeste.put("PB",  4039277);
        System.out.println(estadosNordeste);

        System.out.println("Exiba a população PE: " + estadosNordeste.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado:");
        Map<String, Integer> estadosNordeste2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosNordeste2.toString());

        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> estadosNordeste3 = new TreeMap<>(estadosNordeste2);
        System.out.println(estadosNordeste3.toString());

        System.out.println("Exiba o estado com o menor população e sua quantidade: ");
        Integer menorPopulacao = Collections.min(estadosNordeste.values());
        String estadoMenorPopulacao = "";
        for(Map.Entry<String, Integer> entry : estadosNordeste.entrySet()) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entry.getKey();
                System.out.println("A menor população é do estado de: " + estadoMenorPopulacao +
                        " com o número de " + menorPopulacao);
            }
        }
        System.out.println("Exiba o estado com a maior população e sua quantidade: ");
        Integer maiorPopulacao = Collections.max(estadosNordeste.values());
        String estadoMaiorPopulacao = "";
        for(Map.Entry<String, Integer> entry : estadosNordeste.entrySet()) {
            if (entry.getValue().equals(maiorPopulacao)) {
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("A maior população é do estado de: " + estadoMaiorPopulacao +
                        " com o número de " + maiorPopulacao);
            }
        }

        System.out.println("Exiba a soma da população desses estados: ");
        Iterator<Integer> iterator = estadosNordeste.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma das populações: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma/estadosNordeste.size()));

        System.out.println("Remova os estados com a população menor que 4.000.000:" );
        Iterator<Integer> iterator2 = estadosNordeste.values().iterator();
        while(iterator2.hasNext()) {
            if (iterator2.next() <= 4000000) iterator2.remove();
        }
        System.out.println(estadosNordeste);

        System.out.println("Apague o dicionário de estados: ");
        estadosNordeste.clear();
        System.out.println(estadosNordeste);

    }
}