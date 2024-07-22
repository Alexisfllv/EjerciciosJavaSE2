
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentasUI extends JFrame {
    private JTextField txtProducto;
    private JTextField txtCantidad;
    private JButton btnAgregar;
    private JTextArea txtVentas;
    private Ventas ventas;

    public VentasUI() {
        ventas = new Ventas();

        JLabel lblProducto = new JLabel("Producto:");
        JLabel lblCantidad = new JLabel("Cantidad:");

        txtProducto = new JTextField(20);
        txtCantidad = new JTextField(5);

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String producto = txtProducto.getText();
                int cantidad = Integer.parseInt(txtCantidad.getText());
                ventas.agregarVenta(producto, cantidad);
                txtVentas.setText(ventas.toString());
            }
        });

        txtVentas = new JTextArea(10, 30);

        JPanel panel = new JPanel();
        panel.add(lblProducto);
        panel.add(txtProducto);
        panel.add(lblCantidad);
        panel.add(txtCantidad);
        panel.add(btnAgregar);

        JScrollPane scrollPane = new JScrollPane(txtVentas);

        getContentPane().add(panel, "North");
        getContentPane().add(scrollPane, "Center");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentasUI();
    }
}
