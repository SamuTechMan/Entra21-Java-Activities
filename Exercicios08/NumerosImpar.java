import java.util.Scanner;
public class NumerosImpar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num, contagemImpar = 0;

        System.out.print("Digite um número: ");
        num = in.nextInt();

        if(num > 0){

            for(int i = 1; i <= num; i++){
                if(i %2 == 0){
                }else{
                    contagemImpar++;
                }
            }
        } else {
            for(int i = 1; i > num; i--){
                if(i %2 == 0){
                }else{
                    contagemImpar++;
                }
            }
            /*int i = 1;
            while(i > num){
            if(i %2 == 0){
            }else{
            contagemImpar++;
            }
            i--;
            }*/
        }
        System.out.println("Quantidade de números Ímpar: "+contagemImpar);

    }
}
