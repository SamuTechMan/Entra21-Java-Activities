import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        Tabuada tabua = new Tabuada();
        System.out.print("Informe um número inteiro para ver a sua tabuada: ");
        tabua.setValor(in.nextInt());
        int mult = 0;
        
        do{
            System.out.println(tabua.gerarTabuada(mult));
            mult++;
        }
            while(mult <=10);
            
      /*  while(mult <= 10){
             System.out.println(tabua.gerarTabuada(mult));
            mult++;
        }*/
        
      /*  for(int multiplicador = 1; multiplicador <= 10; multiplicador++){
                System.out.println(tabua.gerarTabuada(multiplicador));
        }*/
    }
}