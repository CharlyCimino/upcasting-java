package ar.charlycimino.ejemplos.upcasting;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        this.vehiculos.add(v);
    }
}
