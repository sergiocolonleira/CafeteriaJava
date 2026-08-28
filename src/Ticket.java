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
    public void mostrarTicket(){
        cliente.mostrarInformacion();
        camarero.mostrarInformacion();
        for (int i=0;i<contadorProductos; i++) {
            productos[i].mostrarInformacion();
        }
        System.out.println("Importe total: " + calcularTotal() + "€");
    }
public double calcularTotal(){
        double total=0;
    for (int i = 0; i < contadorProductos; i++) {
        total = total + productos[i].getPrecio();
    }

return total;

}

}

