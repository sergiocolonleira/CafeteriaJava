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
    System.out.println("La bebida seleccionada es " + getNombre() + ", perteneciente a la categoría de " + getCategoria() +
            ", cuyo valor unitario es de " + getPrecio() + "€ para el tamaño " + getTamano());
}
}
