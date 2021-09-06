package bebida.template_method;

public abstract class BebidaCafeinada {
    public final void prepararBebida(){
        ferverAgua();
        misturarNaAgua();
        colocarNaXicara();
        adicionarCondimentos();
    }

    protected abstract void misturarNaAgua();
    protected abstract void adicionarCondimentos();

    private void ferverAgua(){
        System.out.println("Fervendo um pouco de agua ");
    }

    private void colocarNaXicara(){
        System.out.println("Colocando bebida na xícara");
    }
    
}
