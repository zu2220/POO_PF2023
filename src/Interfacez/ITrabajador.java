
package Interfacez;

import Clases.Trabajador;
public interface ITrabajador {
    public Trabajador[] getAllTrabajador();
    public Trabajador getTrabajadorByIndex(int index);
    public void addTrabajador(Trabajador obj);
    public void updateTrabajador(Trabajador obj);
    public void deleteTrabajador(String codigo);
    
    
}
