package aula191223.Comida;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();
        PizzaCalabresa pizzaCalabresa = new PizzaCalabresa();
        PizzaAbacaxi pizzaAbacaxi = new PizzaAbacaxi();
        Preco preco = new Preco();
        forno.fabricar(pizzaCalabresa, pizzaAbacaxi, preco);
        System.exit(0);
    }
}