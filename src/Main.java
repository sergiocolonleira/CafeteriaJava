public class Main {
    static void main() {
        Producto producto1 = new Producto("café", 1.50, "bebidas");
        System.out.println("Precio final con descuento: " + producto1.aplicarDescuento(10) + "€");
        //producto1.mostrarInformacion();

        Bebida bebida1 = new Bebida("caña", 3.00, "cerveza", "mediano");
        //bebida1.mostrarInformacion();
        Comida comida1 = new Comida("Churrasco", 10.00, "Parrillas", true);
        //comida1.mostrarInformacion();
        Cliente cliente1 = new Cliente("José", 612345678);
        //cliente1.mostrarInformacion();
        Camarero camarero1 = new Camarero("Sergio", 1);
        //camarero1.mostrarInformacion();
        Ticket ticket1 = new Ticket(cliente1, camarero1);

        ticket1.agregarProducto(producto1);
        ticket1.agregarProducto(bebida1);
        ticket1.agregarProducto(comida1);
        ticket1.mostrarTicket();
    }
}
