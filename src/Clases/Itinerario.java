
package Clases;


public class Itinerario {
    private int numActividades;
    private String pais;
    private String ciudad;

    public Itinerario() {
    }

    public Itinerario(int numActividades, String pais, String ciudad) {
        this.numActividades = numActividades;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public int getNumActividades() {
        return numActividades;
    }

    public void setNumActividades(int numActividades) {
        this.numActividades = numActividades;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
