package co.edu.uniquindio.poo;

public class VanGD extends VehiculoGD{
    
    private int numeroBolsas,NumeroPasajeros,numeroPuertas;
    private boolean camaraReversa,ABS,aireAcondicionado;
    public double capacidadMaletero;
    

    public VanGD(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            TipoTransmision tipoTransmision, GD gd, int numeroBolsas,
            int numeroPasajeros, int numeroPuertas, boolean camaraReversa, boolean aBS, boolean aireAcondicionado,
            double capacidadMaletero) {
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gd);
        this.numeroBolsas = numeroBolsas;
        NumeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.camaraReversa = camaraReversa;
        ABS = aBS;
        this.aireAcondicionado = aireAcondicionado;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsas() {
        return numeroBolsas;
    }

    public void setNumeroBolsas(int numeroBolsas) {
        this.numeroBolsas = numeroBolsas;
    }

    public int getNumeroPasajeros() {
        return NumeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.NumeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        this.ABS = aBS;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Van" + super.toString() + "[numeroBolsas=" + numeroBolsas + ", NumeroPasajeros=" + NumeroPasajeros + ", numeroPuertas="
                + numeroPuertas + ", camaraReversa=" + camaraReversa + ", ABS=" + ABS + ", aireAcondicionado="
                + aireAcondicionado + ", capacidadMaletero=" + capacidadMaletero + "]";
    }
 
}
