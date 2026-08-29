public class Ticket {
    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private int contadorProductos;

    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[10];
        this.contadorProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos = contadorProductos + 1;
        } else {
            System.out.println("No puedes añadir más productos");
        }
    }

    public void mostrarTicket() {
        System.out.println("======= CAFETERÍA JAVA =======");
        System.out.println();
        System.out.println("Cliente: " + cliente.getNombreCliente());
        System.out.println("Camarero: " + camarero.getNombreCamarero() + " - Código: " + camarero.getCodigoEmpleado());
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

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < contadorProductos; i++) {
            total = total + productos[i].getPrecio();
        }

        return total;

    }

}

