package Pila;

public class SimularNavegador {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();

        navegador.visitarPagina("https://google.com");
        navegador.visitarPagina("http://github.com");
        navegador.visitarPagina("https://stackoverflow.com");

        //vamos navegando
        navegador.mostrarEstado();
        navegador.irAdelante();
        navegador.irAtras();
        navegador.mostrarEstado();
        navegador.irAdelante();
        navegador.mostrarEstado();

    }
}
