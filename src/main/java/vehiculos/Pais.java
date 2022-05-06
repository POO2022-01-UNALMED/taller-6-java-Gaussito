package vehiculos;

import java.util.ArrayList;

public class Pais {

    String nombre;
    int cantidad;
    static final ArrayList<Pais> paises = new ArrayList<Pais>();

    public Pais(String nombre) {
        this.nombre = nombre;
        this.cantidad += 1;
        Pais.paises.add(this);
    }

    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // METHODS

    public static Pais paisMasVendedor(){

        Pais bestWaifu = paises.get(0);
        for (Pais pais:
             paises) {
            if (bestWaifu.cantidad > pais.cantidad){
                bestWaifu = pais;
            }
        }
        return bestWaifu;

    }

}
