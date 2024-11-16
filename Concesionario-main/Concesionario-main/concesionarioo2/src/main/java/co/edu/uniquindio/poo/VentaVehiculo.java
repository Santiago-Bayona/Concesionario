package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

public class VentaVehiculo {

    private String codigo;
    private int precioVenta;
    private VehiculoGasolinaDiesel VehiculoGasolinaDiesel;
    private VehiculoHibrido vehiculoHibrido;
    private VehiculoElectrico vehiculoElectrico;
    private Empleado empleado; 
    private Cliente cliente;

    public  VentaVehiculo (String codigo, int precioVenta, VehiculoGasolinaDiesel VehiculoGasolinaDiesel, VehiculoHibrido vehiculoHibrido, VehiculoElectrico vehiculoElectrico, Empleado empleado, Cliente cliente){
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.VehiculoGasolinaDiesel = vehiculoGasolinaDiesel;
        this.vehiculoHibrido = vehiculoHibrido;
        this.vehiculoElectrico = vehiculoElectrico;
        this.empleado = empleado;
        this.cliente = cliente;
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
   

    public VehiculoGasolinaDiesel getVehiculoGasolinaDiesel() {
        return VehiculoGasolinaDiesel;
    }

    public void setVehiculoGasolinaDiesel(VehiculoGasolinaDiesel vehiculoGasolinaDiesel) {
        VehiculoGasolinaDiesel = vehiculoGasolinaDiesel;
    }

    public VehiculoHibrido getVehiculoHibrido() {
        return vehiculoHibrido;
    }

    public void setVehiculoHibrido(VehiculoHibrido vehiculoHibrido) {
        this.vehiculoHibrido = vehiculoHibrido;
    }

    public VehiculoElectrico getVehiculoElectrico() {
        return vehiculoElectrico;
    }

    public void setVehiculoElectrico(VehiculoElectrico vehiculoElectrico) {
        this.vehiculoElectrico = vehiculoElectrico;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "VentaVehiculo [codigo=" + codigo + ", precioVenta=" + precioVenta + "]";
    }

    

}
