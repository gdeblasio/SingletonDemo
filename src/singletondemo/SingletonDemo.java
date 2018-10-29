package singletondemo;

public class SingletonDemo {

    public static void main(String[] args) {
        Sesion s1 = Sesion.getInstance();
        s1.setUsuario("luisa");
        System.out.println("usuario sesión 1: " + s1.getUsuario());
        
        Sesion s2 = Sesion.getInstance();
        System.out.println("usuario sesión 2: " + s2.getUsuario());
    }
}
