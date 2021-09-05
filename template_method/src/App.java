public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!\n\n");

        AbstractClass ac = new ConcreteClass1();
        ac.templateMethod();
        
        ac = new ConcreteClass2();
        ac.templateMethod();
    }
}
