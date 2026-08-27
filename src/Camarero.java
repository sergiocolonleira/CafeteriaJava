public class Camarero {
    private String nombreCamarero;
    private int numeroEmpleado;
    private String codigoEmpleado;
    public Camarero (String nombre, int numero) {
        this.nombreCamarero=nombre;
        this.numeroEmpleado=numero;
        char inicial = nombreCamarero.charAt(0);
        String numeroFormateado = String.format("%02d", numeroEmpleado);
        this.codigoEmpleado=inicial+numeroFormateado;
    }
    public String getNombreCamarero() {
        return nombreCamarero;
    }
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getCodigoEmpleado(){
        return codigoEmpleado;
    }

}
