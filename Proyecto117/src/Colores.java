import javax.swing.JFrame;
import javax.swing.JLabel;

public class Colores extends JFrame{
	private JLabel lb1,lb2,lb3;
	public Colores() {
		
		lb1 = new JLabel("Azul");
		
		lb1.setBounds(50, 0, 400, 600);
		add(lb1);

		lb2 = new JLabel("Rojo");
		lb2.setBounds(10, 60, 400, 600);
		add(lb2);
		
		lb3 = new JLabel("Verde");
		lb3.setBounds(10, 100, 400, 600);
		add(lb3);
		setLayout(null);
		
	}
	

	public static void main(String[] args) {
	
		//
		Colores col = new Colores();
		col.setBounds(0, 0, 400, 600);
		col.setResizable(false);
		col.setVisible(true);
		col.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}
