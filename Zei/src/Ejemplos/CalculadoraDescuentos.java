package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculadoraDescuentos extends JFrame {
    private JTextField txtValorInicial;
    private JTextField txtDescuento;
    private JLabel lblTotal;
    
    public CalculadoraDescuentos() {
        // Configurar la ventana
        setTitle("Calculadora de Descuentos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Crear los componentes de la interfaz
        JLabel lblValorInicial = new JLabel("Valor Inicial:");
        JLabel lblDescuento = new JLabel("Descuento (%):");

        txtValorInicial = new JTextField(10);
        txtDescuento = new JTextField(10);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores ingresados por el usuario
                double valorInicial = Double.parseDouble(txtValorInicial.getText());
                double descuento = Double.parseDouble(txtDescuento.getText());

                // Calcular el total después del descuento
                double total = valorInicial * (1 - descuento/100);

                // Mostrar el total en un JLabel
                lblTotal.setText("Total: $" + new DecimalFormat("#,##0.00").format(total));
            }
        });

        lblTotal = new JLabel("Total: $0.00");

        // Configurar el layout de la interfaz
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(lblValorInicial);
        panel.add(txtValorInicial);
        panel.add(lblDescuento);
        panel.add(txtDescuento);
        panel.add(btnCalcular);
        panel.add(lblTotal);

        // Añadir el panel a la ventana y mostrarla
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraDescuentos();
    }
}

