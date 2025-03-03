package arraylist;
import java.util.ArrayList;

class CarritoCompras {
    private ArrayList<Producto> productos;

    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio, int cantidad) {
        productos.add(new Producto(nombre, precio, cantidad));
        System.out.println("Producto agregado: " + nombre);
    }

    public void eliminarProducto(String nombre) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(p);
                System.out.println("Producto eliminado: " + nombre);
                //encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println(" Producto no encontrado en el carrito.");
        }
    }

    public void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("🛒 El carrito está vacío.");
            return;
        }

        System.out.println("\n🛒 Productos en el carrito:");
        double total = 0;
        for (Producto p : productos) {
            System.out.println("  - " + p);
            total += p.calcularTotal();
        }
        System.out.println("💰 Total a pagar: $" + total);
    }

    public void vaciarCarrito() {
        productos.clear();
        System.out.println("🛒 El carrito ha sido vaciado.");
    }
}
