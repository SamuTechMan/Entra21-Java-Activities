package aula191223.Comida;

public class Forno {
    public void fabricar(PizzaCalabresa calabresa, PizzaAbacaxi abacaxi, Preco preco) {
        System.out.println("\nPizza de calabresa");
        calabresa.preparar();
        calabresa.assar();
        calabresa.cobrar();
        System.out.println("\nPizza de abacaxi");
        abacaxi.preparar();
        abacaxi.assar();
        abacaxi.cobrar();
        System.out.println("");
        preco.valorTotal();
    }
}
