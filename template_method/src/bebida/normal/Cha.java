package bebida.normal;

public class Cha {
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
        System.out.println("Colocando saquinho de chá na água");
    }

    public void colocarNaXicara() {
        System.out.println("Colocando chá na xícara");
    }

    public void adicionarCondimentos() {
        System.out.println("Adicionando limão");
    }
}
