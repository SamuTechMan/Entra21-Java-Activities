package aula191223.Carro;

public class Rua {
    public void andarNaRua(Carro carro) {
        carro.Acelerar();
    }

    public static void main(String[] args) {
        Rua car = new Rua();
        System.out.print("O Uno ");
        car.andarNaRua(new Uno());
        System.out.print("O Fusca ");
        car.andarNaRua(new Fusca());
    }
}
