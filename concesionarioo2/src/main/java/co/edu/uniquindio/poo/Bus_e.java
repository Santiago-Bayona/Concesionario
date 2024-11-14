package co.edu.uniquindio.poo;

public class Bus_e extends Camion_e {
    private int numeroSalidasEmergencia;

    public Bus_e(String codigo, String marca, boolean estado, String modelo, int cambios, int velocidadmaxima, int cilindraje,
            String autonomiacargacompleta, int tiempopromediocarga, double capacidadCarga, boolean frenosAire, boolean ABS,
            int numeroEjes, int numeroejes, int numeroSalidasEmergencia) {
        super(codigo, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, autonomiacargacompleta, tiempopromediocarga,capacidadCarga,ABS,frenosAire,numeroEjes);
      
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
