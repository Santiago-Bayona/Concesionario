package co.edu.uniquindio.poo.Concensionario;

public class BusGD extends VanGD{
    private int numeroEjes, SalidasEmergencia;

    

    public BusGD(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            co.edu.uniquindio.poo.Concensionario.Vehiculo.TipoTransmision tipoTransmision, GD gd, int numeroBolsas,
            int numeroPasajeros, int numeroPuertas, boolean camaraReversa, boolean aBS, boolean aireAcondicionado,
            double capacidadMaletero, int numeroEjes, int salidasEmergencia) {
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gd, numeroBolsas,
                numeroPasajeros, numeroPuertas, camaraReversa, aBS, aireAcondicionado, capacidadMaletero);
        this.numeroEjes = numeroEjes;
        this.SalidasEmergencia = salidasEmergencia;
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
