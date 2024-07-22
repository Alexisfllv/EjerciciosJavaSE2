import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario extends JFrame{

	private JLabel label1;
	
	private Formulario() {
		setLayout(null);
		label1 = new JLabel("Hola mundo");
		label1.setBounds(10, 20, 200, 30);
		add(label1); 
	}
	public static void main(String [] args) {
		
		//
		Formulario form = new Formulario();
		form.setBounds(10, 20, 300, 400);
		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
}
