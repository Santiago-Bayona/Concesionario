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
  
    
 /**
 * Constructor de la clase Empresa
 * @param nombre Nombre de la empresa
 */
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.administradores = new LinkedList<>();
        this.transacciones = new LinkedList<>();
        this.ventas = new LinkedList<>();
        this.alquilerVehiculos = new LinkedList<>();
        this.compras = new LinkedList<>();
    }
    
    
    
    /**
 * Método para obtener el nombre de la empresa
 * @return nombre de la empresa
 */
    public String getNombre() {
        return nombre;
    }


  /**
 * Método para establecer el nombre de la empresa
 * @param nombre Nombre de la empresa
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



/**
 * Método para obtener la colección de administradores
 * @return Colección de administradores
 */

    public Collection<Administrador> getAdministradores() {
        return administradores;
    }


/**
 * Método para establecer la colección de administradores
 * @param administradores Colección de administradores
 */

    public void setAdministradores(Collection<Administrador> administradores) {
        this.administradores = administradores;
    }


/**
 * Método para obtener la colección de transacciones
 * @return Colección de transacciones
 */

    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }


/**
 * Método para establecer la colección de transacciones
 * @param transacciones Colección de transacciones
 */

    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }


/**
 * Método para obtener la colección de ventas de vehículos
 * @return Colección de ventas de vehículos
 */

    public Collection<VentaVehiculo> getVentas() {
        return ventas;
    }


/**
 * Método para establecer la colección de ventas de vehículos
 * @param ventas Colección de ventas de vehículos
 */

    public void setVentas(Collection<VentaVehiculo> ventas) {
        this.ventas = ventas;
    }


/**
 * Método para obtener la colección de compras de vehículos
 * @return Colección de compras de vehículos
 */

    public Collection<CompraVehiculo> getCompras() {
        return compras;
    }


/**
 * Método para establecer la colección de compras de vehículos
 * @param compras Colección de compras de vehículos
 */

    public void setCompras(Collection<CompraVehiculo> compras) {
        this.compras = compras;
    }




    public Collection<AlquilerVehiculo> getAlquilerVehiculos() {
        return alquilerVehiculos;
    }




    public void setAlquilerVehiculos(Collection<AlquilerVehiculo> alquilerVehiculos) {
        this.alquilerVehiculos = alquilerVehiculos;
    }



    /**
 * Método para verificar si una transacción existe por su código
 * @param codigo Código de la transacción
 * @return false si la transacción existe, true en caso contrario
 */
    public boolean verificarTransaccion(String codigo) {
        for (Transaccion transaccion : transacciones) {
            if (codigo.equals(transaccion.getCodigo())) {
                return false;
            }
        }
        return true;
    }


 /**
 * Método para agregar una transacción
 * @param transaccion Objeto Transacción a agregar
 */

    public void agregarTransaccion(Transaccion transaccion){
        if(verificarTransaccion(transaccion.getCodigo())){
            transacciones.add(transaccion);
        }
    }

    /**
 * Método para eliminar una transacción
 * @param codigo Código de la transacción a eliminar
 */

    public void eliminarTransaccion(String codigo) {
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getCodigo().equals(codigo)) {
                transacciones.remove(transaccion);
                break;
            }
        }
    }

    /**
 * Método para verificar si un administrador existe
 * @param cedula Cédula del administrador
 * @return false si el administrador existe, true en caso contrario
 */

    public boolean verificarAdministrador(String cedula) {
        for (Administrador administrador : administradores) {
            if (cedula.equals(administrador.getCedula())) {
                return false;
            }
        }
        return true;
    }

    /**
 * Método para eliminar un administrador de la empresa
 * @param cedula Cédula del administrador a eliminar
 */

    public void agregarAdministrador(Administrador administrador){
        if(verificarAdministrador(administrador.getCedula())){
            administradores.add(administrador);
        }
    }

    /**
 * Método para eliminar un administrador de la empresa
 * @param cedula Cédula del administrador a eliminar
 */

    public void eliminarAdministrador(String cedula) {
        for (Administrador administrador : administradores) {
            if (administrador.getCedula().equals(cedula)) {
                administradores.remove(administrador);
                break;
            }
        }
    }

    /**
 * Método para agregar una venta a la empresa
 * @param venta Objeto VentaVehiculo a agregar
 */

    public boolean verificarVenta(String codigo) {
        for (VentaVehiculo venta : ventas) {
            if (codigo.equals(venta.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    
/**
 * Método para eliminar una venta de la empresa
 * @param codigo Código de la venta a eliminar
 */

    public void agregarVenta(VentaVehiculo venta){
        if(verificarVenta(venta.getCodigo())){
            ventas.add(venta);
        }
    }

    /**
 * Método para verificar si una compra existe
 * @param codigo Código de la compra
 * @return false si la compra existe, true en caso contrario
 */

    public void eliminarVenta(String codigo) {
        for (VentaVehiculo venta : ventas) {
            if (venta.getCodigo().equals(codigo)) {
                ventas.remove(venta);
                break;
            }
        }
    }


    /**
 * Método para verificar si una compra existe
 * @param codigo Código de la compra
 * @return false si la compra existe, true en caso contrario
 */

    public boolean verificarCompra(String codigo) {
        for (CompraVehiculo compra : compras) {
            if (codigo.equals(compra.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    
/**
 * Método para agregar una compra a la empresa
 * @param compraVehiculo Objeto CompraVehiculo a agregar
 */

    public void agregarCompra(CompraVehiculo compraVehiculo){
        if(verificarCompra(compraVehiculo.getCodigo())){
            compras.add(compraVehiculo);
        }
    }

    /**
 * Método para eliminar una compra de la empresa
 * @param codigo Código de la compra a eliminar
 */

    public void eliminarCompra(String codigo) {
        for (CompraVehiculo compra : compras) {
            if (compra.getCodigo().equals(codigo)) {
                compras.remove(compra);
                break;
            }
        }
    }

    /**
 * Método para verificar si un alquiler existe
 * @param codigo Código del alquiler
 * @return false si el alquiler existe, true en caso contrario
 */

    public boolean verificarAlquiler(String codigo) {
        for (AlquilerVehiculo Alquiler : alquilerVehiculos) {
            if (codigo.equals(Alquiler.getCodigo())) {
                return false;
            }
        }
        return true;
    }


    /**
 * Método para agregar un alquiler a la empresa
 * @param Alquiler Objeto AlquilerVehiculo a agregar
 */

    public void agregarAlquiler(AlquilerVehiculo Alquiler){
        if(verificarAlquiler(Alquiler.getCodigo())){
            alquilerVehiculos.add(Alquiler);
        }
    }

    /**
 * Método para eliminar un alquiler de la empresa
 * @param codigo Código del alquiler a eliminar
 */

    public void eliminarAlquiler(String codigo) {
        for (AlquilerVehiculo Alquiler : alquilerVehiculos) {
            if (Alquiler.getCodigo().equals(codigo)) {
                alquilerVehiculos.remove(Alquiler);
                break;
            }
        }
    }


 /**
 * Método para actualizar los datos de un cliente
 * @param cedula Cédula del cliente a actualizar
 * @param actualizado Objeto Cliente con los datos actualizados
 * @return true si se actualizó exitosamente, false en caso contrario
 */

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

    /**
 * Método para actualizar los datos de un empleado
 * @param cedula Cédula del empleado a actualizar
 * @param actualizado Objeto Empleado con los datos actualizados
 * @return true si se actualizó exitosamente, false en caso contrario
 */

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


    /**
 * Método para actualizar los datos de un administrador
 * @param cedula Cédula del administrador a actualizar
 * @param actualizado Objeto Administrador con los datos actualizados
 * @return true si se actualizó exitosamente, false en caso contrario
 */

    
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


    
/**
 * Método para obtener una representación textual de la empresa
 * @return Representación textual de la empresa
 */


    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", administradores=" + administradores + ", transacciones=" + transacciones
                + ", ventas=" + ventas + ", compras=" + compras + ", alquilerVehiculos=" + alquilerVehiculos + "]";
    }
}
