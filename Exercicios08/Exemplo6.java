public class Exemplo6{
    public static void main(String[] args){
        String[] nomeMes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto"
                            , "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        System.out.println("================");
        System.out.println("Mês - Nome do Mês");
        System.out.println("================");
        for (int i = 11; i >= 0; i--) {
            System.out.printf(" %0,2d - %s\n", (i+1), nomeMes[i]);
        }
            System.out.println("================");        
    }
}