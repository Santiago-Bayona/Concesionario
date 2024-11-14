package co.edu.uniquindio.poo;

public class MotoGD extends VehiculoGD{
    

    public MotoGD(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje,
    TipoTransmision tipoTransmision, GD gd){
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gd);
    }

    @Override
    public String toString() {
        return "Moto [" + super.toString()+ "]";
    }
}
