public class App {
    public static void main(String[] args) throws Exception {
        Volador miAvion = new Avion();
        Volador miParajo = new parajo();
        miAvion.despegar();
        miAvion.volar();
        miAvion.aterrizar(); // Usa la implementación default
        System.out.println("---");
        
        miParajo.despegar();
        miParajo.volar();
        miParajo.aterrizar(); // Usa su propia implementación
        
    }
}
