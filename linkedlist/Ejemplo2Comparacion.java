package listas;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ejemplo2Comparacion
{

    public static void main(String[] args) {
        int cantidadElementos = 100000;
        int posicionInsercion = 50000;

        // Crear y llenar ArrayList con 100,000 elementos
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < cantidadElementos; i++) {
            arrayList.add(i);
        }

        // Crear y llenar LinkedList con 100,000 elementos
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < cantidadElementos; i++) {
            linkedList.add(i);
        }

        // Medir tiempo de inserción en el medio de ArrayList
        long inicioArrayList = System.nanoTime();
        arrayList.add(posicionInsercion, -1);
        long finArrayList = System.nanoTime();
        long tiempoArrayList = finArrayList - inicioArrayList;

        // Medir tiempo de inserción en el medio de LinkedList
        long inicioLinkedList = System.nanoTime();
        linkedList.add(posicionInsercion, -1);
        long finLinkedList = System.nanoTime();
        long tiempoLinkedList = finLinkedList - inicioLinkedList;

        // Mostrar resultados
        System.out.println("Tiempo de inserción en ArrayList: " + tiempoArrayList + " ns");
        System.out.println("Tiempo de inserción en LinkedList: " + tiempoLinkedList + " ns");
    }
}
