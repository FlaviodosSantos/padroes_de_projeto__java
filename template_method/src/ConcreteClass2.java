public class ConcreteClass2 extends AbstractClass{

    @Override
    public void metodo1() {
        System.out.println("CC2 executou metodo 1");
        
    }

    @Override
    public void metodo2() {
        System.out.println("CC2 executou metodo 2");
        
    }

    @Override
    void hook(){
        System.out.println("CC2 executou metodo gancho");
    }
    
}
