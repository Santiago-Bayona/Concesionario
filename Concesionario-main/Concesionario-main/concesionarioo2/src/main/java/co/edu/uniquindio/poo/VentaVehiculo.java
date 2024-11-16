package co.edu.uniquindio.poo;

public class VentaVehiculo {

    //collection VEHICULOS
    private String codigo;
    private int precioVenta;

    public  VentaVehiculo (String codigo, int precioVenta){
        this.codigo = codigo;
        this.precioVenta = precioVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "VentaVehiculo [codigo=" + codigo + ", precioVenta=" + precioVenta + "]";
    }
}