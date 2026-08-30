/**
 * Representa un cliente de la cafetería.
 * Un cliente tiene un nombre y un número de teléfono.
 */
public class Cliente {

    private String nombreCliente;
    private int numeroTelefono;

    /**
     * Crea un nuevo cliente con su nombre y número de teléfono.
     *
     * @param nombreCliente nombre del cliente
     * @param numeroTelefono número de teléfono del cliente
     */
    public Cliente(String nombreCliente, int numeroTelefono) {
        this.nombreCliente = nombreCliente;
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return nombre del cliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return número de teléfono del cliente
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Modifica el nombre del cliente.
     *
     * @param nombreCliente nuevo nombre del cliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Modifica el número de teléfono del cliente.
     *
     * @param numeroTelefono nuevo número de teléfono del cliente
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * Muestra por pantalla el nombre y el número de teléfono del cliente.
     */
    public void mostrarInformacion() {
        System.out.println("El nombre del cliente es " + getNombreCliente()
                + " y su número de teléfono es el " + getNumeroTelefono());
    }
}