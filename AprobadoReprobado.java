import java.util.Scanner;

public class AprobadoReprobado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la nota: ");
        int nota = scanner.nextInt();

        if (nota >= 60) {
            System.out.println(nombre + " " + nota + " Aprobado");
        } else {
            System.out.println(nombre + " " + nota + " Reprobado");
        }
    }
}