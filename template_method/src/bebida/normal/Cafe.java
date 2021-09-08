package bebida.normal;

public class Cafe {
    public void prepararBebida(){
        ferverAgua();
        misturarNaAgua();
        colocarNaXicara();
        adicionarCondimentos();
    }

    public void ferverAgua() {
        System.out.println("Fervendo um pouco de água");
    }

    public void misturarNaAgua() {
        System.out.println("Colocando acfé no filtro");
    }

    public void colocarNaXicara() {
        System.out.println("Colocando café na xícara");
    }

    public void adicionarCondimentos() {
        System.out.println("Adicionando açucar e leite");
    }
}
