import java.util.Scanner;
public class Trocar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String letra;
        System.out.print("Digite uma letra entre a e d: ");
        letra = in.nextLine();

        switch(letra){
            case "a":
            case "A":{
                    System.out.println("Abacate");
                    break;
                }
            case "b":
                case "B":{
                System.out.println("Buriti");
                break;
            }
            case "c":
                System.out.println("Caju");
                break;
            case "d":
                System.out.println("Damasco");
                break;
            default:
                System.out.println("Letra inválido!");
                break;
        }
    }
}