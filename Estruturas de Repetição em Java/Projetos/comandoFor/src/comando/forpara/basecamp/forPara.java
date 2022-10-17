package comando.forpara.basecamp;

/**
 *Vamos imagina que Joãozinho precisa contar até 20 carneirinhos para pegar no sono:
 */
public class forPara {
    public static void main(String[] args) {
        for ( int carneirinhos = 0; carneirinhos <= 20; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }

        System.out.println("Joãozinho dormiu");
    }
}