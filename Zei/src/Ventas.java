import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Ventas {
    private Map<String, Integer> ventas;

    public Ventas() {
        ventas = new HashMap<>();
    }

    public void agregarVenta(String producto, int cantidad) {
        if (ventas.containsKey(producto)) {
            int cantidadActual = ventas.get(producto);
            cantidadActual += cantidad;
            ventas.put(producto, cantidadActual);
        } else {
            ventas.put(producto, cantidad);
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        StringBuilder sb = new StringBuilder();
        double total = 0;
        for (String producto : ventas.keySet()) {
            int cantidad = ventas.get(producto);
            double precio = obtenerPrecio(producto);
            double subtotal = cantidad * precio;
            sb.append(producto).append(": ").append(cantidad).append(" x $").append(df.format(precio)).append(" = $").append(df.format(subtotal)).append("\n");
            total += subtotal;
        }
        sb.append("Total: $").append(df.format(total));
        return sb.toString();
    }

    private double obtenerPrecio(String producto) {
        switch (producto) {
            case "Producto 1":
                return 10.50;
            case "Producto 2":
                return 7.20;
            case "Producto 3":
                return 15.30;
            default:
                return 0.0;
        }
    }
}
