package vehiculos;

import java.util.ArrayList;

public class Fabricante {

    String nombre;
    Pais pais;
    int cantidad;
    static final ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.cantidad += 1;
        Fabricante.fabricantes.add(this);
    }

    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public int getCantidad() {
        return cantidad;
    }

    // METHODS

    public static Fabricante fabricaMayorVentas(){

        Fabricante bestWaifu = fabricantes.get(0);
        for (Fabricante fabricante:
                fabricantes) {
            if (bestWaifu.cantidad > fabricante.cantidad){
                bestWaifu = fabricante;
            }
        }
        return bestWaifu;
    }

}
