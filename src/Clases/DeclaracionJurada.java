
package Clases;


public class DeclaracionJurada extends DocumentoAcreditadorGasto {
    private String nombreDeclarador;
    private Comisionado comisionado;
    private double importe;
    private String justificacion;

    public String getNombreDeclarador() {
        return nombreDeclarador;
    }

    public void setNombreDeclarador(String nombreDeclarador) {
        this.nombreDeclarador = nombreDeclarador;
    }

    public Comisionado getComisionado() {
        return comisionado;
    }

    public void setComisionado(Comisionado comisionado) {
        this.comisionado = comisionado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
    
    
            
}
