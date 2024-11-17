package co.edu.uniquindio.poo;

public class BusElectrico extends VanElectrico {
    private int numeroSalidasEmergencia;

    public BusElectrico(String Placa, String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, co.edu.uniquindio.poo.Vehiculo.TipoTransmision tipoTransmision, 
             int numeroPasajeros, int numeropuertas, double capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReversa, int numeroBolsasAire, boolean aBS,
            int numeroSalidasEmergencia, String autonomiacargacompleta, int tiempopromediocarga) {
        super(Placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, autonomiacargacompleta, tiempopromediocarga,  numeropuertas, aireAcondicionado,numeroPasajeros, camaraReversa, numeroBolsasAire, aBS, capacidadMaletero, tipoTransmision);
      
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    @Override
    public String toString() {
        return "Bus_e [numeroSalidasEmergencia=" + numeroSalidasEmergencia + "]";
    }

    


  

}
