import java.io.IOException;
import java.util.Scanner;

public class Trocar2{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char ch;
        System.out.print("Digite uma Vogal ou Consoante: ");
        ch = (char)System.in.read();
        System.out.print(ch);
        switch(ch){
            case 'a':
            case 'A':{
                    System.out.println("Vogal");
                    break;
                }
            case 'e':
            case 'E':{
                    System.out.println("Vogal");
                    break;
                }
            case 'i':
            case 'I':{
                    System.out.println("Vogal");
                    break;
                }
            case 'o':
            case 'O':{
                    System.out.println("Vogal");
                    break;
                }
            case 'u':
            case 'U':{
                    System.out.println("Vogal");
                    break;
                }
                case '1':
                    System.out.println("É um número");
                    break;
            default:
                System.out.println("Consoante");
        }
    }
}