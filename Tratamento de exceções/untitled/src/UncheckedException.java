import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            //throw new RuntimeException(e);
            JOptionPane.showMessageDialog(null,"Entrada inválida, informe um número inteiro!" + e.getMessage());
        } catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null,"impossível dividir número por 0");

        }
        finally{
            System.out.println("Chegou no finally!");
        }

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {return a / b;}
}