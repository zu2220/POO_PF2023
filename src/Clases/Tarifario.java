
package Clases;


public class Tarifario {
    private double pasajes;
    private double alimentación;
    private double hospedaje;
    private double transporteInterno;

    public Tarifario() {
    }

    public Tarifario(double pasajes, double alimentación, double hospedaje, double transporteInterno) {
        this.pasajes = pasajes;
        this.alimentación = alimentación;
        this.hospedaje = hospedaje;
        this.transporteInterno = transporteInterno;
    }

    public double getPasajes() {
        return pasajes;
    }

    public void setPasajes(double pasajes) {
        this.pasajes = pasajes;
    }

    public double getAlimentación() {
        return alimentación;
    }

    public void setAlimentación(double alimentación) {
        this.alimentación = alimentación;
    }

    public double getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(double hospedaje) {
        this.hospedaje = hospedaje;
    }

    public double getTransporteInterno() {
        return transporteInterno;
    }

    public void setTransporteInterno(double transporteInterno) {
        this.transporteInterno = transporteInterno;
    }
    
    
    
}
