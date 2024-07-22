import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Formulario  extends JFrame implements ActionListener{

	private JTextField txt1;
	private JButton btn1;
	
	public Formulario() {
		setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 20, 300, 40);
		add(txt1);
		
		btn1 = new JButton("Procesar");
		btn1.setBounds(10, 60, 100, 40);
		add(btn1);
		
		btn1.addActionListener(this);
		
		
	}
	
	
	public static void main(String [] args) {
		Formulario fr = new Formulario();
		fr.setBounds(0, 0, 400, 600);
		fr.setVisible(true);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//
		if (e.getSource()==btn1) {
			if (balanceada()) {
				setTitle("Formula Correcta");
			}else {
				setTitle("Formula Incorecta");
			}
			
		}
		
	}
	
	//Proceso
	
	public boolean balanceada() {
		String cadena = txt1.getText();
		Pila pila = new Pila();
		
		//recorrer texto
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)=='(' || cadena.charAt(i)=='['|| cadena.charAt(i)=='{') {
				//
				pila.insertar(cadena.charAt(i));
				
			}else {
				if (cadena.charAt(i)==')') {
					if (pila.extarer()!='(') {
						return false;
					}
				}else {
					if (cadena.charAt(i)==']') {
						if (pila.extarer()!='[') {
							return false;
						}
						
					}else {
						if (cadena.charAt(i)=='}') {
								if (pila.extarer()!='{') {
									return false;
								}
							
						}
					}
				}
			}
			
		}
		
		//
		if (pila.vacia()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
