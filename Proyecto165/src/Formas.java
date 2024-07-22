import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Formas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formas frame = new Formas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	
	//
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		
		// Cuerpo
        g.setColor(new Color(180, 225, 225));
        g.fillOval(200, 100, 400, 400);
        
        // Cabello
        URL url = getClass().getResource("miku-hair.png");
        Image img = Toolkit.getDefaultToolkit().getImage(url);
        g.drawImage(img, 200, 100, 400, 400, this);
        
        // Ojos
        g.setColor(new Color(50, 50, 50));
        g.fillOval(300, 200, 100, 100);
        g.fillOval(500, 200, 100, 100);
        g.setColor(new Color(250, 250, 250));
        g.fillOval(320, 220, 60, 60);
        g.fillOval(520, 220, 60, 60);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(350, 250, 20, 20);
        g.fillOval(550, 250, 20, 20);
        
        // Boca
        g.setColor(new Color(255, 120, 120));
        g.fillArc(350, 350, 200, 100, 180, 180);
        g.setColor(new Color(250, 250, 250));
        g.fillOval(377, 365, 50, 20);
        g.fillOval(477, 365, 50, 20);
        
        // Texto
        g.setColor(new Color(0, 0, 0));
        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);
        g.drawString("Hatsune Miku", 270, 80);
	}

}
