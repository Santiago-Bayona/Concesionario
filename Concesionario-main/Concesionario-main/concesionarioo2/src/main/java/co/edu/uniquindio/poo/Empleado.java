package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empleado extends Persona{
    private boolean Activo;
    public Collection<VehiculoElectrico> vehiculoElectricos;
    public Collection<VehiculoGasolinaDiesel> VehiculoGasolinaDiesels;
    public Collection<VehiculoHibrido> vehiculoHibridos;
    public Collection<Cliente> clientes;


    

    public Empleado(String nombre, String apellidos, String correo, String contraseñaCorrreo,
            String respuestaVerificacion, int edad, String cedula,
            PreguntaSeguridad preguntaSeguridad, boolean activo) {
        super(nombre, apellidos, correo, contraseñaCorrreo, respuestaVerificacion, edad, cedula, preguntaSeguridad);
        Activo = activo;
        this.vehiculoElectricos = new LinkedList<>();
        this.VehiculoGasolinaDiesels = new LinkedList<>();
        this.vehiculoHibridos =new LinkedList<>();
        this.clientes =new LinkedList<>();
    }

    public boolean getActivo() {
        return Activo;
    }

    public void setActivo(boolean activo) {
        Activo = activo;
    }

    public Collection<Cliente> getCliente() {
        return clientes;
    }





    public void setCliente(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }



    public Collection<VehiculoElectrico> getVehiculoElectricos() {
        return vehiculoElectricos;
    }





    public void setVehiculoElectricos(Collection<VehiculoElectrico> vehiculoElectricos) {
        this.vehiculoElectricos = vehiculoElectricos;
    }





    public Collection<VehiculoGasolinaDiesel> getVehiculoGasolinaDiesels() {
        return VehiculoGasolinaDiesels;
    }





    public void setVehiculoGasolinaDiesels(Collection<VehiculoGasolinaDiesel> VehiculoGasolinaDiesels) {
        this.VehiculoGasolinaDiesels = VehiculoGasolinaDiesels;
    }





    public Collection<VehiculoHibrido> getVehiculoHibridos() {
        return vehiculoHibridos;
    }





    public void setVehiculoHibridos(Collection<VehiculoHibrido> vehiculoHibridos) {
        this.vehiculoHibridos = vehiculoHibridos;
    }

    public boolean verificarVehiculoElectrico(String placa) {
        for (VehiculoElectrico vehiculoElectrico : vehiculoElectricos) {
            if (placa.equals(vehiculoElectrico.getPlaca())) {
                return false;
            }
        }
        return true;
    }

    public void agregarVehiculoElectrico(VehiculoElectrico vehiculoElectrico){
        if(verificarVehiculoElectrico(vehiculoElectrico.getPlaca())){
            vehiculoElectricos.add(vehiculoElectrico);
        }
    }

    public void eliminarVehiculoElectrico(String placa) {
        for (VehiculoElectrico vehiculoElectrico : vehiculoElectricos) {
            if (vehiculoElectrico.getPlaca().equals(placa)) {
                vehiculoElectricos.remove(vehiculoElectrico);
                break;
            }
        }
    }

    public boolean verificarVehiculoGasolinaDiesel(String placa) {
        for (VehiculoGasolinaDiesel VehiculoGasolinaDiesel : VehiculoGasolinaDiesels) {
            if (placa.equals(VehiculoGasolinaDiesel.getPlaca())) {
                return false;
            }
        }
        return true;
    }

    public void agregarVehiculoGasolinaDiesel(VehiculoGasolinaDiesel VehiculoGasolinaDiesel){
        if(verificarVehiculoGasolinaDiesel(VehiculoGasolinaDiesel.getPlaca())){
            VehiculoGasolinaDiesels.add(VehiculoGasolinaDiesel);
        }
    }

    public void eliminarVehiculoGasolinaDiesel(String placa) {
        for (VehiculoGasolinaDiesel VehiculoGasolinaDiesel : VehiculoGasolinaDiesels) {
            if (VehiculoGasolinaDiesel.getPlaca().equals(placa)) {
                VehiculoGasolinaDiesels.remove(VehiculoGasolinaDiesel);
                break;
            }
        }
    }

    public boolean verificarVehiculoHibrido(String placa) {
        for (VehiculoHibrido vehiculoHibrido : vehiculoHibridos) {
            if (placa.equals(vehiculoHibrido.getPlaca())) {
                return false;
            }
        }
        return true;
    }

    public void agregarVehiculoHibrido(VehiculoHibrido vehiculoHibrido){
        if(verificarVehiculoHibrido(vehiculoHibrido.getPlaca())){
            vehiculoHibridos.add(vehiculoHibrido);
        }
    }

    public void eliminarVehiculoHibrido(String placa) {
        for (VehiculoHibrido vehiculoHibrido : vehiculoHibridos) {
            if (vehiculoHibrido.getPlaca().equals(placa)) {
                vehiculoHibridos.remove(vehiculoHibrido);
                break;
            }
        }
    }

    public boolean verificarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cedula.equals(cliente.getCedula())) {
                return false;
            }
        }
        return true;
    }

    public void agregarCliente(Cliente cliente){
        if(verificarCliente(cliente.getCedula())){
            clientes.add(cliente);
        }
    }

    public void eliminarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                clientes.remove(cliente);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Empleado [Activo=" + Activo + "]";
    }  
}
