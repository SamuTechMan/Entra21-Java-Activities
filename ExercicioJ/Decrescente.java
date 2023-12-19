import java.util.Scanner;

public class Decrescente
{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        double n1, n2, n3;

        System.out.print("Digite o 1º numero: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o 2º numero: ");
        n2 = sc.nextDouble();

        System.out.print("Digite o 3º numero: ");
        n3 = sc.nextDouble();

        if (n1 >= n2 && n1 >= 3) {
            if (n2 >= n3) {
                System.out.println(n1+", "+n2+", "+n3);
            } else System.out.println(n1+", "+n3+", "+n2);
        } else if (n2 >= n1 && n2 >= n3) {
            if (n1 >= n3) {
                System.out.println(n2+", "+n1+", "+n3);
            } else System.out.println(n2+", "+n3+", "+n1);
        } else if (n3 >= n1 && n3 >= n2) {
            if (n1 >= n3) {
                System.out.println(n3+", "+n1+", "+n2);
            } else System.out.println(n3+", "+n2+", "+n1);
        }
    }
}
