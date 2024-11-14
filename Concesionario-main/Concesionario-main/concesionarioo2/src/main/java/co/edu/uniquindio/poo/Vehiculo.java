package co.edu.uniquindio.poo;

public class Vehiculo {

    private String Marca;
    private boolean NuevoUsado;
    private String Modelo;
    private int cambios;
    private int VelocidadMaxima;
    private int Cilindraje;
    public TipoTransmision TipoTransmision;
    public enum TipoTransmision{
        mMANUAL, AUTOMATICA
    } 
    
    
    public Vehiculo(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje, TipoTransmision tipoTransmision) {
        this.Marca = marca;
        this.NuevoUsado = nuevoUsado;
        this.Modelo = modelo;
        this.cambios = cambios;
        this.VelocidadMaxima = velocidadMaxima;
        this.Cilindraje = cilindraje;
        this.TipoTransmision = tipoTransmision;
    }
    
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public boolean isNuevoUsado() {
        return NuevoUsado;
    }
    public void setNuevoUsado(boolean nuevoUsado) {
        NuevoUsado = nuevoUsado;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public int getCambios() {
        return cambios;
    }
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        VelocidadMaxima = velocidadMaxima;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public TipoTransmision getTipoTransmision() {
        return TipoTransmision;
    }
    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        TipoTransmision = tipoTransmision;
    }

    @Override
    public String toString() {
        return "Vehiculo [Marca=" + Marca + ", NuevoUsado=" + NuevoUsado + ", Modelo=" + Modelo + ", cambios=" + cambios
                + ", VelocidadMaxima=" + VelocidadMaxima + ", Cilindraje=" + Cilindraje + ", TipoTransmision="
                + TipoTransmision + ", Combustible=" + "]";
    }
}
