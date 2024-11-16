package co.edu.uniquindio.poo;

public class MotoGD extends VehiculoGD{
    

    public MotoGD(String placa,String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje,
    TipoTransmision tipoTransmision, GD gd){
        super(placa,marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gd);
    }

    @Override
    public String toString() {
        return "Moto [" + super.toString()+ "]";
    }
}
