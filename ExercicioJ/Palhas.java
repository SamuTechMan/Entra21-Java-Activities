import java.util.Scanner;

public class Palhas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String nomeProduto;
        double precoProduto;
        double descontoProduto;
        double valorParcela;

        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.next();

        System.out.print("Digite o preço do produto: ");
        precoProduto = sc.nextDouble();

        descontoProduto = precoProduto * 0.10;
        valorParcela = (precoProduto - descontoProduto) / 5;

        System.out.println("");
        System.out.println("******* Produto ********");
        System.out.println("");
        System.out.println("Nome: "+ nomeProduto);
        System.out.println("Preço: "+ precoProduto);
        System.out.println("");
        System.out.println("Valor da parcela: R$" + valorParcela);
        System.out.println("");
        System.out.println("Valor do desconto: " + descontoProduto);
        System.out.println("");
    }
}
