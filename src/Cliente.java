public class Cliente {
    private String nombreCliente;
    private int numeroTelefono;
    public Cliente (String nombreCliente, int numeroTelefono){
        this.nombreCliente=nombreCliente;
        this.numeroTelefono=numeroTelefono;
    }
    public String getNombreCliente(){
        return nombreCliente;
    }
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void mostrarInformacion(){
        System.out.println("El nombre del cliente es " + getNombreCliente() + " y su número de teléfono es el " + getNumeroTelefono());
    }
}
