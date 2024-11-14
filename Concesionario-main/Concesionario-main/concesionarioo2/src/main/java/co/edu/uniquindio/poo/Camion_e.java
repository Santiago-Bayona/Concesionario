package co.edu.uniquindio.poo;

public class Camion_e extends Vehiculo_electrico {
    
    private double capacidadCarga;
    private boolean frenosAire;
    private boolean ABS;
    private int numeroEjes;

    public enum TipoCamion{
        PLATAFORMA,VOLQUETE
    }

    

    public Camion_e(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            co.edu.uniquindio.poo.Vehiculo.TipoTransmision tipoTransmision, String autonomiacargacompleta,
            int tiempopromediocarga, double capacidadCarga, boolean frenosAire, boolean aBS, int numeroEjes) {
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, autonomiacargacompleta,
                tiempopromediocarga);
        this.capacidadCarga = capacidadCarga;
        this.frenosAire = frenosAire;
        ABS = aBS;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "Camion_e [capacidadCarga=" + capacidadCarga + ", frenosAire=" + frenosAire + ", ABS=" + ABS
                + ", numeroEjes=" + numeroEjes + "]";
    }

    
   

}
