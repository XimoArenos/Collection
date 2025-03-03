package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class ejemploprimero {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n===== 📋 MENU =====");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Eliminar nombre");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingresa un nombre: ");
                    String nombre = scanner.nextLine();
                    nombres.add(nombre);
                    System.out.println("✅ Nombre agregado: " + nombre);
                    break;

                case "2":
                    System.out.print("Nombre a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    if (nombres.remove(nombreEliminar)) {
                        System.out.println("❌ Nombre eliminado: " + nombreEliminar);
                    } else {
                        System.out.println("⚠ No se encontró el nombre en la lista.");
                    }
                    break;

                case "3":
                    if (nombres.isEmpty()) {
                        System.out.println("📭 La lista está vacía.");
                    } else {
                        System.out.println("📋 Lista de nombres:");
                        for (String n : nombres) {
                            System.out.println(" - " + n);
                        }
                        //nombres.forEach(System.out::println);


                    }
                    break;

                case "4":
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("⚠ Opción no válida. Intenta de nuevo.");
            }
        } while (!opcion.equals("4"));








        scanner.close();
    }
}
