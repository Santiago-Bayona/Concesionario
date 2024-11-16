package co.edu.uniquindio.poo;

public class BusGD extends VanGD{
    private int numeroEjes, SalidasEmergencia;

    

    

    public BusGD(String placa, String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, co.edu.uniquindio.poo.Vehiculo.TipoTransmision tipoTransmision, GD gd, int numeroBolsas,
            int numeroPasajeros, int numeroPuertas, boolean camaraReversa, boolean aBS, boolean aireAcondicionado,
            double capacidadMaletero, int numeroEjes, int salidasEmergencia) {
        super(placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gd, numeroBolsas,
                numeroPasajeros, numeroPuertas, camaraReversa, aBS, aireAcondicionado, capacidadMaletero);
        this.numeroEjes = numeroEjes;
        SalidasEmergencia = salidasEmergencia;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getSalidasEmergencia() {
        return SalidasEmergencia;
    }

    public void setSalidasEmergencia(int salidasEmergencia) {
        SalidasEmergencia = salidasEmergencia;
    }

    @Override
    public String toString() {
        return "Bus"+ super.toString()+ "[numeroEjes=" + numeroEjes + ", SalidasEmergencia=" + SalidasEmergencia + "]";
    }

}
