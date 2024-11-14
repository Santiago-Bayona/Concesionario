package co.edu.uniquindio.poo.Concensionario;

public class Camioneta_SuvGD extends SedanGD{

    private boolean CuatroxCuatro;

    

    public Camioneta_SuvGD(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, co.edu.uniquindio.poo.Concensionario.Vehiculo.TipoTransmision tipoTransmision, GD gd,
            int numeroPuertas, int numeroBolsas, int numeroPasajeros, double capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, boolean sensoresDeColision,
            boolean traficoCruzado, boolean aPC, boolean aBS, boolean cuatroxCuatro) {
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gd, numeroPuertas,
                numeroBolsas, numeroPasajeros, capacidadMaletero, aireAcondicionado, camaraReversa, velocidadCrucero,
                sensoresDeColision, traficoCruzado, aPC, aBS);
        CuatroxCuatro = cuatroxCuatro;
    }

    public boolean getCuatroxCuatro(){
        return CuatroxCuatro;
    }

    public void setCuatroxCuatro(boolean cuatroxCuatro){
        this.CuatroxCuatro=cuatroxCuatro;
    }

    @Override
    public String toString() {
        return "Camioneta_Suv" + super.toString() + "[CuatroxCuatro=" + CuatroxCuatro + "]";
    }   
}