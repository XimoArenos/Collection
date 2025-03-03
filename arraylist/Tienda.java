package arraylist;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarritoCompras carrito = new CarritoCompras();
        String opcion;

        do {
            System.out.println("\n===== 🛍 MENU TIENDA 🛍 =====");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Eliminar producto del carrito");
            System.out.println("3. Mostrar carrito");
            System.out.println("4. Vaciar carrito");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    carrito.agregarProducto(nombre, precio, cantidad);
                    break;

                case "2":
                    System.out.print("Nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    carrito.eliminarProducto(nombreEliminar);
                    break;

                case "3":
                    carrito.mostrarCarrito();
                    break;

                case "4":
                    carrito.vaciarCarrito();
                    break;

                case "5":
                    System.out.println("👋 Gracias por visitar la tienda. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("⚠ Opción no válida. Intenta de nuevo.");
            }

        } while (!opcion.equals("5"));

        scanner.close();
    }
}