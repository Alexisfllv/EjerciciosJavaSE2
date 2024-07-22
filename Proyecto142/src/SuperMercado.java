import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SuperMercado extends JFrame implements ActionListener {

	private JLabel lbl1, lbl2, lbl3;
	private JButton btn1;

	public SuperMercado() {
		setLayout(null);
		btn1 = new JButton("Activar Simulacion");
		btn1.setBounds(10, 10, 180, 30);
		add(btn1);
		btn1.addActionListener(this);

		lbl1 = new JLabel("Clientes Atendidos : ");
		lbl1.setBounds(10, 50, 400, 30);
		add(lbl1);
		lbl2 = new JLabel("Clientes sin hacer compras : ");
		lbl2.setBounds(10, 90, 400, 30);
		add(lbl2);
		lbl3 = new JLabel("Tiempo promedio en cola ");
		lbl3.setBounds(10, 130, 400, 30);
		add(lbl3);
	}

	public static void main(String[] args) {

		SuperMercado sp = new SuperMercado();
		sp.setBounds(0, 0, 390, 250);
		sp.setVisible(true);
		sp.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// metodo de btn
		if (e.getSource() == btn1) {
			simulacion();
		}

	}

	public void simulacion() {
		int estado1 = 0, estado2 = 0, estado3 = 0;
		int marchan = 0;
		int atencion1 = 0;
		int atencion2 = 0;
		int atencion3 = 0;
		int llegada = 2 + (int) (Math.random() * 2);
		int salida1 = -1;
		int salida2 = -1;
		int salida3 = -1;
		int tiempoCola = 0;
		int cantidadCola = 0;

		Cola cola1 = new Cola();
		Cola cola2 = new Cola();
		Cola cola3 = new Cola();

		for (int minuto = 0; minuto < 480; minuto++) {
			if (llegada == minuto) {
				if (estado1 ==0) {
					estado1 = 1;
					salida1= minuto+7+(int)(Math.random()*5);
				}else {
					if (estado2 == 0) {
						estado2 = 1;
						salida2 = minuto+7+(int)(Math.random()*5);
					}else {
						if (estado3==0) {
							estado3=1;
							salida3=minuto+7+(int)(Math.random()*5);
						}else {
							if (cola1.cantidad()==6 && cola2.cantidad()==6 && cola3.cantidad()==6){
								marchan ++;
							}else {
								if (cola1.cantidad()< cola2.cantidad()&&cola1.cantidad() < cola3.cantidad()) {
									cola1.insertar(minuto);
								}else {
									if (cola2.cantidad()< cola3.cantidad()) {
										cola2.insertar(minuto);
									}else {
										cola3.insertar(minuto);
									}
								}
							}
						}
					}
				}
				
				//
				llegada = minuto+2+(int)(Math.random()*2);
			}
			if (salida1 == minuto) {
				atencion1++;
				estado1=0;
				if (!cola1.vacia()) {
					estado1=1;
					salida1=minuto+7+(int)(Math.random()*5);
					int m = cola1.extraer();
					tiempoCola= tiempoCola+(minuto-m);
					cantidadCola++;
				}
			}
			if (salida2 == minuto) {
				atencion2++;
				estado2=0;
				if (!cola1.vacia()) {
					estado2=1;
					salida2=minuto+7+(int)(Math.random()*5);
					int m = cola2.extraer();
					tiempoCola= tiempoCola+(minuto-m);
					cantidadCola++;
				}
			}
			if (salida3 == minuto) {
				atencion3++;
				estado3=0;
				if (!cola3.vacia()) {
					estado3=1;
					salida3=minuto+7+(int)(Math.random()*5);
					int m = cola3.extraer();
					tiempoCola= tiempoCola+(minuto-m);
					cantidadCola++;
				}
			}
		}
		
		//
		lbl1.setText("Clientes atentidos : caja1 :  " +atencion1+" Caja2 : "+atencion2 + " Caja 3 : "+atencion3  );
		lbl2.setText("Se marchan sin hacer compras : "+ marchan);
		int prom = tiempoCola / cantidadCola;
		lbl3.setText("Promedio en cola : "+prom);

	}
}
