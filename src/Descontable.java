/**
 * Define el comportamiento de los objetos a los que se puede aplicar un descuento.
 */
public interface Descontable {

    /**
     * Aplica un descuento según el porcentaje indicado.
     *
     * @param porcentaje porcentaje de descuento que se desea aplicar
     * @return resultado después de aplicar el descuento
     */
    double aplicarDescuento(double porcentaje);
}