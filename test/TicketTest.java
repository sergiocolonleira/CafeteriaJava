import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TicketTest {

    Ticket ticket;

    @BeforeEach
    void preparar() {
        Cliente cliente = new Cliente("José", 612345678);
        Camarero camarero = new Camarero("Sergio", 1);

        ticket = new Ticket(cliente, camarero);

        Producto producto1 = new Producto("Café", 2.00, "Bebidas");
        Producto producto2 = new Producto("Tostada", 3.00, "Comidas");

        ticket.agregarProducto(producto1);
        ticket.agregarProducto(producto2);
    }

    @Test
    void comprobarTotalCorrecto() {
        assertEquals(5.00, ticket.calcularTotal(), 0.01);
    }

    @Test
    void comprobarTotalIncorrecto() {
        assertFalse(ticket.calcularTotal() == 10.00);
    }

    @AfterEach
    void terminar() {
        ticket = null;
    }
}