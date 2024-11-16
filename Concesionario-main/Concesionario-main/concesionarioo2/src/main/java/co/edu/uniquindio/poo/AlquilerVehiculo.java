package co.edu.uniquindio.poo;

public class AlquilerVehiculo {
    
    private String codigo;
    private int diasAlquiler;
    private int precioAlquilerPorDia;

    public AlquilerVehiculo (String codigo, int diasAlquiler, int precioAlquilerPorDia){
        this.codigo = codigo;
        this.diasAlquiler = diasAlquiler;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public int getPrecioAlquilerPorDia() {
        return precioAlquilerPorDia;
    }

    public void setPrecioAlquilerPorDia(int precioAlquilerPorDia) {
        this.precioAlquilerPorDia = precioAlquilerPorDia;
    }

    @Override
    public String toString() {
        return "AlquilerVehiculo [codigo=" + codigo + ", diasAlquiler=" + diasAlquiler + ", precioAlquilerPorDia="
                + precioAlquilerPorDia + "]";
    }
}
