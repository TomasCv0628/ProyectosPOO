package vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class DialogoCrear extends JDialog 
{
    public JButton btCrearAhorro;
    public JButton btCrearCorriente;
    public JButton btCrearLibreta;

    
    public DialogoCrear()
    {
        btCrearAhorro = new JButton("Cuenta de ahorro");
        btCrearAhorro.setBounds(50,20,200,20);
        this.add(btCrearAhorro);

        btCrearCorriente = new JButton("Cuenta corriente");
        btCrearCorriente.setBounds(50,50,200,20);
        this.add(btCrearCorriente);

        btCrearLibreta = new JButton("Cuenta libreta");
        btCrearAhorro.setBounds(50,70,200,20);
        this.add(btCrearAhorro);

        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#eac435"));
        this.setTitle("Agregar Libro de Colección");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
        public void agregarOyenteBoton(ActionListener al) 
        {
            btCrearAhorro.addActionListener(al);
            btCrearCorriente.addActionListener(al);
            btCrearLibreta.addActionListener(al);
            
        }
        public void cerrarDialogoAgregarJugador() 
        {
            this.dispose();
        }
}
