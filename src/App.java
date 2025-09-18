public class App {
    public static void main(String[] args) throws Exception {
        Volador miAvion = new Avion();
        // Volador miParajo = new Parajo();
        miAvion.despegar();
        miAvion.volar();
        miAvion.aterrizar(); // Usa la implementación default
        System.out.println("---");
        /*
         * miPajaro.despegar();
         * miPajaro.volar();
         * miPajaro.aterrizar(); // Usa su propia implementación
         */
    }
}
