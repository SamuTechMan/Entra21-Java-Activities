import java.io.IOException;
import java.util.Scanner;

public class Exemplo3{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        String nome;
        char sexo;
        
        System.out.printf("Informe um nome:\n");
        nome = in.nextLine();
        
        System.out.printf("Informe o sexo(M/F): ");
            sexo = (char)System.in.read();
            
            System.out.printf("\nResultado\n");
            if ((sexo == 'M') || (sexo == 'm')){
            System.out.printf("Seja bem vindo Sr. \"%s\".\n", nome);
        } else {
            System.out.printf("Seja bem vinda Sra. \"%s\".\n", nome);
            }
        }        
    }