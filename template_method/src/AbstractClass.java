public abstract class AbstractClass {

    public void templateMethod(){
        metodo1();
        hook();
        metodo2();
    }

    public abstract void metodo1();

    public abstract void metodo2();

    void hook(){
        
    }
}
