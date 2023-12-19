import java.util.Scanner;

public class Baskara
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double a, b, c;
        double resultado, resultado2;

        System.out.print("Digite o valor a: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor b: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor c: ");
        c = sc.nextDouble();
        
        double delta = Math.pow(b, 2) - 4*a*c;

        if (delta < 0) {
            System.out.println("sem resultados possiveis");
        } else if (delta == 0 ) {
            resultado = ( -b )/( 2 * a );
            System.out.println("X: " + resultado);
        } else {
            resultado = ( -b + Math.sqrt(delta))/( 2 * a );
            resultado2 = ( -b - Math.sqrt(delta))/( 2 * a );
            
            System.out.println("X 1: " + resultado);
            System.out.println("X 2: " + resultado2);
        }

    }
}