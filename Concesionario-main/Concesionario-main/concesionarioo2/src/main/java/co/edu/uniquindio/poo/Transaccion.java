package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Transaccion {

    private String codigo;
    private LocalDate fechaRealizada;
    private int monto;
    private boolean TransaccionRealizada;
    private Collection <Vehiculo> vehiculos;
     private Empleado empleado; 
    private Cliente cliente;
    

    public Transaccion(String codigo, LocalDate fechaRealizada, int monto,
            boolean TransaccionRealizada, Empleado empleado, Cliente cliente) {

        this.codigo = codigo;
        this.fechaRealizada = fechaRealizada;
        this.monto = monto;
        this.TransaccionRealizada = TransaccionRealizada;
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

    public LocalDate getFechaRealizada() {
        return fechaRealizada;
    }

    public void setFechaRealizada(LocalDate fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isTransaccionRealizada() {
        return TransaccionRealizada;
    }

    public void setTransaccionRealizada(boolean transaccionRealizada) {
        TransaccionRealizada = transaccionRealizada;
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
        return "Transaccion [codigo=" + codigo + ", fechaRealizada=" + fechaRealizada + ", detalleTransaccion="
                + detalleTransaccion + ", monto=" + monto + ", TransaccionRealizada=" + TransaccionRealizada + "]";
    }

    

}
