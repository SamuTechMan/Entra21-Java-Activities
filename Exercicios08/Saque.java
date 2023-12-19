import java.util.Scanner;

public class Saque{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double saldo = 2000;

        int decisao;

        System.out.println("******** Banco Excel ********");

        do {
            System.out.printf("\nSaldo da conta bancaria: R$%.2f \n", saldo);
            System.out.println("O que deseja fazer? (sacar - 1, depositar - 2, sair - 3)\n");
            decisao = sc.nextInt();

            if (decisao == 1) {
                double saque;
                do {
                    System.out.print("\nQuando deseja sacar? ");
                    saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("\nSaque invalido");
                    }
                } while (saque > saldo);
                saldo = saldo - saque;
            } else if (decisao == 2) {
                System.out.print("\nQuando deseja depositar? ");
                double deposito = sc.nextDouble();
                saldo = saldo + deposito;
            } else if (decisao != 3) {
                System.out.println("Opçao invalido");
            }

        } while (decisao != 3);

        System.out.println("\n*****************************\n");
        System.out.printf("\nSaldo da conta bancaria: R$%.2f \n", saldo);

    }
}