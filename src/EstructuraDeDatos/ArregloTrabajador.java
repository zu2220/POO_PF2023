
package EstructuraDeDatos;

import Clases.Trabajador;
import Interfacez.ITrabajador;
public class ArregloTrabajador implements ITrabajador {

    Trabajador[] listaT = null;
    private int index;
    
    public ArregloTrabajador(int cantidad){
        this.index=0;
        listaT=new Trabajador[cantidad];
    }
    
    @Override
    public Trabajador[] getAllTrabajador() {
        return null;
    }

    @Override
    public Trabajador getTrabajadorByIndex(int index) {
        return listaT[index];
    }

    @Override
    public void addTrabajador(Trabajador obj) {
        listaT[index]= obj;
        index++;
    }

    @Override
    public void updateTrabajador(Trabajador obj) {
        
    }

    @Override
    public void deleteTrabajador(String codigo) {
        /*for(int i=0; i<ListaT.length && ListaT[i].getCodigo().equals(codigo); i++){
            if(ListaT[i].getCodigo().equals(codigo))
                
            
        }*/
       
        
    }
    
    
}
