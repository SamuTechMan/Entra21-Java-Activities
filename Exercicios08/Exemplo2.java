import java.util.Scanner;

public class Exemplo2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int idade;
        String nome;
 
        System.out.printf("Informe a sua idade:\n");
        idade = in.nextInt();
        
        in.nextLine();
        System.out.printf("\n");
        System.out.printf("Informe o seu nome:\n");
        nome =   in.nextLine();
        
        System.out.printf("\nResultado\n");
        System.out.printf("%s tem %d anos.\n", nome, idade);
    }
}