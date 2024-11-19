package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import co.edu.uniquindio.poo.CamionGasolinaDiesel.TipoCamion;
import co.edu.uniquindio.poo.Persona.PreguntaSeguridad;
import co.edu.uniquindio.poo.Vehiculo.TipoTransmision;
import co.edu.uniquindio.poo.VehiculoGasolinaDiesel.GasolinaDiesel;

public class App {
    public static void main(String[] args) {
        
        Empresa UQ = new Empresa("Concensionario UQ");

        Administrador administrador1 = new Administrador("jose", "gonzalez", "JoseG@gmail.com", "josesito123", "Chocolate", 23, "10248", PreguntaSeguridad.Cual_es_su_sabor_favoorito_de_heLado);
        VentaVehiculo venta1 = new VentaVehiculo("1313",20000,null,null,null,null,null);
        Transaccion transaccion1 = new Transaccion( "1231", LocalDate.of(2023,5,15),10002,true, null,null,null,null,null);
        CompraVehiculo compra1 = new CompraVehiculo("2321",22121,true,null,null,null,null,null);
        AlquilerVehiculo alquiler1 = new AlquilerVehiculo( "1231",32 ,10002,null,null,null,null,null);
        Empleado empleado1 = new Empleado( "Juan", "Pérez","juan.perez@example.com", "contraseñaSegura123", "respuestaSecreta", 30,"123456789", PreguntaSeguridad.Cual_es_el_nombre_de_su_mascota,true );
        Cliente cliente1 = new Cliente( "Pedro", "Lopez","pedro.lopez@example.com", "contraseñaSegura123", "respuestaSecreta", 30,"123456789", PreguntaSeguridad.Cual_es_el_nombre_de_su_mejor_amigo );

        VehiculoGasolinaDiesel CamionGasolinaDiesel1 = new CamionGasolinaDiesel("ABC123", "Toyota", false, "Camioneta", 4, 200, 300, TipoTransmision.MANUAL, GasolinaDiesel.GASOLINA, true, false, true, 1000, 3, TipoCamion.PLATAFORMA);
        VehiculoHibrido DeportivoHibrido1 = new DeportivoHibrido("AVB21","HONDA",false,"2023",32,200,250,TipoTransmision.MANUAL,true,true,4,4,2,300,2); ;
        


        UQ.agregarAdministrador(administrador1);
        UQ.agregarEmpleado(empleado1);
        UQ.agregarCliente(cliente1);
        UQ.agregarTransaccion(transaccion1);
        UQ.agregarAlquiler(alquiler1);
        UQ.agregarCompra(compra1);
        UQ.agregarVenta(venta1);
        UQ.agregarVehiculoGasolinaDiesel(CamionGasolinaDiesel1);
        empleado1.agregarVehiculoHibrido(DeportivoHibrido1);
        System.out.println(UQ);
        System.out.println(empleado1);
        System.out.println(cliente1);
        System.out.println(administrador1);
        System.out.println(CamionGasolinaDiesel1);
        System.out.println(DeportivoHibrido1);
        System.out.println(transaccion1);
        System.out.println(alquiler1);
        System.out.println(compra1);
        System.out.println(venta1);
        empleado1.agregarVehiculoGasolinaDiesel(CamionGasolinaDiesel1);


    
    
    
    
    }
}
