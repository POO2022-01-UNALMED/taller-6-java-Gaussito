package vehiculos;

import java.security.AuthProvider;

public class Automovil extends Vehiculo{

    int puestos;
    static int cantidadVehiculos;

    public Automovil(String placa, String nombre, float precio, float peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso, "FWD" , fabricante);
        this.puestos = puestos;
        Automovil.cantidadVehiculos += 1;
    }

    // GETTERS AND SETTERS

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

}
