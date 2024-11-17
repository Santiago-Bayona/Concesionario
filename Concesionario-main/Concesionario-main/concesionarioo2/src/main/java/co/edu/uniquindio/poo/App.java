package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Persona.PreguntaSeguridad;

public class App {
    public static void main(String[] args) {
        
        Empresa UQ = new Empresa("Concensionario UQ");

        Administrador administrador1 = new Administrador("jose", "gonzalez", "JoseG@gmail.com", "josesito123", "Chocolate", 23, "10248", PreguntaSeguridad.Cual_es_su_sabor_favoorito_de_heLado);
        
        //Empleado empleado1 = new Empleado( "Juan", "Pérez","juan.perez@example.com", "contraseñaSegura123", "respuestaSecreta", 30,"123456789", PreguntaSeguridad.Cual_es_el_nombre_de_su_mascota,true );
        
        UQ.agregarAdministrador(administrador1);
        
        System.out.println(UQ);


    
    
    
    
    }
}
