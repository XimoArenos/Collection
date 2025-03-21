package listas;
import java.util.LinkedList;
import java.util.Scanner;
//Snakegame
public class Serpiente {

    public static void main(String[] args) {
        LinkedList<String> snake = new LinkedList<>();
        snake.add("O");
        snake.add("O");
        snake.add("O");

        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\nSerpiente: " + snake);
            System.out.println("1. Comer comida (+1 segmento)");
            System.out.println("2. Moverse (quita la cola y agrega una cabeza)");
            System.out.println("3. Chocar y terminar juego");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    snake.addLast("O");
                    System.out.println("La serpiente ha crecido!");
                    break;
                case "2":
                    snake.removeFirst();
                    snake.addLast("O");
                    System.out.println("La serpiente se ha movido!");
                    break;
                case "3":
                    System.out.println("La serpiente ha chocado! Fin del juego.");
                    snake.clear();
                    break;
                case "4":
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (!opcion.equals("4"));

        scanner.close();
    }
}
