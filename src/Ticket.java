/**
 * Representa un ticket de compra de la cafetería.
 * Un ticket está asociado a un cliente, un camarero
 * y una colección de productos.
 */
public class Ticket {

    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private int contadorProductos;

    /**
     * Crea un nuevo ticket asociado a un cliente y a un camarero.
     * El ticket puede almacenar inicialmente hasta 10 productos.
     *
     * @param cliente cliente asociado al ticket
     * @param camarero camarero que atiende al cliente
     */
    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[10];
        this.contadorProductos = 0;
    }

    /**
     * Añade un producto al ticket si todavía hay espacio disponible.
     *
     * @param producto producto que se desea añadir
     */
    public void agregarProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos = contadorProductos + 1;
        } else {
            System.out.println("No puedes añadir más productos");
        }
    }

    /**
     * Muestra por pantalla la información completa del ticket,
     * incluyendo cliente, camarero, productos y precio total.
     */
    public void mostrarTicket() {
        System.out.println("======= CAFETERÍA JAVA =======");
        System.out.println();
        System.out.println("Cliente: " + cliente.getNombreCliente());
        System.out.println("Camarero: " + camarero.getNombreCamarero()
                + " - Código: " + camarero.getCodigoEmpleado());
        System.out.println();
        System.out.println("Productos:");

        for (int i = 0; i < contadorProductos; i++) {
            System.out.print((i + 1) + ". ");
            productos[i].mostrarInformacion();
        }

        System.out.println();
        System.out.printf("Total: %.2f €%n", calcularTotal());
        System.out.println();
    }

    /**
     * Calcula el precio total de todos los productos añadidos al ticket.
     *
     * @return suma del precio de todos los productos
     */
    public double calcularTotal() {
        double total = 0.0;

        for (int i = 0; i < contadorProductos; i++) {
            total = total + productos[i].getPrecio();
        }

        return total;
    }
}