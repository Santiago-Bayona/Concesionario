package co.edu.uniquindio.poo;
import co.edu.uniquindio.poo.VehiculoElectrico;
import co.edu.uniquindio.poo.VehiculoGasolinaDiesel.GasolinaDiesel;
import co.edu.uniquindio.poo.Empleado;
import co.edu.uniquindio.poo.Vehiculo.TipoTransmision;
import co.edu.uniquindio.poo.VehiculoGasolinaDiesel;
import co.edu.uniquindio.poo.CamionGasolinaDiesel.TipoCamion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    Empleado empleado;

    @BeforeEach
    void setUp() {
        empleado = new Empleado("John", "Doe", "john.doe@example.com", "password",
                "blue", 30, "123456", null, true);
    }

    @Test
    void testAgregarVehiculoElectrico() {
        VehiculoElectrico MotoElectrico = new MotoElectrico("DEF456", "Honda", false, "Moto", 2, 100, 500, "100%", 100, TipoTransmision.AUTOMATICA);
        empleado.agregarVehiculoElectrico(MotoElectrico);
        assertTrue(empleado.getVehiculoElectricos().contains(MotoElectrico));
    }

    @Test
    void testEliminarVehiculoElectrico() {
        VehiculoElectrico MotoElectrico = new MotoElectrico("DEF456", "Honda", false, "Moto", 2, 100, 500, "100%", 100, TipoTransmision.AUTOMATICA);

        empleado.agregarVehiculoElectrico(MotoElectrico);
        empleado.eliminarVehiculoElectrico("DEF456");
        assertFalse(empleado.getVehiculoElectricos().contains(MotoElectrico));
    }

    @Test
    void testVerificarVehiculoElectrico() {
        VehiculoElectrico MotoElectrico = new MotoElectrico("DEF456", "Honda", false, "Moto", 2, 100, 500, "100%", 100, TipoTransmision.AUTOMATICA);
        empleado.agregarVehiculoElectrico(MotoElectrico);
        assertFalse(empleado.verificarVehiculoElectrico("DEF456"));
        assertTrue(empleado.verificarVehiculoElectrico("XYZ789"));
    }

    @Test
    void testAgregarVehiculoGasolinaDiesel() {
        VehiculoGasolinaDiesel CamionGasolinaDiesel1 = new CamionGasolinaDiesel("ABC123", "Toyota", false, "Camioneta", 4, 200, 300, TipoTransmision.MANUAL, GasolinaDiesel.GASOLINA, true, false, true, 1000, 3, TipoCamion.VOLQUETE);

        empleado.agregarVehiculoGasolinaDiesel(CamionGasolinaDiesel1);
        assertTrue(empleado.getVehiculoGasolinaDiesels().contains(CamionGasolinaDiesel1));
    }

    @Test
    void testEliminarVehiculoGasolinaDiesel() {
        VehiculoGasolinaDiesel CamionGasolinaDiesel1 = new CamionGasolinaDiesel("ABC123", "Toyota", false, "Camioneta", 4, 200, 300, TipoTransmision.MANUAL, GasolinaDiesel.GASOLINA, true, false, true, 1000, 3, TipoCamion.PLATAFORMA);

        empleado.agregarVehiculoGasolinaDiesel(CamionGasolinaDiesel1);
        empleado.eliminarVehiculoGasolinaDiesel("ABC123");
        assertFalse(empleado.getVehiculoGasolinaDiesels().contains(CamionGasolinaDiesel1));
    }

    @Test
    void testVerificarVehiculoGasolinaDiesel() {
        VehiculoGasolinaDiesel CamionGasolinaDiesel1 = new CamionGasolinaDiesel("ABC123", "Toyota", false, "Camioneta", 4, 200, 300, TipoTransmision.MANUAL, GasolinaDiesel.GASOLINA, true, false, true, 1000, 3, TipoCamion.PLATAFORMA);

        empleado.agregarVehiculoGasolinaDiesel(CamionGasolinaDiesel1);
        assertFalse(empleado.verificarVehiculoGasolinaDiesel("ABC123"));
        assertTrue(empleado.verificarVehiculoGasolinaDiesel("XYZ789"));
    }

    @Test
    void testAgregarVehiculoHibrido() {
        VehiculoHibrido DeportivoHibrido1 = new DeportivoHibrido("AVB21","HONDA",false,"2023",32,200,250,TipoTransmision.MANUAL,true,true,4,4,2,300,2); ;

        empleado.agregarVehiculoHibrido(DeportivoHibrido1);
        assertTrue(empleado.getVehiculoHibridos().contains(DeportivoHibrido1));
    }

    @Test
    void testEliminarVehiculoHibrido() {
        VehiculoHibrido DeportivoHibrido1 = new DeportivoHibrido("AVB21","HONDA",false,"2023",32,200,250,TipoTransmision.MANUAL,true,true,4,4,2,300,2); ;

        empleado.agregarVehiculoHibrido(DeportivoHibrido1);
        empleado.eliminarVehiculoHibrido("AVB21");
        assertFalse(empleado.getVehiculoHibridos().contains(DeportivoHibrido1));
    }

    @Test
    void testVerificarVehiculoHibrido() {
        VehiculoHibrido DeportivoHibrido1 = new DeportivoHibrido("AVB21","HONDA",false,"2023",32,200,250,TipoTransmision.MANUAL,true,true,4,4,2,300,2); ;

        empleado.agregarVehiculoHibrido(DeportivoHibrido1);
        assertFalse(empleado.verificarVehiculoHibrido("AVB21"));
        assertTrue(empleado.verificarVehiculoHibrido("XYZ789"));
    }

    @Test
    void testToString() {
        assertEquals("Empleado [Activo=true]", empleado.toString());
    }
}
