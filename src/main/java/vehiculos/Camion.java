package vehiculos;

public class Camion extends Vehiculo{

    int ejes;
    static int cantidadVehiculos;

    public Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Camion.cantidadVehiculos += 1;
    }

    // GETTERS AND SETTERS

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

}
