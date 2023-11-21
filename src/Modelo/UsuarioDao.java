package Modelo;

import Clases.Cargo;
import Clases.Trabajador;
import Clases.Usuario;
import Interfacez.IUsuario;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static util.DataSource.DataSource;

public class UsuarioDao implements IUsuario{

    @Override
    public boolean add(Usuario obj) {
       boolean flag=false; 
        //Conexion BD
        try{
            String query = " INSERT INTO Usuario ";
                   query += "(login, password, rol_trabajador,codigo_trabajador) ";
                   query += " VALUES(?,?,?,?)";
            PreparedStatement  stmt = DataSource().prepareStatement(query);
            stmt.setString(1, obj.getLogin());
            stmt.setString(2, obj.getPassword());
            stmt.setString(3, obj.getRol_trabajador());
            stmt.setString(4, obj.getTrabajador().getCodigo());
            flag = stmt.execute();
        }
        catch(Exception ex){System.out.println(ex.getMessage());}
        return flag;
        
    }

    @Override
    public boolean update(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> getUsuarios() {
         ArrayList<Usuario> data = new ArrayList<>();
        //Conexion BD
        try{
            
            
            String query = "SELECT tt.nombre_trabajador, tt.apellido_trabajador, uu.login, uu.rol_trabajador, uu.codigo_trabajador ";
                   query += "FROM Usuario uu ";
                   query += "inner join Trabajadot tt on uu.codigo_trabajador = tt.codigo_trabajador ";
            Statement  stmt = DataSource().createStatement();       
            ResultSet rs = stmt.executeQuery(query);
            
            
            //Recuperacion de registros
            while(rs.next()){
                Trabajador trabaj = new Trabajador();
                trabaj.setCodigo(rs.getString(1));
                trabaj.setNombre(rs.getString(2));    
                trabaj.setApellido(rs.getString(3));
                trabaj.setTipoDocumento(rs.getString(4));
                trabaj.setSexo(rs.getString(5));
                trabaj.setDireccion(rs.getString(6));
                Cargo cargo=new Cargo();
                cargo.setNombreCargo(rs.getString(7));
                cargo.setTipoCargo(rs.getString(8));
                trabaj.setCargo(cargo); 
                
                Usuario aux = new Usuario();
                aux.setLogin(rs.getString(3));
                aux.setRol_trabajador(rs.getString(4));
                aux.setTrabajador(trabaj);   
                
                data.add(aux);            
            }
        }
        catch(Exception ex){System.out.println(ex.getMessage());}
        return data;
    }

    @Override
    public Usuario getUsuario(String login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario validarCredenciales(String login, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
