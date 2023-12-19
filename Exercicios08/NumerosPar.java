import java.util.Scanner;
public class NumerosPar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0, i = 1, contagemPar = 0;

        do{
            System.out.print("Digite o "+i+"° número: ");
            num = in.nextInt();
            i++;
            if(num %2 == 0){
                contagemPar++;
            }
        }
        while(i <= 20);
        System.out.println("Quantidade de números Par: "+contagemPar);
    }

}