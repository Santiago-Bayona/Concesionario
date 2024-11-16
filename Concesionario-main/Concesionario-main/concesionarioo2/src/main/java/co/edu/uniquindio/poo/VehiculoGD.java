package co.edu.uniquindio.poo;

public class VehiculoGD extends Vehiculo{

    public GD gd;
    public enum GD{ 
        GASOLINA,DIESEL
    }
    public VehiculoGD(String Placa,String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            TipoTransmision tipoTransmision, GD gd) {
        super(marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision,Placa);
        this.gd = gd;
    }
    public GD getGd() {
        return gd;
    }
    public void setGd(GD gd) {
        this.gd = gd;
    }
    @Override
    public String toString() {
        return "VehiculoGD [" + super.toString() + "gd=" + gd + "]";
    }   
}