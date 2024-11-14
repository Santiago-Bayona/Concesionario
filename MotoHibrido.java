package co.edu.uniquindio.poo;

public class MotoHibrido extends VehiculoHibrido{

    public MotoHibrido (String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje, TipoTransmision tipoTransmision, boolean enchufable, boolean hibridoLigero){
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, enchufable, hibridoLigero);
    }

    @Override
    public String toString() {
        return "MotoHibrido []";
    }

    
    
}
