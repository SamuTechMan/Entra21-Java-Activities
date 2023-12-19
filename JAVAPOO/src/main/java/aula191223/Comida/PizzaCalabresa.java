package aula191223.Comida;

public class PizzaCalabresa extends PizzaAbacaxi {

    public void preparar() {
        System.out.println("Ingredientes: " + ingredientes[0] + ", " + ingredientes[2] + ", " + ingredientes[4]
                + ", " + ingredientes[6] + ", " + ingredientes[7]);
    }

    public void assar() {
        System.out.println("Tempo de preparo: 15 minutos");
    }

    public void cobrar() {
        valor = 12.00;
        System.out.println("Valor à pagar: R$"+valor);
    }
}
