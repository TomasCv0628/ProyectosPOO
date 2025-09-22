package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNum;
    private JLabel lbOpe;
    private JTextField txNum;
    private JTextField txOpe;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.GRAY);

        lbNum = new JLabel("Numero: ");
        lbNum.setBounds(30,50,100,20);
        this.add(lbNum);

        txNum = new JTextField();
        txNum.setBounds(130,50,170,20);
        this.add(txNum);

        lbOpe = new JLabel("Operador: ");
        lbOpe.setBounds(30,80,100,20);
        this.add(lbOpe);

        txOpe = new JTextField();
        txOpe.setBounds(130,80,170,20);
        this.add(txOpe);
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }
    public String getOpe()
    {
        return txOpe.getText();
    }
    public String getNum()
    {
        return txNum.getText();
    }
}
