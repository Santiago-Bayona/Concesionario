package co.edu.uniquindio.poo;

public class DeportivoGD extends VehiculoGD{
    private int numeroPasajeros, numeroBolsas, numeroPuertas, CaballosFuerza, Tiempo;

    

    public DeportivoGD(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, GD gd,
            int numeroPasajeros, int numeroBolsas, int numeroPuertas, int caballosFuerza, int tiempo) {
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gd);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroBolsas = numeroBolsas;
        this.numeroPuertas = numeroPuertas;
        CaballosFuerza = caballosFuerza;
        Tiempo = tiempo;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroBolsas() {
        return numeroBolsas;
    }

    public void setNumeroBolsas(int numeroBolsas) {
        this.numeroBolsas = numeroBolsas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCaballosFuerza() {
        return CaballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.CaballosFuerza = caballosFuerza;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int tiempo) {
        this.Tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Deportivo" + super.toString() +"[numeroPasajeros=" + numeroPasajeros + ", numeroBolsas=" + numeroBolsas + ", numeroPuertas="
                + numeroPuertas + ", CaballosFuerza=" + CaballosFuerza + ", Tiempo=" + Tiempo + "]";
    }   
}