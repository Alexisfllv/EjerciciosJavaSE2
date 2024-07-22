import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Laberinto extends JFrame implements ActionListener {

	JLabel[][] l;
	JButton b1, b2;
	boolean salida;

	Laberinto() {
		setLayout(null);
		l = new JLabel[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				l[i][j] = new JLabel();
				l[i][j].setBounds(20 + j * 20, 50 + i * 20, 20, 20);
				add(l[i][j]);
			}

		}

		b1 = new JButton("Recorrer");
		b1.setBounds(10, 300, 100, 25);
		add(b1);
		b1.addActionListener(this);

		b2 = new JButton("Crear");
		b2.setBounds(120, 300, 100, 25);
		add(b2);
		b2.addActionListener(this);

		//
		crear();
	}

	public void crear() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int a = (int) (Math.random() * 4);
				l[i][j].setForeground(Color.black);
				if (a == 0) {
					l[i][j].setText("1");
				} else {
					l[i][j].setText("0");
				}
			}
			l[9][9].setText("s");
			l[0][0].setText("0");
		}
	}

	public static void main(String[] args) {
		Laberinto la = new Laberinto();
		la.setBounds(0, 0, 300, 400);
		la.setVisible(true);
		la.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			salida = false;
			recorrer(0, 0);
			if (salida) {
				setTitle("tiene salida");
			}else {
				setTitle("no tiene salida");
			}
		}
		if (e.getSource() == b2) {
			crear();
		}

	}

	public void recorrer(int fil , int col) {
		if (fil >= 0 && fil < 10 && col >= 0 && col < 10 && salida == false) {
			if (l[fil][col].getText().equals("s")) {
				salida = true;
			}else if (l[fil][col].getText().equals("0")) {
				l[fil][col].setText("9");
				l[fil][col].setForeground(Color.red);
				recorrer(fil, col+1);
				recorrer(fil +1,col);
				recorrer(fil -1,col);
				recorrer(fil,col -1);
			}
		}
	}

}
