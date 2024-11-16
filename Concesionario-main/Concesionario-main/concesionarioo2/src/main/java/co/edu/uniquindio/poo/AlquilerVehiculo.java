package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;

public class AlquilerVehiculo {
    
    private String codigo;
    private int diasAlquiler;
    private int precioAlquilerPorDia;
    private Collection <Vehiculo> vehiculos;
    private Empleado empleado; 
    private Cliente cliente;

    public AlquilerVehiculo (String codigo, int diasAlquiler, int precioAlquilerPorDia, Empleado emplead, Cliente cliente){
        this.codigo = codigo;
        this.diasAlquiler = diasAlquiler;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
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
        return "AlquilerVehiculo [codigo=" + codigo + ", diasAlquiler=" + diasAlquiler + ", precioAlquilerPorDia="
                + precioAlquilerPorDia + "]";
    }

    

}
