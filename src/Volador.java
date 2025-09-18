public interface Volador {
 // Métodos son public abstract por defecto
 void despegar();
 void volar();

 // Método default (desde Java 8)
 default void aterrizar() {
 System.out.println("Aterrizando de forma controlada.");
 }
}