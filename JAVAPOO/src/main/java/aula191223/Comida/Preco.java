package aula191223.Comida;

public class Preco {
    PizzaAbacaxi abacaxi = new PizzaAbacaxi();
    PizzaCalabresa calabresa = new PizzaCalabresa();

    public void valorTotal(){
        double valorTotal = abacaxi.valor+ calabresa.valor;
        System.out.println("Valor total à pagar das 2 pizzas: R$"+valorTotal);
    }
}
