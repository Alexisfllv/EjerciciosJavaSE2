import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Minas extends JFrame implements ActionListener
{
    JButton [] [] bot;
    JButton b1;
    Minas ()
    {
        setLayout (null);
        bot = new JButton [10] [10];
        for (int f = 0 ; f < 10 ; f++)
        {
            for (int c = 0 ; c < 10 ; c++)
            {
                bot [f] [c] = new JButton ("0");
                bot [f] [c].setBounds (20 + c * 41, 50 + f * 41, 41, 41);
                bot [f] [c].setBackground (Color.lightGray);
                bot [f] [c].setForeground (Color.lightGray);
                bot [f] [c].addActionListener (this);
                add (bot [f] [c]);
            }
        }
        b1 = new JButton ("Reiniciar");
        b1.setBounds (20, 470, 100, 30);
        add (b1);
        b1.addActionListener (this);
        disponerBombas ();
        contarBombasPerimetro ();
    }


    void disponerBombas ()
    {
        int cantidad = 10;
        do
        {
            int fila = (int) (Math.random () * 10);
            int columna = (int) (Math.random () * 10);
            if (bot [fila] [columna].getText ().equals ("b") == false)
            {
                bot [fila] [columna].setText ("b");
                cantidad--;
            }
        }
        while (cantidad != 0);
    }


    void contarBombasPerimetro ()
    {
        for (int f = 0 ; f < 10 ; f++)
        {
            for (int c = 0 ; c < 10 ; c++)
            {
                if (bot [f] [c].getText ().equals ("0") == true)
                {
                    int cant = contarCoordenada (f, c);
                    bot [f] [c].setText (String.valueOf (cant));
                }
            }
        }
    }


    int contarCoordenada (int fila, int columna)
    {
        int total = 0;
        if (fila - 1 >= 0 && columna - 1 >= 0)
        {
            if (bot [fila - 1] [columna - 1].getText ().equals ("b") == true)
            total++;
        }
        if (fila - 1 >= 0)
        {
            if (bot [fila - 1] [columna].getText ().equals ("b") == true)
            total++;
        }
        if (fila - 1 >= 0 && columna + 1 < 10)
        {
            if (bot [fila - 1] [columna + 1].getText ().equals ("b") == true)
            total++;
        }
    
        if (columna + 1 < 10)
        {
            if (bot [fila] [columna + 1].getText ().equals ("b") == true)
            total++;
        }
        if (fila + 1 < 10 && columna + 1 < 10)
        {
            if (bot [fila + 1] [columna + 1].getText ().equals ("b") == true)
            total++;
        }
    
        if (fila + 1 < 10)
        {
            if (bot [fila + 1] [columna].getText ().equals ("b") == true)
            total++;
        }
        if (fila + 1 < 10 && columna - 1 >= 0)
        {
            if (bot [fila + 1] [columna - 1].getText ().equals ("b") == true)
            total++;
        }
        if (columna - 1 >= 0)
        {
            if (bot [fila] [columna - 1].getText ().equals ("b") == true)
            total++;
        }
        return total;

    }


    void desactivarJuego ()
    {
        for (int f = 0 ; f < 10 ; f++)
        {
            for (int c = 0 ; c < 10 ; c++)
            {
                bot [f] [c].setEnabled (false);
            }
        }
    }


    void reiniciar ()
    {
        setTitle ("");
        for (int f = 0 ; f < 10 ; f++)
        {
            for (int c = 0 ; c < 10 ; c++)
            {
                bot [f] [c].setText ("0");
                bot [f] [c].setEnabled (true);
                bot [f] [c].setBackground (Color.lightGray);
                bot [f] [c].setForeground (Color.lightGray);
            }
        }
        disponerBombas ();
        contarBombasPerimetro ();
    }


    public void actionPerformed (ActionEvent e)
    {
        if (e.getSource () == b1)
        {
            reiniciar ();
        }
        for (int f = 0 ; f < 10 ; f++)
        {
            for (int c = 0 ; c < 10 ; c++)
            {
            if (e.getSource () == bot [f] [c])
            {
                if (bot [f] [c].getText ().equals ("b") == true)
                {
                    setTitle ("Boooooooooooooomm");
                    desactivarJuego ();
                }
                else
                if (bot [f] [c].getText ().equals ("0") == true)
                {
                    recorrer (f, c);
                }
                else
                    if (bot [f] [c].getText ().equals ("1") == true ||
                        bot [f] [c].getText ().equals ("2") == true ||
                        bot [f] [c].getText ().equals ("3") == true ||
                        bot [f] [c].getText ().equals ("4") == true ||
                        bot [f] [c].getText ().equals ("5") == true ||
                        bot [f] [c].getText ().equals ("6") == true ||
                        bot [f] [c].getText ().equals ("7") == true ||
                        bot [f] [c].getText ().equals ("8") == true)
                    {
                        bot [f] [c].setBackground (Color.yellow);
                        bot [f] [c].setForeground (Color.black);
                    }
            }
            }
        }
        verificarTriunfo ();
    }


    void verificarTriunfo ()
    {
        int cant = 0;
        for (int f = 0 ; f < 10 ; f++)
        {
            for (int c = 0 ; c < 10 ; c++)
            {
                Color col = bot [f] [c].getBackground ();
                if (col == Color.yellow)
                    cant++;
            }
        }
        if (cant == 90)
        {
            setTitle ("Ganooooooooo");
            desactivarJuego ();
        }
    }


    void recorrer (int fil, int col)
    {
        if (fil >= 0 && fil < 10 && col >= 0 && col < 10)
        {
            if (bot [fil] [col].getText ().equals ("0"))
            {
                bot [fil] [col].setText (" ");
                bot [fil] [col].setBackground (Color.yellow);
                recorrer (fil, col + 1);
                recorrer (fil, col - 1);
                recorrer (fil + 1, col);
                recorrer (fil - 1, col);
                recorrer (fil - 1, col - 1);
                recorrer (fil - 1, col + 1);
                recorrer (fil + 1, col + 1);
                recorrer (fil + 1, col - 1);
            }
            else
                if (bot [fil] [col].getText ().equals ("1") == true ||
                    bot [fil] [col].getText ().equals ("2") == true ||
                    bot [fil] [col].getText ().equals ("3") == true ||
                    bot [fil] [col].getText ().equals ("4") == true ||
                    bot [fil] [col].getText ().equals ("5") == true ||
                    bot [fil] [col].getText ().equals ("6") == true ||
                    bot [fil] [col].getText ().equals ("7") == true ||
                    bot [fil] [col].getText ().equals ("8") == true)
                {
                    bot [fil] [col].setBackground (Color.yellow);
                    bot [fil] [col].setForeground (Color.black);
                }
        }
    }

    public static void main (String [] ar)
    {
        Minas m = new Minas ();
        m.setBounds (0, 0, 470, 600);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}