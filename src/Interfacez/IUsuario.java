package Interfacez;
import Clases.Usuario;
import java.util.List;

public interface IUsuario {
    
    public boolean add(Usuario obj);
    public boolean update(Usuario obj);
    public boolean delete(String login);
    public List<Usuario> getUsuarios();
    public Usuario getUsuario(String login);
    public Usuario validarCredenciales(String login, String clave);

}