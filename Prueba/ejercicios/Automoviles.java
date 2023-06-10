package ejercicios;
public class Automoviles {
    private String marca;
    private String modelo;
    private String color;
    private int precio;
    private String estado;
    public static void ejecutar() {
        System.out.println("\n*** LAMBORGHINI ***");
        Automoviles camioneta = new Automoviles("Lamborghini", "Huracan STO", "Turquesa", 338577);
        camioneta.encender();
        camioneta.mostrar();

        System.out.println("\n*** FERRARI ***");
        Automoviles bus = new Automoviles("Ferrari", "Gama", "Negro", 210602);
        bus.apagar();
        bus.mostrar();
    }
    public Automoviles(String mar, String mod, String col, int pre) {
        marca = mar;
        modelo = mod;
        color = col;
        precio = pre;
        estado = "Apagado";
    }
    
    public void encender() {
        estado = "Encendido";
    }
    
    public void apagar() {
        estado = "Apagado";
    }
    
    public void mostrar() {
        System.out.println("Marca  = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Color  = " + color);
        System.out.println("Precio = " + precio + "€");
        System.out.println("Estado = " + estado);
    }
}
