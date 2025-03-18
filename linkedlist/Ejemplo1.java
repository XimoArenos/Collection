package listas;

import java.util.LinkedList;

public class Ejemplo1 {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");



        lista.addFirst("X");
        lista.addLast("Z");

        System.out.println(lista); // [X, A, B, C, Z]

        lista.remove(); // Elimina "X"
        System.out.println(lista.get(1)); // B
    }
}

