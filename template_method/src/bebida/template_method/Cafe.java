package bebida.template_method;


public class Cafe extends BebidaCafeinada{    

    @Override
    protected void misturarNaAgua() {        
        System.out.println("Misturando café na agua fervendo");
    }
    
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite");        
    }

}
