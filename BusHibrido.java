package co.edu.uniquindio.poo;

public class BusHibrido extends VanHibrido {

    private int numeroEjes;
    private int numeroSalidasEmergencia;

    public BusHibrido (String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje, TipoTransmision tipoTransmision, boolean enchufable, boolean hibridoLigero, int numeroPasajeros, int numeroPuertas, double capacidadMaletero,boolean aireAcondicionado, boolean camaraReversa, int numeroBolsasAire, boolean ABS, int numeroEjes, int numeroSalidasEmergencia){
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, enchufable, hibridoLigero, numeroPasajeros, numeroPuertas, capacidadMaletero, aireAcondicionado, camaraReversa, numeroBolsasAire, ABS);
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;       
}

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    @Override
    public String toString() {
        return "BusHibrido [numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia + "]";
    }

    

}