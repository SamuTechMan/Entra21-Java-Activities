import java.util.Scanner;

public class Par_Impar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num, contagemPar = 0, contagemImpar = 0;

        System.out.print("Digite um número: ");
        num = in.nextInt();

        System.out.println("");
        if(num == 0){
            System.out.println("Neutro");
        }else if(num > 0){

            for(int i = 1; i <= num; i++){
                if(i %2 == 0){
                    contagemPar++;
                    System.out.println(i+" - Par");
                }else{
                    contagemImpar++;
                    System.out.println(i+" - Impar");
                }
            }
        } else{
            for(int i = 1; i > num; i--){
                if(i %2 == 0){
                    contagemPar++;
                    System.out.println(i+" - Par");
                }else{
                    contagemImpar++;
                    System.out.println(i+" - Ímpar");
                }
            }
        } 
        System.out.println("");
        System.out.println("Quantidade de números Par: "+contagemPar+"\nQuantidade de números Ímpar: "+contagemImpar);
    }
}