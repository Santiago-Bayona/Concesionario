package co.edu.uniquindio.poo;

public class Pick_up_e extends Vehiculo_electrico {

    public int numeropasajeros;
    public int numeropuertas;
    public boolean aireAcondionado;
    public boolean camaraReversa;
    public int numerobolsasaire;
    public boolean ABS;
    public boolean cuatrox4;
    public double capacidadCajaCarga;

    

    public Pick_up_e(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            TipoTransmision tipoTransmision, String autonomiacargacompleta,
            int tiempopromediocarga, int numeropasajeros, int numeropuertas, boolean aireAcondionado,
            boolean camaraReversa, int numerobolsasaire, boolean aBS, boolean cuatrox4, double capacidadCajaCarga) {
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, autonomiacargacompleta,
                tiempopromediocarga);
        this.numeropasajeros = numeropasajeros;
        this.numeropuertas = numeropuertas;
        this.aireAcondionado = aireAcondionado;
        this.camaraReversa = camaraReversa;
        this.numerobolsasaire = numerobolsasaire;
        ABS = aBS;
        this.cuatrox4 = cuatrox4;
        this.capacidadCajaCarga = capacidadCajaCarga;
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

    public boolean isAireAcondionado() {
        return aireAcondionado;
    }

    public void setAireAcondionado(boolean aireAcondionado) {
        this.aireAcondionado = aireAcondionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumerobolsasaire() {
        return numerobolsasaire;
    }

    public void setNumerobolsasaire(int numerobolsasaire) {
        this.numerobolsasaire = numerobolsasaire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public boolean isCuatrox4() {
        return cuatrox4;
    }

    public void setCuatrox4(boolean cuatrox4) {
        this.cuatrox4 = cuatrox4;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String toString() {
        return "Pick_up_e [numeropasajeros=" + numeropasajeros + ", numeropuertas=" + numeropuertas
                + ", aireAcondionado=" + aireAcondionado + ", camaraReversa=" + camaraReversa + ", numerobolsasaire="
                + numerobolsasaire + ", ABS=" + ABS + ", cuatrox4=" + cuatrox4 + ", capacidadCajaCarga="
                + capacidadCajaCarga + "]";
    }

    

}
