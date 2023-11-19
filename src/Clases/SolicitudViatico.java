
package Clases;


public class SolicitudViatico {
    private String codSolicitud;
    private String codRemitente;
    private String fechaSolicitud;
    private String fechaIda;
    private String fechaRetorno;
    private String tipoViaje;
    private Viatico monto;

    public SolicitudViatico() {
    }

    public SolicitudViatico(String codSolicitud, String codRemitente, String fechaSolicitud, String fechaIda, String fechaRetorno, String tipoViaje, Viatico monto) {
        this.codSolicitud = codSolicitud;
        this.codRemitente = codRemitente;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaIda = fechaIda;
        this.fechaRetorno = fechaRetorno;
        this.tipoViaje = tipoViaje;
        this.monto = monto;
    }

    public String getCodSolicitud() {
        return codSolicitud;
    }

    public void setCodSolicitud(String codSolicitud) {
        this.codSolicitud = codSolicitud;
    }

    public String getCodRemitente() {
        return codRemitente;
    }

    public void setCodRemitente(String codRemitente) {
        this.codRemitente = codRemitente;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(String fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public Viatico getMonto() {
        return monto;
    }

    public void setMonto(Viatico monto) {
        this.monto = monto;
    }

    
    
}
