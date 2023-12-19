import java.util.Scanner;
public class Exemplo7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long i, n, f;

        System.out.println("Informe o número para o fatorial: ");
        n = in.nextLong();
        System.out.println();
        System.out.println("Resultado: ");
        System.out.print(n + "! = ");

        f = 1;      
        for (i=n; i>=1; i--){
            if (i != 1){
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");   
            }
            f = f * i;
        }
        System.out.println(f);
    }
}