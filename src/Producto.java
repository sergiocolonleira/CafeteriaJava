public class Producto implements Descontable {
    private String nombre;
    private double precio;
    private String categoria;
    public Producto (String nombre, double precio, String categoria){
this.nombre=nombre;
this.precio=precio;
this.categoria=categoria;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setPrecio (double precio){
        this.precio=precio;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void setCategoria (String categoria){
        this.categoria=categoria;
    }
    public void mostrarInformacion(){
        System.out.printf("%s - %.2f €%n", getNombre(), getPrecio());    }
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}

