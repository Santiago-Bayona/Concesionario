package co.edu.uniquindio.poo;

public class BusElectrico extends CamionElectrico {
    private int numeroSalidasEmergencia;

    public BusElectrico(String codigo, String marca, boolean estado, String modelo, int cambios, int velocidadmaxima, int cilindraje,
            String autonomiacargacompleta, int tiempopromediocarga, double capacidadCarga, boolean frenosAire, boolean ABS,
            int numeroEjes, int numeroejes, int numeroSalidasEmergencia,co.edu.uniquindio.poo.Vehiculo.TipoTransmision tipoTransmision) {
        super(codigo, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, autonomiacargacompleta, tiempopromediocarga,capacidadCarga,ABS,frenosAire,numeroEjes,tipoTransmision);
      
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
