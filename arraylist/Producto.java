package arraylist;


// Clase Producto
class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " x " + cantidad + " = $" + calcularTotal();
    }
}