package co.edu.uniquindio.poo;

public class Vehiculo_electrico extends Vehiculo {
   private String autonomiacargacompleta;
   private int tiempopromediocarga;

    public Vehiculo_electrico(String codigo,String marca,boolean estado,String modelo,int cambios,int velocidadmaxima,int cilindraje,String autonomiacargacompleta,int tiempopromediocarga){
       super(codigo,marca,estado,modelo,cambios,velocidadmaxima, cilindraje);
       this.autonomiacargacompleta=autonomiacargacompleta;
       this.tiempopromediocarga=tiempopromediocarga;
        


    }

    public String getAutonomiacargacompleta() {
        return autonomiacargacompleta;
    }

    public void setAutonomiacargacompleta(String autonomiacargacompleta) {
        this.autonomiacargacompleta = autonomiacargacompleta;
    }

    public int getTiempopromediocarga() {
        return tiempopromediocarga;
    }

    public void setTiempopromediocarga(int tiempopromediocarga) {
        this.tiempopromediocarga = tiempopromediocarga;
    }

    @Override
    public String toString() {
        return "Vehiculo_electrico [autonomiacargacompleta=" + autonomiacargacompleta + ", tiempopromediocarga="
                + tiempopromediocarga + "]";
    }

    

}
