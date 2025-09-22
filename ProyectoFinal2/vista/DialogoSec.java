package vista;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;

public class DialogoSec extends JDialog
{
        //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreMunicipio;
    private JTextArea taInfo;
    private JScrollPane spInfo;
    private JButton btSalir;
    private JButton btAtras;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    //----------------------
    // Metodos
    //----------------------
    public DialogoSec()
    {
        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#EDE6DB"));

        /* 
        iImagen = new ImageIcon(getClass().getResource("/vista/Elsocorro.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        */
        
        lbNombreMunicipio = new JLabel();
        lbNombreMunicipio.setBounds(250,50,100,20);
        this.add(lbNombreMunicipio);

        taInfo = new JTextArea();
        spInfo = new JScrollPane(taInfo);
        spInfo.setBounds(10,150,380,350);
        this.add(spInfo);

        btSalir = new JButton("Salir");
        btSalir.setBounds(20,520,70,30);  
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        btAtras = new JButton("Atras");
        btAtras.setBounds(210,520,100,30);
        btAtras.setActionCommand("atras");
        this.add(btAtras);

        this.setTitle("J.E.T");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);    
    }        
    public void agregarOyenteBoton(ActionListener pAL)
    {
        btSalir.addActionListener(pAL);
        btAtras.addActionListener(pAL);
    }
    public void cerrarDialogoSec()
    {
        this.dispose();
    }
    public void mostrarResultado(String msj)
    {
        taInfo.append(msj+"\n");
    }
    public void mostrarNombreMunicip(String msj)
    {
        lbNombreMunicipio.setText(msj);

    }
}
