package bebida.template_method;

public class Cha extends BebidaCafeinada {

    @Override
    protected void misturarNaAgua() {
        System.out.println("Colocando saquinho de chá na agua fervendo");        
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limão");        
    }
    
}
