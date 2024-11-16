package co.edu.uniquindio.poo;

public class CompraVehiculo {

    private String codigo;
    private int precioVenta;
    private boolean revisionTecnicaAprobado;

    public CompraVehiculo (String codigo, int precioVenta, boolean revisionTecnicaAprobado){
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.revisionTecnicaAprobado = revisionTecnicaAprobado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public boolean isRevisionTecnicaAprobado() {
        return revisionTecnicaAprobado;
    }

    public void setRevisionTecnicaAprobado(boolean revisionTecnicaAprobado) {
        this.revisionTecnicaAprobado = revisionTecnicaAprobado;
    }

    @Override
    public String toString() {
        return "CompraVehiculo [codigo=" + codigo + ", precioVenta=" + precioVenta + ", revisionTecnicaAprobado="
                + revisionTecnicaAprobado + "]";
    }

    


}
