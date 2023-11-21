package Clases;

public class Usuario {
   private String login;
   private String password;
   private String rol_trabajador;
   private Trabajador trabajador;

    public Usuario() {
    }

    public Usuario(String login, String clave, String rol, Trabajador trabajador) {
        this.login = login;
        this.password = password;
        this.rol_trabajador = rol_trabajador;
        this.trabajador = trabajador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String clave) {
        this.password = password;
    }

    public String getRol_trabajador() {
        return rol_trabajador;
    }

    public void setRol_trabajador(String rol) {
        this.rol_trabajador = rol;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
   
}
