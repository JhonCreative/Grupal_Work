package ejercicios;
public class Animales {
    private String raza;
    private String color;
    private int edad;
    private double tamaño;
    private boolean hambriento;
    private boolean ladrando;
    
    public Animales(String raz, String col, int ed, double tam) {
        raza = raz;
        color = col;
        edad = ed;
        tamaño = tam;
        hambriento = false;
        ladrando = false;
    }
    
    public void consentir() {
        alimentar();
        calmar();
    }
    
    private void alimentar() {
        hambriento = true;
    }
    
    private void calmar() {
        if (hambriento) {
            ladrando = true;
        }
    }
    
    public void mostrar() {
        System.out.println("Raza       = " + raza);
        System.out.println("Color      = " + color);
        System.out.println("Edad       = " + edad);
        System.out.println("Tamaño     = " + tamaño);
        
        if (hambriento) {
            System.out.println("Hambiento = El animal está hambriento");
            System.out.println("El animal está ladrando");
        } else {
            System.out.println("Hambrient = El animal no está hambriento");
            System.out.println("El animal no está ladrando");
        }
    }
    
    public static void ejecutar(){
        System.out.println("\n *** Buldog ***");
        Animales buldog = new Animales("Buldog", "negro", 2, 0.70);
        buldog.consentir();
        buldog.mostrar();
        
        System.out.println("\n *** Salchicha ***");
        Animales salchicha = new Animales("Salchica", "Cafe", 5, 0.30);
        salchicha.consentir();
        salchicha.mostrar();
    }
}
