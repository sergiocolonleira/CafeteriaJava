/**
 * Representa una comida de la cafetería.
 * Una comida es un tipo de producto que puede servirse caliente o fría.
 */
public class Comida extends Producto {

    private boolean esCaliente;

    /**
     * Crea una nueva comida con nombre, precio, categoría
     * e indicación de si se sirve caliente.
     *
     * @param nombre nombre de la comida
     * @param precio precio de la comida
     * @param categoria categoría a la que pertenece la comida
     * @param esCaliente indica si la comida se sirve caliente
     */
    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    /**
     * Indica si la comida se sirve caliente.
     *
     * @return true si la comida es caliente, false si es fría
     */
    public boolean isCaliente() {
        return esCaliente;
    }

    /**
     * Modifica si la comida se sirve caliente o fría.
     *
     * @param esCaliente nuevo estado de la comida
     */
    public void setCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    /**
     * Muestra por pantalla el nombre, la temperatura y el precio de la comida.
     */
    @Override
    public void mostrarInformacion() {
        if (esCaliente) {
            System.out.printf("%s caliente - %.2f €%n", getNombre(), getPrecio());
        } else {
            System.out.printf("%s fría - %.2f €%n", getNombre(), getPrecio());
        }
    }
}