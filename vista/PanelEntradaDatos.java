package mvc1_mayor_3_enteros.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;


import java.awt.Color;
import java.awt.Font;
public class PanelEntradaDatos extends JPanel
{
    // Atributos

    private JLabel lbTitulo;
    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfz;



    // Metodo constructor

    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(Color.white);

        // crear y agregar etiqueta para titulo

        lbTitulo = new JLabel("Mayor de 3 enteros",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setBounds(0,10,480,20);
        this.add(lbTitulo);

        // Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.GRAY);
        this.setBorder(borde);

        lbX = new JLabel("X = ");
        lbX.setFont(new Font("Arial", Font.BOLD, 20));
        lbX.setBounds(0,50,50,50);
        this.add(lbX);
        lbX.setForeground(Color.CYAN);
        tfx = new JTextField();
        tfx.setBounds(50,70,90,15);
        tfx.setBackground(Color.GRAY);
        tfx.setForeground(Color.WHITE);
        this.add(tfx);

        // crear y agregar etiqueta para Y

        lbY = new JLabel("Y = ");
        lbY.setFont(new Font("Arial", Font.BOLD, 20));
        lbY.setBounds(0,100,50,50);
        lbY.setForeground(Color.CYAN);
        this.add(lbY);
        tfy = new JTextField();
        tfy.setBounds(50,120,90,15);
        tfy.setBackground(Color.GRAY);
        tfy.setForeground(Color.WHITE);
        this.add(tfy);

        // crear y agregar etiqueta para Z

        lbZ = new JLabel("Z = ");
        lbZ.setFont(new Font("Arial", Font.BOLD, 20));
        lbZ.setBounds(0,150,50,50);
        lbZ.setForeground(Color.CYAN);
        this.add(lbZ);
        tfz = new JTextField();
        tfz.setBounds(50,170,90,15);
        tfz.setBackground(Color.GRAY);
        tfz.setForeground(Color.WHITE);
        this.add(tfz);                
    }

    // metodos

    public String getTfx()
    {
        return tfx.getText();
    }

    public String getTfy()
    {
        return tfy.getText();
    }
            
    public String getTfz()
    {
        return tfz.getText();
    }

    // Metodo Borrar caja de texto

    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
        tfz.setText("");
    }

}
