import javax.swing.JFrame;
import javax.swing.JLabel;

public class Problem extends JFrame{
	
	
	//
	private JLabel lb1,lb2;
	
	public Problem() {
		setLayout(null);
		lb1 = new JLabel("Sistema de facturacion");
		lb1.setBounds(10, 20, 300, 30);
		add(lb1);
		
		lb2 = new JLabel("Segunda version");
		lb2.setBounds(10,100,100,30);
		add(lb2);
	}
	
	public static void main(String [] args) {
		Problem pro = new Problem();
		pro.setBounds(0, 0, 300, 200);
		pro.setResizable(false);
		pro.setVisible(true);
		pro.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
