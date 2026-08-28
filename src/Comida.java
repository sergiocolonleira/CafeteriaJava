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
            if (esCaliente) {
                System.out.printf("%s caliente - %.2f €%n", getNombre(), getPrecio());
            } else {
                System.out.printf("%s fría - %.2f €%n", getNombre(), getPrecio());
            }

        }
    }

