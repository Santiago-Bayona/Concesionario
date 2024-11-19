package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empleado extends Persona{
    private boolean Activo;
    public Collection<VehiculoElectrico> vehiculoElectricos;
    public Collection<VehiculoGasolinaDiesel> VehiculoGasolinaDiesels;
    public Collection<VehiculoHibrido> vehiculoHibridos;
    public Collection<Cliente> clientes;


    
    /**
 * Constructor de la clase Empleado
 * @param nombre Nombre del empleado
 * @param apellidos Apellidos del empleado
 * @param correo Correo electrónico del empleado
 * @param contraseñaCorrreo Contraseña del correo electrónico
 * @param respuestaVerificacion Respuesta de verificación de seguridad
 * @param edad Edad del empleado
 * @param cedula Cédula del empleado
 * @param preguntaSeguridad Objeto PreguntaSeguridad asociado
 * @param activo Estado activo/inactivo del empleado
 */
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

    /**
 * Método para obtener el estado activo del empleado
 * @return true si está activo, false en caso contrario
 */

    public boolean getActivo() {
        return Activo;
    }

    /**
 * Método para establecer el estado activo del empleado
 * @param activo Estado activo/inactivo del empleado
 */

    public void setActivo(boolean activo) {
        Activo = activo;
    }

    /**
 * Método para obtener la colección de clientes asociados al empleado
 * @return Colección de clientes
 */

    public Collection<Cliente> getCliente() {
        return clientes;
    }



/**
 * Método para establecer la colección de clientes asociados al empleado
 * @param clientes Colección de clientes
 */

    public void setCliente(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

/**
 * Método para obtener la colección de vehículos eléctricos
 * @return Colección de vehículos eléctricos
 */

    public Collection<VehiculoElectrico> getVehiculoElectricos() {
        return vehiculoElectricos;
    }



/**
 * Método para establecer la colección de vehículos eléctricos
 * @param vehiculoElectricos Colección de vehículos eléctricos
 */

    public void setVehiculoElectricos(Collection<VehiculoElectrico> vehiculoElectricos) {
        this.vehiculoElectricos = vehiculoElectricos;
    }



/**
 * Método para obtener la colección de vehículos a gasolina o diésel
 * @return Colección de vehículos a gasolina o diésel
 */

    public Collection<VehiculoGasolinaDiesel> getVehiculoGasolinaDiesels() {
        return VehiculoGasolinaDiesels;
    }



/**
 * Método para establecer la colección de vehículos a gasolina o diésel
 * @param VehiculoGasolinaDiesels Colección de vehículos a gasolina o diésel
 */

    public void setVehiculoGasolinaDiesels(Collection<VehiculoGasolinaDiesel> VehiculoGasolinaDiesels) {
        this.VehiculoGasolinaDiesels = VehiculoGasolinaDiesels;
    }



/**
 * Método para obtener la colección de vehículos híbridos
 * @return Colección de vehículos híbridos
 */

    public Collection<VehiculoHibrido> getVehiculoHibridos() {
        return vehiculoHibridos;
    }



/**
 * Método para establecer la colección de vehículos híbridos
 * @param vehiculoHibridos Colección de vehículos híbridos
 */

    public void setVehiculoHibridos(Collection<VehiculoHibrido> vehiculoHibridos) {
        this.vehiculoHibridos = vehiculoHibridos;
    }


    /**
 * Método para verificar si un vehículo eléctrico existe
 * @param placa Placa del vehículo eléctrico
 * @return false si el vehículo ya existe, true en caso contrario
 */

    public boolean verificarVehiculoElectrico(String placa) {
        for (VehiculoElectrico vehiculoElectrico : vehiculoElectricos) {
            if (placa.equals(vehiculoElectrico.getPlaca())) {
                return false;
            }
        }
        return true;
    }

    /**
 * Método para agregar un vehículo eléctrico
 * @param vehiculoElectrico Objeto VehiculoElectrico a agregar
 */

    public void agregarVehiculoElectrico(VehiculoElectrico vehiculoElectrico){
        if(verificarVehiculoElectrico(vehiculoElectrico.getPlaca())){
            vehiculoElectricos.add(vehiculoElectrico);
        }
    }

    /**
 * Método para eliminar un vehículo eléctrico
 * @param placa Placa del vehículo eléctrico a eliminar
 */

    public void eliminarVehiculoElectrico(String placa) {
        for (VehiculoElectrico vehiculoElectrico : vehiculoElectricos) {
            if (vehiculoElectrico.getPlaca().equals(placa)) {
                vehiculoElectricos.remove(vehiculoElectrico);
                break;
            }
        }
    }

    
    
 /**
 * Método para verificar si un vehículo a gasolina o diésel existe
 * @param placa Placa del vehículo a gasolina o diésel
 * @return false si el vehículo ya existe, true en caso contrario
 */

    public boolean verificarVehiculoGasolinaDiesel(String placa) {
        for (VehiculoGasolinaDiesel VehiculoGasolinaDiesel : VehiculoGasolinaDiesels) {
            if (placa.equals(VehiculoGasolinaDiesel.getPlaca())) {
                return false;
            }
        }
        return true;
    }

/**
 * Método para agregar un vehículo a gasolina o diésel
 * @param VehiculoGasolinaDiesel Objeto VehiculoGasolinaDiesel a agregar
 */

    public void agregarVehiculoGasolinaDiesel(VehiculoGasolinaDiesel VehiculoGasolinaDiesel){
        if(verificarVehiculoGasolinaDiesel(VehiculoGasolinaDiesel.getPlaca())){
            VehiculoGasolinaDiesels.add(VehiculoGasolinaDiesel);
        }
    }

    /**
 * Método para eliminar un vehículo a gasolina o diésel
 * @param placa Placa del vehículo a eliminar
 */

    public void eliminarVehiculoGasolinaDiesel(String placa) {
        for (VehiculoGasolinaDiesel VehiculoGasolinaDiesel : VehiculoGasolinaDiesels) {
            if (VehiculoGasolinaDiesel.getPlaca().equals(placa)) {
                VehiculoGasolinaDiesels.remove(VehiculoGasolinaDiesel);
                break;
            }
        }
    }

    /**
 * Método para verificar si un vehículo híbrido existe
 * @param placa Placa del vehículo híbrido
 * @return false si el vehículo ya existe, true en caso contrario
 */

    public boolean verificarVehiculoHibrido(String placa) {
        for (VehiculoHibrido vehiculoHibrido : vehiculoHibridos) {
            if (placa.equals(vehiculoHibrido.getPlaca())) {
                return false;
            }
        }
        return true;
    }

    /**
 * Método para agregar un vehículo híbrido
 * @param vehiculoHibrido Objeto VehiculoHibrido a agregar
 */

    public void agregarVehiculoHibrido(VehiculoHibrido vehiculoHibrido){
        if(verificarVehiculoHibrido(vehiculoHibrido.getPlaca())){
            vehiculoHibridos.add(vehiculoHibrido);
        }
    }

    /**
 * Método para eliminar un vehículo híbrido
 * @param placa Placa del vehículo híbrido a eliminar
 */

    public void eliminarVehiculoHibrido(String placa) {
        for (VehiculoHibrido vehiculoHibrido : vehiculoHibridos) {
            if (vehiculoHibrido.getPlaca().equals(placa)) {
                vehiculoHibridos.remove(vehiculoHibrido);
                break;
            }
        }
    }

    
    /**
 * Método para verificar si un cliente existe
 * @param cedula Cédula del cliente
 * @return false si el cliente ya existe, true en caso contrario
 */

    public boolean verificarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cedula.equals(cliente.getCedula())) {
                return false;
            }
        }
        return true;
    }

   
/**
 * Método para agregar un cliente al empleado
 * @param cliente Objeto Cliente a agregar
 */
    public void agregarCliente(Cliente cliente){
        if(verificarCliente(cliente.getCedula())){
            clientes.add(cliente);
        }
    }

    /**
 * Método para eliminar un cliente asociado al empleado
 * @param cedula Cédula del cliente a eliminar
 */

    public void eliminarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                clientes.remove(cliente);
                break;
            }
        }
    }

    /**
 * Método para obtener una representación textual del empleado
 * @return Representación textual del empleado
 */

    @Override
    public String toString() {
        return "Empleado [Activo=" + Activo + "]";
    }  
}
