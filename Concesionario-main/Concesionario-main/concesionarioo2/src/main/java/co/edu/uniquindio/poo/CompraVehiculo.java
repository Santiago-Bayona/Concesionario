package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

public class CompraVehiculo {

    private String codigo;
    private int precioVenta;
    private boolean revisionTecnicaAprobado;
    private Collection <Vehiculo> vehiculos;
    private Empleado empleado; 
    private Cliente cliente;

    public CompraVehiculo (String codigo, int precioVenta, boolean revisionTecnicaAprobado, Empleado empleado, Cliente cliente){
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.revisionTecnicaAprobado = revisionTecnicaAprobado;
        this.vehiculos = new LinkedList<>();
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

    public boolean isRevisionTecnicaAprobado() {
        return revisionTecnicaAprobado;
    }

    public void setRevisionTecnicaAprobado(boolean revisionTecnicaAprobado) {
        this.revisionTecnicaAprobado = revisionTecnicaAprobado;
    }


    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
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
        return "CompraVehiculo [codigo=" + codigo + ", precioVenta=" + precioVenta + ", revisionTecnicaAprobado="
                + revisionTecnicaAprobado + "]";
    }

    


}
