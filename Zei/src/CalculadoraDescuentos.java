import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidadorSueldo extends JFrame implements ActionListener {
    private JLabel lblSueldoBase, lblDescuentos, lblLimite, lblResultado;
    private JTextField txtSueldoBase, txtDescuentos, txtLimite;
    private JButton btnCalcular;

    public ValidadorSueldo() {
        setTitle("Validador de Sueldo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lblSueldoBase = new JLabel("Sueldo Base:");
        txtSueldoBase = new JTextField();
        panel.add(lblSueldoBase);
        panel.add(txtSueldoBase);

        lblDescuentos = new JLabel("Descuentos:");
        txtDescuentos = new JTextField();
        panel.add(lblDescuentos);
        panel.add(txtDescuentos);

        lblLimite = new JLabel("Límite:");
        txtLimite = new JTextField();
        panel.add(lblLimite);
        panel.add(txtLimite);

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
            double sueldoBase = Double.parseDouble(txtSueldoBase.getText());
            double descuentos = Double.parseDouble(txtDescuentos.getText());
            double limite = Double.parseDouble(txtLimite.getText());
            double sueldoNeto = sueldoBase - descuentos;

            if (sueldoNeto > limite) {
                JOptionPane.showMessageDialog(this, "El sueldo neto es mayor que el límite.");
            } else {
                JOptionPane.showMessageDialog(this, "El sueldo neto es menor o igual que el límite.");
            }
        }
    }

    public static void main(String[] args) {
        new ValidadorSueldo();
    }
}
