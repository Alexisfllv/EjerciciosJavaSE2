import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cajero extends JFrame implements ActionListener{
	
	
	private JLabel lbl1,lbl2,lbl3;
	private JButton btn1;
	
	public Cajero() {
		setLayout(null);
		btn1 = new JButton("Activar simulacion");
		btn1.setBounds(10, 10, 180, 30);
		add(btn1);
		btn1.addActionListener(this);
		
		lbl1 = new JLabel ("Atendidos");
		lbl1.setBounds(10, 50, 300, 30);
		add(lbl1);
		lbl2=new JLabel("En Cola");
		lbl2.setBounds(10, 90, 300, 30);
		add(lbl2);
		lbl3 = new JLabel("Minuto de llegada");
		lbl3.setBounds(10, 130, 300, 30);
		add(lbl3);
	}

	
	public static void main(String [] args) {
		
		Cajero caj = new Cajero();
		caj.setBounds(0, 0, 340, 250);
		caj.setVisible(true);
		caj.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		//
		if (e.getSource()==btn1) {
			simulacion();
		}
		
	}
	
	//metodo
	public void simulacion() {
		
		
		int estado=0; //0 = desocupado
		int llegada = 2+(int)(Math.random()*2);
		int salida = -1;
		int cantdAtendidas =0;
		Cola cola = new Cola();
		
		for (int minuto = 0;  minuto< 600; minuto++) {
			if (llegada == minuto) {
				if (estado == 0) {
					estado=1;
					salida = minuto+2+(int)(Math.random()*3);
				}else {
					cola.insertar(minuto);
				}
				llegada = minuto+2+(int)(Math.random()*2);
			}
			if (salida == minuto) {
				estado =0;
				cantdAtendidas++;
				if (!cola.vacia()) {
					cola.extraer();
					estado=1;
					salida=minuto+2+(int)(Math.random()*3);
					
				}
			}
		}
		lbl1.setText("Atentidos : "+cantdAtendidas);
		lbl2.setText("En cola : "+cola.cantidad());
		lbl3.setText("Minuto de llegada : "+cola.extraer());
		
	}
	
}
