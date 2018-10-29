package singletondemo;

public class Sesion {
    private static Sesion sesion;
    private String usuario;

    public Sesion() {
    }
    
    public static Sesion getInstance() {
        if (sesion == null) {
            sesion = new Sesion();
        }
        return sesion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
