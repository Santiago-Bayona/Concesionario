package co.edu.uniquindio.poo;

public interface Gestion {

    public boolean verificarCliente(String Cedula);
    public void agregarCliente(Cliente cliente);
    public void EliminarCliente(String cedula);

    public boolean verificarVehiculoElectrico(String placa);
    public void agregarVehiculoElectrico(VehiculoElectrico vehiculoElectrico);
    public void EliminarVehiculoElectrico(String placa);

    public boolean verificarVehiculoGD(String placa);
    public void agregarVehiculoGD(VehiculoGD vehiculoGD);
    public void EliminarVehiculoGD(String placa);

    public boolean verificarVehiculoHibrido(String placa);
    public void agregarVehiculoHibrido(VehiculoHibrido vehiculoHibrido);
    public void EliminarVehiculoHibrido(String placa);

}
