package co.edu.uniquindio.poo;

public class Deportivo_e extends Vehiculo_electrico{

    public int numeropasajeros;
    public int numeropuertas;
    public int numerobolsasaire;
    public int caballosfuerza;
    public int tiempo;

    public Deportivo_e(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, co.edu.uniquindio.poo.Vehiculo.TipoTransmision tipoTransmision,
            String autonomiacargacompleta, int tiempopromediocarga, int numeropasajeros, int numeropuertas,
            int numerobolsasaire, int caballosfuerza, int tiempo) {
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, autonomiacargacompleta,
                tiempopromediocarga);
        this.numeropasajeros = numeropasajeros;
        this.numeropuertas = numeropuertas;
        this.numerobolsasaire = numerobolsasaire;
        this.caballosfuerza = caballosfuerza;
        this.tiempo = tiempo;
    }


    public int getNumeropasajeros() {
        return numeropasajeros;
    }


    public void setNumeropasajeros(int numeropasajeros) {
        this.numeropasajeros = numeropasajeros;
    }


    public int getNumeropuertas() {
        return numeropuertas;
    }


    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }


    public int getNumerobolsasaire() {
        return numerobolsasaire;
    }


    public void setNumerobolsasaire(int numerobolsasaire) {
        this.numerobolsasaire = numerobolsasaire;
    }


    public int getCaballosfuerza() {
        return caballosfuerza;
    }


    public void setCaballosfuerza(int caballosfuerza) {
        this.caballosfuerza = caballosfuerza;
    }


    public int getTiempo() {
        return tiempo;
    }


    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }


    @Override
    public String toString() {
        return "Deportivo_e [numeropasajeros=" + numeropasajeros + ", numeropuertas=" + numeropuertas
                + ", numerobolsasaire=" + numerobolsasaire + ", caballosfuerza=" + caballosfuerza + ", tiempo=" + tiempo
                + "]";
    }

    

    

}
