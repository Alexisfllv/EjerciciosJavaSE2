import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Descuentos extends JFrame implements ActionListener {
    private JLabel lblNumero, lblResultado;
    private JTextField txtNumero;
    private JRadioButton rbtnPorcentaje, rbtnMontoFijo, rbtnPorCantidad;
    private ButtonGroup btnGroup;
    private JButton btnCalcular;

    public Descuentos() {
        setTitle("Descuentos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lblNumero = new JLabel("Número:");
        txtNumero = new JTextField();
        panel.add(lblNumero);
        panel.add(txtNumero);

        rbtnPorcentaje = new JRadioButton("Porcentaje");
        rbtnMontoFijo = new JRadioButton("Monto Fijo");
        rbtnPorCantidad = new JRadioButton("Por Cantidad");
        btnGroup = new ButtonGroup();
        btnGroup.add(rbtnPorcentaje);
        btnGroup.add(rbtnMontoFijo);
        btnGroup.add(rbtnPorCantidad);
        panel.add(rbtnPorcentaje);
        panel.add(rbtnMontoFijo);
        panel.add(rbtnPorCantidad);

        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this);
        panel.add(new JLabel());
        panel.add(btnCalcular);

        lblResultado = new JLabel();
        panel.add(lblResultado);

        setContentPane(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            double numero = Double.parseDouble(txtNumero.getText());
            double descuento = 0;

            if (rbtnPorcentaje.isSelected()) {
                descuento = 0.1;
            } else if (rbtnMontoFijo.isSelected()) {
                descuento = 5;
            } else if (rbtnPorCantidad.isSelected()) {
                descuento = 0.01 * Math.floor(numero / 100);
            }

            double resultado = numero - descuento;
            lblResultado.setText("El resultado es: " + resultado);
        }
    }

    public static void main(String[] args) {
        new Descuentos();
    }
}
