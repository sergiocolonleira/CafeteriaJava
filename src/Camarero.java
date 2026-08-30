/**
 * Representa a un camarero de la cafetería.
 * Cada camarero tiene un nombre, un número de empleado y un código de empleado.
 */
public class Camarero {

    private String nombreCamarero;
    private int numeroEmpleado;
    private String codigoEmpleado;

    /**
     * Crea un nuevo camarero y genera automáticamente su código de empleado.
     *
     * @param nombre nombre del camarero
     * @param numero número de empleado
     */
    public Camarero(String nombre, int numero) {
        this.nombreCamarero = nombre;
        this.numeroEmpleado = numero;
        char inicial = nombreCamarero.charAt(0);
        String numeroFormateado = String.format("%02d", numeroEmpleado);
        this.codigoEmpleado = inicial + numeroFormateado;
    }

    /**
     * Obtiene el nombre del camarero.
     *
     * @return nombre del camarero
     */
    public String getNombreCamarero() {
        return nombreCamarero;
    }

    /**
     * Obtiene el número de empleado del camarero.
     *
     * @return número de empleado
     */
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * Obtiene el código de empleado generado.
     *
     * @return código de empleado
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Modifica el nombre del camarero y actualiza su código de empleado.
     *
     * @param nombreCamarero nuevo nombre del camarero
     */
    public void setNombreCamarero(String nombreCamarero) {
        this.nombreCamarero = nombreCamarero;
        char inicial = nombreCamarero.charAt(0);
        String numeroFormateado = String.format("%02d", numeroEmpleado);
        this.codigoEmpleado = inicial + numeroFormateado;
    }

    /**
     * Modifica el número de empleado y actualiza su código de empleado.
     *
     * @param numeroEmpleado nuevo número de empleado
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
        char inicial = nombreCamarero.charAt(0);
        String numeroFormateado = String.format("%02d", numeroEmpleado);
        this.codigoEmpleado = inicial + numeroFormateado;
    }

    /**
     * Muestra por pantalla la información del camarero.
     */
    public void mostrarInformacion() {
        System.out.println("El nombre del camarero que le ha atendido ha sido "
                + getNombreCamarero()
                + ", cuyo número de empleado es el "
                + getNumeroEmpleado()
                + ", con código de empleado "
                + getCodigoEmpleado());
    }
}