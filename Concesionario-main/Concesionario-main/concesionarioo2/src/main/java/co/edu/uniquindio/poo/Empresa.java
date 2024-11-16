package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {
    public String nombre;
    public Collection<Administrador>administradores;
    public Collection<Transaccion>transacciones;
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.administradores = new LinkedList<>();
        this.transacciones = new LinkedList<>();
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
    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", administradores=" + administradores + ", transacciones=" + transacciones
                + "]";
    }
}