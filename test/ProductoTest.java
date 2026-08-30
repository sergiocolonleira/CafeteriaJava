import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProductoTest {

    Producto producto;

    @BeforeEach
    void preparar() {
        producto = new Producto("Café", 10.00, "Bebidas");
    }

    @Test
    void comprobarDescuentoCorrecto() {
        assertEquals(9.00, producto.aplicarDescuento(10), 0.01);
    }

    @Test
    void comprobarDescuentoIncorrecto() {
        assertFalse(producto.aplicarDescuento(10) == 10.00);
    }

    @AfterEach
    void terminar() {
        producto = null;
    }
}