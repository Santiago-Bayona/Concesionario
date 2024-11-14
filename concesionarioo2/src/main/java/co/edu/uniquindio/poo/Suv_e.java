package co.edu.uniquindio.poo;

public class Suv_e extends Sedan_e {

    private boolean todoterreno;

    public Suv_e(String codigo, String marca, boolean estado, String modelo, int cambios, int velocidadmaxima, int cilindraje,
            String autonomiacargacompleta, int tiempopromediocarga, int numeroPasajeros, int numeroPuertas,
            double capacidadMaletero, boolean aireAcondionado, boolean camaraReversa, boolean velocidadCrucero,
            int numeroBolsasAire, boolean sensoresColision, boolean sensoresTraficoCruzado, boolean asistenciaPermanenciaCarril,    
            boolean aBS, boolean todoterreno) {
                
            super(codigo, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, autonomiacargacompleta, tiempopromediocarga,
                        numeroPasajeros, numeroPuertas, capacidadMaletero, aireAcondionado, camaraReversa, velocidadCrucero,
                        numeroBolsasAire, sensoresColision, sensoresTraficoCruzado, asistenciaPermanenciaCarril, aBS);
            this.todoterreno = todoterreno;
    }

    public boolean isTodoterreno() {
        return todoterreno;
    }

    public void setTodoterreno(boolean todoterreno) {
        this.todoterreno = todoterreno;
    }

    @Override
    public String toString() {
        return "Suv_e [todoterreno=" + todoterreno + "]";
    }

    

}
