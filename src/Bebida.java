public class Bebida extends Producto {
    public Bebida(String nombre, double precio, String categoria, String tamano) {
        super(nombre, precio, categoria);
        this.tamano=tamano;
    }
    private String tamano;

    public String getTamano(){
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
@Override
    public void mostrarInformacion(){
    System.out.printf("%s %s - %.2f €%n", getNombre(), getTamano(), getPrecio());}
}
