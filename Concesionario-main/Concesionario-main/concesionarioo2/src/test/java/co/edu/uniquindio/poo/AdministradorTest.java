package co.edu.uniquindio.poo;
import co.edu.uniquindio.poo.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class AdministradorTest {

    Administrador administrador;

    @BeforeEach
    void setUp() {
        administrador = new Administrador("Alice", "Smith", "alice.smith@example.com", "password",
                "green", 40, "789123", null);
    }

    @Test
    void testAgregarEmpleado() {
        Empleado empleado = new Empleado("John", "Doe", "john.doe@example.com", "password",
                "blue", 30, "123456", null, true);
        administrador.agregarEmpleado(empleado);
        assertTrue(administrador.getEmpleados().contains(empleado));
    }

    @Test
    void testEliminarEmpleado() {
        Empleado empleado = new Empleado("John", "Doe", "john.doe@example.com", "password",
                "blue", 30, "123456", null, true);
        administrador.agregarEmpleado(empleado);
        administrador.eliminarEmpleado("123456");
        assertFalse(administrador.getEmpleados().contains(empleado));
    }

    @Test
    void testVerificarEmpleado() {
        Empleado empleado = new Empleado("John", "Doe", "john.doe@example.com", "password",
                "blue", 30, "123456", null, true);
        administrador.agregarEmpleado(empleado);
        assertFalse(administrador.verificarEmpleado("123456"));
        assertTrue(administrador.verificarEmpleado("456789"));
    }

    @Test
    void testToString() {
        assertTrue(administrador.toString().contains("Administrador"));
    }
}
