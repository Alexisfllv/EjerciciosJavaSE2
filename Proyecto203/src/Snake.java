import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Snake extends JFrame implements KeyListener, Runnable {

	//
	private enum Direccion {
		IZQUIERDA, DERECHA, SUBE, BAJA;
	}

	class Punto {
		int x, y;

		public Punto(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private LinkedList<Punto> ls = new LinkedList<Punto>();

	private int columna, fila; // columna y fila donde se encuentra la cabeza del snake
	private int colFruta, filFruta; // Columa y fila de la fruta
	private boolean activo = true; // juego activo o desactivado
	private Direccion direccion = Direccion.DERECHA;
	private Thread hilo; // Hilo para iniciar a coser
	private int crecimiento = 0; // indica la cantidad de cuadrados que debe crecer
	private Image imagen; // para evitar el parpadeo de la imagen
	private Graphics bufferGraphics; // dibujar en memoria

	public Snake() {
		addKeyListener(this);
		ls.add(new Punto(4, 25));
		ls.add(new Punto(3, 25));
		ls.add(new Punto(2, 25));
		ls.add(new Punto(1, 25));

		// la columna y fila de la vibora
		columna = 4;
		fila = 25;

		// generamos las coords de la fruta
		colFruta = (int) (Math.random() * 50);
		filFruta = (int) (Math.random() * 50);

		// creamos el hilo
		hilo = new Thread(this);
		hilo.start();

	}

	// LANZAMIENTO DEL HILO
	@Override
	public void run() {

		while (activo) {
			try {
				Thread.sleep(100);

				switch (direccion) {
				case DERECHA:
					columna++;
					break;
				case IZQUIERDA:
					columna--;
					break;

				case SUBE:
					fila--;
					break;
				case BAJA:
					fila++;
					break;

				}

				repaint();
				sePisa();

				// Insertar la coordenada de la cabeza en la lista

				ls.addFirst(new Punto(columna, fila));
				if (this.verificarComeFruta() == false && crecimiento == 0) {

					// si no estamos en la coordenada de la fruta y no debe crecer el snake borra el
					// ultimo nodo de la lista
					ls.remove(ls.size() - 1);
				} else {
					// si crecimiento es mayor a 0 , debemos hacer crecer la vibora

					if (crecimiento > 0) {
						crecimiento--;
					}
				}

				veririficarFin();

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	// metodos

	private void sePisa() {
		for (Punto punto : ls) {
			if (punto.x == columna && punto.y == fila) {
				activo = false;
				setTitle("Perdiste");
			}
		}
	}

	private void veririficarFin() {
		if (columna < 0 || columna >= 50 || fila < 0 || fila >= 50) {
			activo = false;
			setTitle("Chocaste con una pared");
		}
	}

	private boolean verificarComeFruta() {
		if (columna == colFruta && fila == filFruta) {
			crecimiento = 1;
			// generamos las coords de la fruta
			colFruta = (int) (Math.random() * 50);
			filFruta = (int) (Math.random() * 50);
			return true;
		} else {
			return false;
		}
	}

	public void paint(Graphics g) {
		super.paint(g);

		if (!ls.isEmpty()) {
			if (imagen == null) {
				imagen = createImage(this.getSize().width, this.getSize().height);
				bufferGraphics = imagen.getGraphics();
			}
			// borramos la imagen de memoria
			bufferGraphics.clearRect(0, 0, getSize().width, getSize().height);

			// dibujamos el cuadrado rojo
			bufferGraphics.setColor(Color.RED);
			bufferGraphics.drawRect(20, 50, 500, 500);

			// dibujamos vibora
			for (Punto punto : ls) {
				bufferGraphics.fillRect(punto.x * 10 + 20, 50 + punto.y * 10, 8, 8);
			}

			// dibujar fruta

			bufferGraphics.setColor(Color.BLUE);
			bufferGraphics.fillRect(colFruta * 10 + 20, filFruta * 10 + 50, 8, 8);
			g.drawImage(imagen, 0, 0, this);
		}
	}

	public static void main(String[] args) {

		//
		Snake sk = new Snake();
		sk.setBounds(0, 0, 600, 600);
		sk.setVisible(true);
		sk.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	//

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			direccion = direccion.DERECHA;
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			direccion = direccion.IZQUIERDA;
		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			direccion = direccion.SUBE;
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			direccion = direccion.BAJA;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
