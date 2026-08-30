/**
 * Representa una bebida de la cafetería.
 * Una bebida es un tipo de producto que además tiene un tamaño.
 */
public class Bebida extends Producto {

    private String tamano;

    /**
     * Crea una nueva bebida con nombre, precio, categoría y tamaño.
     *
     * @param nombre nombre de la bebida
     * @param precio precio de la bebida
     * @param categoria categoría a la que pertenece la bebida
     * @param tamano tamaño de la bebida
     */
    public Bebida(String nombre, double precio, String categoria, String tamano) {
        super(nombre, precio, categoria);
        this.tamano = tamano;
    }

    /**
     * Obtiene el tamaño de la bebida.
     *
     * @return tamaño de la bebida
     */
    public String getTamano() {
        return tamano;
    }

    /**
     * Modifica el tamaño de la bebida.
     *
     * @param tamano nuevo tamaño de la bebida
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    /**
     * Muestra por pantalla el nombre, tamaño y precio de la bebida.
     */
    @Override
    public void mostrarInformacion() {
        System.out.printf("%s %s - %.2f €%n", getNombre(), getTamano(), getPrecio());
    }
}