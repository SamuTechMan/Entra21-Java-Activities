import java.util.Scanner;

public class Questao31{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int i = 1,numero, soma = 0;
    double media;
    
   for(i=1; i<=5; i++){
        System.out.print("Digite o "+i+"° numero : ");
        numero = in.nextInt();
        soma += numero;
    }
    media = soma/5;
        System.out.println("\nA soma dos números digitados é: "+soma);
        System.out.println("A média dos números digitados é: "+media+"\n");
    
    
  /*  do{
        System.out.print("Digite o "+i+"° numero : ");
        numero = in.nextInt();
        soma += numero;
        i++;
        
    } while(i<=15);
    System.out.println("A soma dos números digitados é: "+soma);*/
    }
}
  