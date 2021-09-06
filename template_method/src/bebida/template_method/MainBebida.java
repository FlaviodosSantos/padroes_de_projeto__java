package bebida.template_method;

public class MainBebida {
    public static void main(String[] args) {
        System.out.println("\nPreparando Café :\n");

        BebidaCafeinada cafe = new Cafe();
        cafe.prepararBebida();
        
        System.out.println("\nPreparando Chá :\n");

        BebidaCafeinada cha = new Cha();
        cha.prepararBebida();
    }
}
