import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class Formula extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formula frame = new Formula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(180, 122, 233, 52);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton btn = new JButton("Aceptar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				///
				
				if (balanceada()) {
					setTitle("Correcto");
				}else {
					setTitle("Esta mal");
				}
			}
		});
		btn.setBounds(191, 214, 85, 21);
		contentPane.add(btn);
	}
	
	//
	public boolean balanceada() {
		Stack<Character> p1 = new Stack<Character>();
		String cadena = tf1.getText();
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == '(' || cadena.charAt(i)== '[' || cadena.charAt(i) == '{') {
				p1.push(cadena.charAt(i));
			}else {
				if (cadena.charAt(i) == ')' || cadena.charAt(i)== ']' || cadena.charAt(i) == '}') {
					//
					if (p1.empty()) {
						return false;
					}else {
						if (cadena.charAt(i)== ')' && p1.pop() != '(') {
							return false;
						}else {
							if (cadena.charAt(i)== ']' && p1.pop() != '[') {
								return false;
							}else {
								if (cadena.charAt(i)== '}' && p1.pop() != '{') {
									return false;
								}
							}
						}
					}
				}
			}
		}
		
		if (p1.empty()) {
			return true;
		}else {
			return false;
		}
	}
}
