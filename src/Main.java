/**
 * Clase principal de la aplicación CafeteriaJava.
 * Se encarga de crear los objetos de ejemplo y ejecutar
 * el flujo principal del programa.
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     * Crea productos, cliente, camarero y ticket,
     * y muestra el resultado por pantalla.
     */
    static void main() {
        Producto producto1 = new Producto("Café", 1.50, "bebidas");

        Bebida bebida1 = new Bebida("Caña", 3.00, "cerveza", "mediana");

        Comida comida1 = new Comida("Churrasco", 10.00, "Parrillas", true);

        Cliente cliente1 = new Cliente("José", 612345678);

        Camarero camarero1 = new Camarero("Sergio", 1);

        Ticket ticket1 = new Ticket(cliente1, camarero1);

        ticket1.agregarProducto(producto1);
        ticket1.agregarProducto(bebida1);
        ticket1.agregarProducto(comida1);

        ticket1.mostrarTicket();

        double precioConDescuento = producto1.aplicarDescuento(10);

        System.out.println("Descuento aplicado al café: 10%");
        System.out.printf("Precio final del café: %.2f €%n", precioConDescuento);
        System.out.println("==============================");
    }
}