import java.io.IOException;
import java.util.Scanner;

public class Exemplo4{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char sexo;
        double h, pesoIdeal;
        
        System.out.printf("Informe o sexo (M/F).........: ");
        sexo = (char)System.in.read();
        
        System.out.printf("Informe a altura (em metros): ");
        h = in.nextDouble();
        
        if((sexo == 'M') || (sexo == 'm')){
            pesoIdeal = (72.7 * h) - 58;
        } else {
            pesoIdeal = (62.1 * h) - 44.7;
        }
        
        System.out.printf("\nPeso Ideal = %.2f kgs\n", pesoIdeal);
    }
}