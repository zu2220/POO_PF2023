
package Interfacez;

import Clases.SolicitudViatico;
public interface ISolicitudViatico {
    public SolicitudViatico[] getAllSolicitudViatico(); //Listado
    public SolicitudViatico getSolicitudViaticoByIndex(int index);  //Buscar
    public void addSolicitudViatico(SolicitudViatico obj); //Añadir
    public void updateSolicitudViatico(SolicitudViatico obj); //Actualizar o editar
    public void deleteSolicitudViatico(String codigoSolicitud); //Eliminar
}
