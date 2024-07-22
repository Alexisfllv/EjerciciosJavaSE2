package lep;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculoDescuentosUI extends JFrame {
    private JTextField txtValor;
    private JCheckBox chkDescuento;
    private JButton btnCalcular;
    private JLabel lblTotal;
    private CalculoDescuentos calculo;

    public CalculoDescuentosUI() {
        calculo = new CalculoDescuentos();

        JLabel lblValor = new JLabel("Valor:");
        JLabel lblDescuento = new JLabel("Descuento:");

        txtValor = new JTextField(10);
        chkDescuento = new JCheckBox();
        chkDescuento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculo.setDescuento(chkDescuento.isSelected());
            }
        });

        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                double total = calculo.calcularTotal(valor);
                lblTotal.setText("Total: $" + new DecimalFormat("#,##0.00").format(total));
            }
        });

        lblTotal = new JLabel("Total: $0.00");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(lblValor);
        panel.add(txtValor);
        panel.add(lblDescuento);
        panel.add(chkDescuento);
        panel.add(btnCalcular);
        panel.add(lblTotal);

        getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculoDescuentosUI();
    }
}

