package comando.forpara.basecamp;

import java.util.Arrays;

/**
 *Vamos imagina que Joãozinho precisa contar até 20 carneirinhos para pegar no sono:
 */
public class forPara {
    public static void main(String[] args) {
        for ( int carneirinhos = 0; carneirinhos <= 20; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }

        int[] i  = {2, 3, 5, 7, 11, 13, 18, 34};
        System.out.println("O número do array é: " + i[0]);


        System.out.println("Joãozinho dormiu");
    }
}