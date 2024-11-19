package co.edu.uniquindio.poo;
import co.edu.uniquindio.poo.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    Empresa empresa;

    @BeforeEach
    void setUp() {
        empresa = new Empresa("TechCorp");
    }

    @Test
    void testAgregarAdministrador() {
        Administrador administrador = new Administrador("Alice", "Smith", "alice.smith@example.com", "password",
                "green", 40, "789123", null);
        empresa.agregarAdministrador(administrador);
        assertTrue(empresa.getAdministradores().contains(administrador));
    }

    @Test
    void testEliminarAdministrador() {
        Administrador administrador = new Administrador("Alice", "Smith", "alice.smith@example.com", "password",
                "green", 40, "789123", null);
        empresa.agregarAdministrador(administrador);
        empresa.eliminarAdministrador("789123");
        assertFalse(empresa.getAdministradores().contains(administrador));
    }

    @Test
    void testVerificarAdministrador() {
        Administrador administrador = new Administrador("Alice", "Smith", "alice.smith@example.com", "password",
                "green", 40, "789123", null);
        empresa.agregarAdministrador(administrador);
        assertFalse(empresa.verificarAdministrador("789123"));
        assertTrue(empresa.verificarAdministrador("456789"));
    }

    @Test
    void testAgregarTransaccion() {
        Transaccion transaccion1 = new Transaccion( "1231", LocalDate.of(2023,5,15),10002,true, null,null,null,null,null);

        empresa.agregarTransaccion(transaccion1);
        assertTrue(empresa.getTransacciones().contains(transaccion1));
    }

    @Test
    void testEliminarTransaccion() {
        Transaccion transaccion1 = new Transaccion( "1231", LocalDate.of(2023,5,15),10002,true, null,null,null,null,null);

        empresa.agregarTransaccion(transaccion1);
        empresa.eliminarTransaccion("1231");
        assertFalse(empresa.getTransacciones().contains(transaccion1));
    }

    @Test
    void testVerificarTransaccion() {
        Transaccion transaccion1 = new Transaccion( "1231", LocalDate.of(2023,5,15),10002,true, null,null,null,null,null);

        empresa.agregarTransaccion(transaccion1);
        assertFalse(empresa.verificarTransaccion("1231"));
        assertTrue(empresa.verificarTransaccion("456789"));
    }

    @Test
    void testAgregarVenta() {
        VentaVehiculo venta1 = new VentaVehiculo("1313",20000,null,null,null,null,null);

        empresa.agregarVenta(venta1);
        assertTrue(empresa.getVentas().contains(venta1));
    }

    @Test
    void testEliminarVenta() {
        VentaVehiculo venta1 = new VentaVehiculo("1313",20000,null,null,null,null,null);

        empresa.agregarVenta(venta1);
        empresa.eliminarVenta("1313");
        assertFalse(empresa.getVentas().contains(venta1));
    }

    @Test
    void testVerificarVenta() {
        VentaVehiculo venta1 = new VentaVehiculo("1313",20000,null,null,null,null,null);

        empresa.agregarVenta(venta1);
        assertFalse(empresa.verificarVenta("1313"));
        assertTrue(empresa.verificarVenta("V002"));
    }

    @Test
    void testAgregarCompra() {
        CompraVehiculo compra1 = new CompraVehiculo("2321",22121,true,null,null,null,null,null);

        empresa.agregarCompra(compra1);
        assertTrue(empresa.getCompras().contains(compra1));
    }

    @Test
    void testEliminarCompra() {
        CompraVehiculo compra1 = new CompraVehiculo("2321",22121,true,null,null,null,null,null);

        empresa.agregarCompra(compra1);
        empresa.eliminarCompra("2321");
        assertFalse(empresa.getCompras().contains(compra1));
    }

    @Test
    void testVerificarCompra() {
        CompraVehiculo compra1 = new CompraVehiculo("2321",22121,true,null,null,null,null,null);

        empresa.agregarCompra(compra1);
        assertFalse(empresa.verificarCompra("2321"));
        assertTrue(empresa.verificarCompra("C002"));
    }

    @Test
    void testAgregarAlquiler() {
        AlquilerVehiculo alquiler1 = new AlquilerVehiculo( "1231",32 ,10002,null,null,null,null,null);

        empresa.agregarAlquiler(alquiler1);
        assertTrue(empresa.getAlquilerVehiculos().contains(alquiler1));
    }

    @Test
    void testEliminarAlquiler() {
        AlquilerVehiculo alquiler1 = new AlquilerVehiculo( "1231",32 ,10002,null,null,null,null,null);

        empresa.agregarAlquiler(alquiler1);
        empresa.eliminarAlquiler("A001");
        assertFalse(empresa.getAlquilerVehiculos().contains(alquiler1));
    }

    @Test
    void testVerificarAlquiler() {
        AlquilerVehiculo alquiler1 = new AlquilerVehiculo( "1231",32 ,10002,null,null,null,null,null);

        empresa.agregarAlquiler(alquiler1);
        assertFalse(empresa.verificarAlquiler("1231"));
        assertTrue(empresa.verificarAlquiler("A002"));
    }

    @Test
    void testToString() {
        assertTrue(empresa.toString().contains("TechCorp"));
    }
}
