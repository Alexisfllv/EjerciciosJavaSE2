package lep;

public class CalculoDescuentos {
    private boolean descuento;

    public CalculoDescuentos() {
        descuento = false;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public double calcularTotal(double valor) {
        if (descuento) {
            return valor * 0.9;
        } else {
            return valor;
        }
    }
}

