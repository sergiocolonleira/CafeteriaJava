/**
 * Representa un producto de la cafetería.
 * Un producto tiene un nombre, un precio y una categoría.
 */
public class Producto implements Descontable {

    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Crea un nuevo producto con nombre, precio y categoría.
     *
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param categoria categoría a la que pertenece el producto
     */
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la categoría del producto.
     *
     * @return categoría del producto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Modifica el precio del producto.
     *
     * @param precio nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Modifica el nombre del producto.
     *
     * @param nombre nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica la categoría del producto.
     *
     * @param categoria nueva categoría del producto
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Muestra por pantalla el nombre y el precio del producto.
     */
    public void mostrarInformacion() {
        System.out.printf("%s - %.2f €%n", getNombre(), getPrecio());
    }

    /**
     * Aplica un descuento al precio del producto.
     *
     * @param porcentaje porcentaje de descuento que se aplicará
     * @return precio final del producto después de aplicar el descuento
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}