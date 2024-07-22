package lep;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SumaWindowBuilder {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldSum;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumaWindowBuilder window = new SumaWindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SumaWindowBuilder() {
        initialize();
    }

	private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textFieldNum1 = new JTextField();
        frame.getContentPane().add(textFieldNum1, BorderLayout.NORTH);
        textFieldNum1.setColumns(10);

        textFieldNum2 = new JTextField();
        frame.getContentPane().add(textFieldNum2, BorderLayout.CENTER);
        textFieldNum2.setColumns(10);

        JButton btnSumar = new JButton("Sumar");
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textFieldNum1.getText());
                int num2 = Integer.parseInt(textFieldNum2.getText());
                int sum = num1 + num2;

                textFieldSum.setText(Integer.toString(sum));
            }
        
        });
	}
}
