package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;

public class AlquilerVehiculo {
    
    private String codigo;
    private int diasAlquiler;
    private int precioAlquilerPorDia;
    private VehiculoGasolinaDiesel VehiculoGasolinaDiesel;
    private VehiculoHibrido vehiculoHibrido;
    private VehiculoElectrico vehiculoElectrico;
    private Empleado empleado; 
    private Cliente cliente;

    public AlquilerVehiculo (String codigo, int diasAlquiler, int precioAlquilerPorDia,  VehiculoGasolinaDiesel VehiculoGasolinaDiesel, VehiculoHibrido vehiculoHibrido, VehiculoElectrico vehiculoElectrico, Empleado empleado, Cliente cliente){
        this.codigo = codigo;
        this.diasAlquiler = diasAlquiler;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
        this.vehiculoGasolinaDiesel = vehiculoGasolinaDiesel;
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
        return "AlquilerVehiculo [codigo=" + codigo + ", diasAlquiler=" + diasAlquiler + ", precioAlquilerPorDia="
                + precioAlquilerPorDia + "]";
    }

    

}
