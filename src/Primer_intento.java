class Coche {
    private int numeroPuertas;
    
    public Coche() {
        numeroPuertas = 3;
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    public void incrementarPuertas() {
        numeroPuertas++;
    }
}

public class Primer_intento {
    public static int sumarNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        // Llamado de la funcion sumarNumeros
        int resultado = sumarNumeros(10, 20, 30);
        System.out.println("PRIMERA PARTE");
        System.out.println("El resultado de la suma es: " + resultado);
        
        // Creacion del objeto coche
        Coche miCoche = new Coche();
        
        // Añadir una puerta al coche
        miCoche.incrementarPuertas();
        
        // Mostrar el número de puertas del coche
        int numeroPuertas = miCoche.getNumeroPuertas();
        System.out.println("SEGUNDA PARTE");
        System.out.println("El coche tiene " + numeroPuertas + " puerta(s).");
    }
}
