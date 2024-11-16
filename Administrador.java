package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Administrador extends Persona {

    public Collection<Empleado> empleados;
    public Collection<VehiculoElectrico> vehiculoElectricos;
    public Collection<VehiculoGD> vehiculoGDs;
    public Collection<VehiculoHibrido> vehiculoHibridos;
    public Collection<Cliente> clientes;

    
    

    public Administrador(String nombre, String apellidos, String correo, String contraseñaCorrreo,
            String respuestaVerificacion, int edad, String cedula,
            co.edu.uniquindio.poo.Persona.PreguntaSeguridad preguntaSeguridad) {
        super(nombre, apellidos, correo, contraseñaCorrreo, respuestaVerificacion, edad, cedula, preguntaSeguridad);
        this.empleados = new LinkedList<>();
        this.vehiculoElectricos = new LinkedList<>();
        this.vehiculoGDs = new LinkedList<>();
        this.vehiculoHibridos =new LinkedList<>();
        this.clientes =new LinkedList<>();
    }

    
    
    
    
    public Collection<Empleado> getEmpleados() {
        return empleados;
    }





    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
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





    public Collection<VehiculoGD> getVehiculoGDs() {
        return vehiculoGDs;
    }





    public void setVehiculoGDs(Collection<VehiculoGD> vehiculoGDs) {
        this.vehiculoGDs = vehiculoGDs;
    }





    public Collection<VehiculoHibrido> getVehiculoHibridos() {
        return vehiculoHibridos;
    }





    public void setVehiculoHibridos(Collection<VehiculoHibrido> vehiculoHibridos) {
        this.vehiculoHibridos = vehiculoHibridos;
    }





    public boolean verificarEmpleado(String Cedula) {
        for (Empleado empleado : empleados) {
            if (Cedula.equals(empleado.getCedula())) {
                return false;
            }
        }
        return true;
    }

    public void agregarEmpleado(Empleado empleado){
        if(verificarEmpleado(empleado.getCedula())){
            empleados.add(empleado);
        }
    }

    public void eliminarEmpleado(String cedula) {
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                empleados.remove(empleado);
                break;
            }
        }
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

    public boolean verificarVehiculoGD(String placa) {
        for (VehiculoGD vehiculoGD : vehiculoGDs) {
            if (placa.equals(vehiculoGD.getPlaca())) {
                return false;
            }
        }
        return true;
    }

    public void agregarVehiculoGD(VehiculoGD vehiculoGD){
        if(verificarVehiculoGD(vehiculoGD.getPlaca())){
            vehiculoGDs.add(vehiculoGD);
        }
    }

    public void eliminarVehiculoGD(String placa) {
        for (VehiculoGD vehiculoGD : vehiculoGDs) {
            if (vehiculoGD.getPlaca().equals(placa)) {
                vehiculoGDs.remove(vehiculoGD);
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
        return "Administrador ["+ super.toString()+ "]";
    }
}
