package aula191223.Matematica;

public class Contas {
    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        System.out.println("O resultado é: " + operacao.calcular(x, y));
    }

    public static void main(String[] args) {
        Contas.mostrarCalculo(new Adicao(), 5, 5);
        Contas.mostrarCalculo(new Subtracao(), 5, 5);
        Contas.mostrarCalculo(new Multiplicacao(), 7, 4);
    }
}
