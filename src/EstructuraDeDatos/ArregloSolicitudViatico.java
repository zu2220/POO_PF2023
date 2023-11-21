
package EstructuraDeDatos;

import Clases.SolicitudViatico;
import Interfacez.ISolicitudViatico;
import java.util.ArrayList;
import java.util.List;
public class ArregloSolicitudViatico implements ISolicitudViatico {
    
    List <SolicitudViatico> listaS = null;
    private int index;

    public ArregloSolicitudViatico() {
        this.index = 0;
        listaS=new ArrayList<SolicitudViatico> ();
    }
    
    

    @Override
    public SolicitudViatico[] getAllSolicitudViatico() { //REVISAR
        return null;
    }

    @Override
    public SolicitudViatico getSolicitudViaticoByIndex(int index) {
        return listaS.get(index);
    }

    @Override
    public void addSolicitudViatico(SolicitudViatico obj) {
        listaS.add(index, obj);
        index++;
    }

    @Override
    public void updateSolicitudViatico(SolicitudViatico obj) {
    }

    @Override
    public void deleteSolicitudViatico(String codigoSolicitud) {
    }
}
