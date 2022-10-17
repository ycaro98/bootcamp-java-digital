package switi.kase.basecamp;

public class switchCase {
    public static void main(String[] args) {
      String plano = "M"; //M or T

        switch (plano) {
            case "T": {
                System.out.println("5Gb de Youtube");
                break;
            }
            case "M": {
                System.out.println("Whats e Instagram Grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
        }
    }

}




         /**
         * Uso no caso de if Plano de celular
         */
        /* if (plano == "B"){
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb Youtube");
        }*/

        /**
        * Modelos string e if de MEDIO, PEQUENO E GRANDE
        */
        /* String sigla = "M";

        switch ( sigla ){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
                }*/

        /*if (sigla == "P")
            System.out.println("PEQUENO");
        else if (sigla == "M")
            System.out.println("MEDIO");
        else if (sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("Indefinido");*/

