package co.edu.uniquindio.poo.Concensionario;

public class CamionGD extends VehiculoGD{
    private boolean ABS,aireAcondicionado,FrenosAire;
    private double CapacidadCarga;
    private int numeroEjes;
    public TipoCamion TipoCamion;
    public enum TipoCamion{
        VOLQUETE,PLATAFORMA
    }
    
    

    public CamionGD(String marca, boolean nuevoUsado, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            co.edu.uniquindio.poo.Concensionario.Vehiculo.TipoTransmision tipoTransmision, GD gd, boolean aBS,
            boolean aireAcondicionado, boolean frenosAire, double capacidadCarga, int numeroEjes,
            co.edu.uniquindio.poo.Concensionario.CamionGD.TipoCamion tipoCamion) {
        super(marca, nuevoUsado, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gd);
        ABS = aBS;
        this.aireAcondicionado = aireAcondicionado;
        FrenosAire = frenosAire;
        CapacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        TipoCamion = tipoCamion;
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
    public boolean isFrenosAire() {
        return FrenosAire;
    }
    public void setFrenosAire(boolean frenosAire) {
        this.FrenosAire = frenosAire;
    }
    public double getCapacidadCarga() {
        return CapacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.CapacidadCarga = capacidadCarga;
    }
    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    public TipoCamion getTipoCamion() {
        return TipoCamion;
    }
    public void setTipoCamion(TipoCamion tipoCamion) {
        this.TipoCamion = tipoCamion;
    }
    @Override
    public String toString() {
        return "Camion"+ super.toString()+ "[ABS=" + ABS + ", aireAcondicionado=" + aireAcondicionado + ", FrenosAire=" + FrenosAire
                + ", CapacidadCarga=" + CapacidadCarga + ", numeroEjes=" + numeroEjes + ", TipoCamion=" + TipoCamion
                + "]";
    }
}