import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Area extends JFrame{

		
	private JTextField txt1;
	private JTextArea tarea1;
	private JScrollPane scr1;
	
	public Area() {
		setLayout(null);
		txt1 = new JTextField();
		txt1.setBounds(10, 10, 200, 30);
		add(txt1);
		
		tarea1 = new JTextArea();
		
		scr1 = new JScrollPane(tarea1);
		scr1.setBounds(10, 50, 400, 300);
		add(scr1);
		
	}
	
	
	public static void main(String [] args) {
		
		Area ar = new Area();
		ar.setBounds(0, 0, 540, 400);
		ar.setVisible(true);
		ar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ar.setResizable(false);
	}
}
