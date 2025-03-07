public class DatosCompañeros {
    public static void main(String[] args) {
        String[][] compañeros = {
            {"Daniel", "Medina", "Electronica", "TEST"},
            {"Monica", "Jiz", "Computacion", "IMSA"}
            // Agrega más compañeros aquí
        };

        for (String[] compañero : compañeros) {
            System.out.println(String.join(" ", compañero));
        }
    }
}