public class Comida extends Producto {
    private boolean esCaliente;

    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    public boolean isCaliente() {
        return esCaliente;
    }

    public void setCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El plato es " + getNombre() + ", cuyo precio unitario es de " + getPrecio() + "€, y pertenece a la categoría de " + getCategoria());
        if (esCaliente) {
            System.out.println("Es comida caliente");
        } else{
            System.out.println("Es comida fria");
        }
    }
}
