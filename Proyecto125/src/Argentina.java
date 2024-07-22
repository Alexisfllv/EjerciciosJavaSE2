import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Argentina extends JFrame implements ActionListener{

	private JTextArea area1;
	private JButton btn1;
	private JScrollPane croll1;
	
	
	public Argentina() {
		setLayout(null);
		
		area1 = new JTextArea();
		
		croll1 = new JScrollPane(area1);
		croll1.setBounds(10, 10, 300, 200);
		add(croll1);
	
		btn1 = new JButton("Probar");
		btn1.setBounds(10, 260, 100, 30);
		add(btn1);
		btn1.addActionListener(this);
		
	}
	
	public static void main(String [] args) {
		Argentina arg = new Argentina();
		arg.setBounds(0, 0, 400, 380);
		arg.setVisible(true);
		arg.setResizable(false);
		arg.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String texto = area1.getText();
		if (e.getSource()==btn1) {
			if (texto.indexOf("Argentina")==-1) {
				setTitle("No se encuentra el texto Argentina");
			}else {
				setTitle("Si se encuentra el texto");
			}
		}
	}
}
