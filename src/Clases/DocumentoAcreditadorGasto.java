
package Clases;


public class DocumentoAcreditadorGasto {
    private String nombreEmpresa;
    private double montoGasto;
    private String fechaGasto;

    public DocumentoAcreditadorGasto() {
    }

    public DocumentoAcreditadorGasto(String nombreEmpresa, double montoGasto, String fechaGasto) {
        this.nombreEmpresa = nombreEmpresa;
        this.montoGasto = montoGasto;
        this.fechaGasto = fechaGasto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public double getMontoGasto() {
        return montoGasto;
    }

    public void setMontoGasto(double montoGasto) {
        this.montoGasto = montoGasto;
    }

    public String getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(String fechaGasto) {
        this.fechaGasto = fechaGasto;
    }
    
    
}
