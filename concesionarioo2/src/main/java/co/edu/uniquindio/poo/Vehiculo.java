package co.edu.uniquindio.poo;

public class Vehiculo {
    public String codigo;
    public String marca;
    public boolean estado;
    public String modelo;
    public int cambios;
    public int velocidadmaxima;
    public int cilindraje;
    
    
     public Vehiculo(String codigo,String marca,boolean estado,String modelo,int cambios,int velocidadmaxima,int cilindraje){
         this.codigo=codigo;
         this.marca=marca;
         this.estado=estado;
         this.modelo=modelo;
         this.cambios=cambios;
         this.velocidadmaxima=velocidadmaxima;
         this.cilindraje=cilindraje;
     }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public boolean isEstado() {
        return estado;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getCambios() {
        return cambios;
    }


    public void setCambios(int cambios) {
        this.cambios = cambios;
    }


    public int getVelocidadmaxima() {
        return velocidadmaxima;
    }


    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }


    public int getCilindraje() {
        return cilindraje;
    }


    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }


    @Override
    public String toString() {
        return "Vehiculo [codigo=" + codigo + ", marca=" + marca + ", estado=" + estado + ", modelo=" + modelo
                + ", cambios=" + cambios + ", velocidadmaxima=" + velocidadmaxima + ", cilindraje=" + cilindraje + "]";
    }

     

     
     



}
