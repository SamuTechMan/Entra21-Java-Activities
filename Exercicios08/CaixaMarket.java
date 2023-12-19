import java.util.Scanner;
public class CaixaMarket{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int qtdProduto;
        double precoProduto, precoTotal = 0;

        System.out.print("Informe quantos produto o cliente comprou: ");
        qtdProduto = in.nextInt();

        for(int i = 1; i <= qtdProduto; i++){
            System.out.print("Informe o preço do "+i+"° produto: R$");
            precoProduto = in.nextDouble();
            precoTotal += precoProduto;
        }
        System.out.println("O cliente deve pagar um total de: R$"+precoTotal);
    }
}