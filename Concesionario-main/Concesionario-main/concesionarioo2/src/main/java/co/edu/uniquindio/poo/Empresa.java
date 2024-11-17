package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {
    public String nombre;
    public Collection<Administrador>administradores;
    public Collection<Transaccion>transacciones;
    public Collection<VentaVehiculo>ventas;
    public Collection<CompraVehiculo>compras;
    public Collection<AlquilerVehiculo>alquilerVehiculos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.administradores = new LinkedList<>();
        this.transacciones = new LinkedList<>();
        this.ventas = new LinkedList<>();
        this.alquilerVehiculos = new LinkedList<>();
        this.compras = new LinkedList<>();
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public Collection<Administrador> getAdministradores() {
        return administradores;
    }




    public void setAdministradores(Collection<Administrador> administradores) {
        this.administradores = administradores;
    }




    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }




    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }




    public Collection<VentaVehiculo> getVentas() {
        return ventas;
    }




    public void setVentas(Collection<VentaVehiculo> ventas) {
        this.ventas = ventas;
    }




    public Collection<CompraVehiculo> getCompras() {
        return compras;
    }




    public void setCompras(Collection<CompraVehiculo> compras) {
        this.compras = compras;
    }




    public Collection<AlquilerVehiculo> getAlquilerVehiculos() {
        return alquilerVehiculos;
    }




    public void setAlquilerVehiculos(Collection<AlquilerVehiculo> alquilerVehiculos) {
        this.alquilerVehiculos = alquilerVehiculos;
    }




    public boolean verificarTransaccion(String codigo) {
        for (Transaccion transaccion : transacciones) {
            if (codigo.equals(transaccion.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    public void agregarTransaccion(Transaccion transaccion){
        if(verificarTransaccion(transaccion.getCodigo())){
            transacciones.add(transaccion);
        }
    }

    public void eliminarTransaccion(String codigo) {
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getCodigo().equals(codigo)) {
                transacciones.remove(transaccion);
                break;
            }
        }
    }

    public boolean verificarAdministrador(String cedula) {
        for (Administrador administrador : administradores) {
            if (cedula.equals(administrador.getCedula())) {
                return false;
            }
        }
        return true;
    }

    public void agregarAdministrador(Administrador administrador){
        if(verificarAdministrador(administrador.getCedula())){
            administradores.add(administrador);
        }
    }

    public void eliminarAdministrador(String cedula) {
        for (Administrador administrador : administradores) {
            if (administrador.getCedula().equals(cedula)) {
                administradores.remove(administrador);
                break;
            }
        }
    }

    public boolean verificarVenta(String codigo) {
        for (VentaVehiculo venta : ventas) {
            if (codigo.equals(venta.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    public void agregarVenta(VentaVehiculo venta){
        if(verificarVenta(venta.getCodigo())){
            ventas.add(venta);
        }
    }

    public void eliminarVenta(String codigo) {
        for (VentaVehiculo venta : ventas) {
            if (venta.getCodigo().equals(codigo)) {
                ventas.remove(venta);
                break;
            }
        }
    }

    public boolean verificarCompra(String codigo) {
        for (CompraVehiculo compra : compras) {
            if (codigo.equals(compra.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    public void agregarCompra(CompraVehiculo compraVehiculo){
        if(verificarCompra(compraVehiculo.getCodigo())){
            compras.add(compraVehiculo);
        }
    }

    public void eliminarCompra(String codigo) {
        for (CompraVehiculo compra : compras) {
            if (compra.getCodigo().equals(codigo)) {
                compras.remove(compra);
                break;
            }
        }
    }

    public boolean verificarAlquiler(String codigo) {
        for (AlquilerVehiculo Alquiler : alquilerVehiculos) {
            if (codigo.equals(Alquiler.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    public void agregarAlquiler(AlquilerVehiculo Alquiler){
        if(verificarAlquiler(Alquiler.getCodigo())){
            alquilerVehiculos.add(Alquiler);
        }
    }

    public void eliminarAlquiler(String codigo) {
        for (AlquilerVehiculo Alquiler : alquilerVehiculos) {
            if (Alquiler.getCodigo().equals(codigo)) {
                alquilerVehiculos.remove(Alquiler);
                break;
            }
        }
    }

    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setNombre(actualizado.getNombre());
                cliente.setApellidos(actualizado.getApellidos());
                cliente.setEdad(actualizado.getEdad());
                cliente.setCedula(actualizado.getCedula());
                cliente.setCorreo(actualizado.getCorreo());
                cliente.setContraseñaCorrreo(actualizado.getContraseñaCorrreo());
                cliente.setRespuestaVerificacion(actualizado.getRespuestaVerificacion());
                
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarEmpleado(String cedula, Empleado actualizado) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                empleado.setNombre(actualizado.getNombre());
                empleado.setApellidos(actualizado.getApellidos());
                empleado.setEdad(actualizado.getEdad());
                empleado.setCedula(actualizado.getCedula());
                empleado.setCorreo(actualizado.getCorreo());
                empleado.setContraseñaCorrreo(actualizado.getContraseñaCorrreo());
                empleado.setRespuestaVerificacion(actualizado.getRespuestaVerificacion());
                empleado.setActivo(actualizado.getActivo());
                
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    
    public boolean actualizarAdministrador(String cedula, Administrador actualizado) {
        boolean centinela = false;
        for (Administrador administrador : administradores) {
            if (administrador.getCedula().equals(cedula)) {
                administrador.setNombre(actualizado.getNombre());
                administrador.setApellidos(actualizado.getApellidos());
                administrador.setEdad(actualizado.getEdad());
                administrador.setCedula(actualizado.getCedula());
                administrador.setCorreo(actualizado.getCorreo());
                administrador.setContraseñaCorrreo(actualizado.getContraseñaCorrreo());
                administrador.setRespuestaVerificacion(actualizado.getRespuestaVerificacion());
                
                
                centinela = true;
                break;
            }
        }
        return centinela;
    }


    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", administradores=" + administradores + ", transacciones=" + transacciones
                + ", ventas=" + ventas + ", compras=" + compras + ", alquilerVehiculos=" + alquilerVehiculos + "]";
    }
}
