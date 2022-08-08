package ar.charlycimino.ejemplos.upcasting;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Auto extends Vehiculo {

    private boolean tieneAire;

    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }

    public void prenderAire() {
        if (tieneAire) {
            System.out.println("Encendiendo aire...");
        }
    }
}
