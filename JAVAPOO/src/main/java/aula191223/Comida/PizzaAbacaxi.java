package aula191223.Comida;

public class PizzaAbacaxi{
    double valor = 17.49;
    String[] ingredientes = {"Molho", "Molho doce", "Queijo", "Queijo com açucar", "Calabresa", "Abacaxi",
            "Cebola", "Tomate"};

    public void preparar() {
        System.out.println("Ingredientes: " + ingredientes[1] + ", " + ingredientes[3] + ", " + ingredientes[5]);
    }

    public void assar() {
        System.out.println("Tempo de preparo: 23 minutos");
    }

    public void cobrar() {
        System.out.println("Valor à pagar: R$"+valor);
    }
}
