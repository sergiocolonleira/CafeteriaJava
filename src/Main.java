public class Main {
    static void main() {
        Producto producto1 = new Producto("café", 1.50, "bebidas");
        producto1.mostrarInformacion();

    Bebida bebida1 = new Bebida("caña", 3.00, "cerveza", "mediano");
    bebida1.mostrarInformacion();
    Comida comida1=new Comida("Churrasco", 10,"Parrillas",true);
    comida1.mostrarInformacion();
}
}
