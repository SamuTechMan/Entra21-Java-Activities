import java.util.Scanner;

public class Exemplo1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b;
        
        System.out.printf("Informe o primeiro valor: ");
        a = in.nextInt();
        System.out.printf("Informe o segundo valor: ");
        b = in.nextInt();
        
        
        System.out.printf("\nResultados:\n");
        System.out.printf("%d + %d = %3d\n", a, b, (a + b));
        System.out.printf("%d - %d = %3d\n", a, b, (a - b));
        System.out.printf("%d * %d = %3d\n", a, b, (a * b));
        System.out.printf("%d / %d = %3d (divisão inteira)\n", a, b, (a / b));
        System.out.printf("%d / %d = %6.2f (divisão exata)\n", a, b, ((double) a / b));
    }
}