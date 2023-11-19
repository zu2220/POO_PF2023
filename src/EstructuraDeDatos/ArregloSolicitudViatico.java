
package EstructuraDeDatos;

import Clases.SolicitudViatico;
import Interfacez.ISolicitudViatico;
public class ArregloSolicitudViatico implements ISolicitudViatico {
    
    SolicitudViatico[] listaS = null;
    private int index;

    public ArregloSolicitudViatico(int cantidad) {
        this.index = 0;
        listaS=new SolicitudViatico[cantidad];
    }
    
    

    @Override
    public SolicitudViatico[] getAllSolicitudViatico() {
        return null;
    }

    @Override
    public SolicitudViatico getSolicitudViaticoByIndex(int index) {
        return listaS[index];
    }

    @Override
    public void addSolicitudViatico(SolicitudViatico obj) {
        listaS[index]= obj;
        index++;
    }

    @Override
    public void updateSolicitudViatico(SolicitudViatico obj) {
    }

    @Override
    public void deleteSolicitudViatico(String codigoSolicitud) {
    }
}
