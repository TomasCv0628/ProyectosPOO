package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    
    private JLabel lbNombre;
    private JTextField tfNombre;
    private JLabel lbPos;
    private JTextField tfPos;
    private JLabel lbImagen;
    public JComboBox cbNombre;
    private ImageIcon iImagen;
    public JList listaNombres;


    public PanelEntradaDatos()
    {
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        
        iImagen = new ImageIcon(getClass().getResource("/vista/empresa.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,150,150);
        this.add(lbImagen);


        lbNombre = new JLabel("Empleado: ");
        lbNombre.setBounds(170, 40,90,20);
        this.add(lbNombre);

        tfNombre = new JTextField();
        tfNombre.setBounds(260, 40, 100, 20);
        this.add(tfNombre);

        lbPos = new JLabel("Posicion: ");
        lbPos.setBounds(170,70,90,20);
        this.add(lbPos);

        tfPos = new JTextField();
        tfPos.setBounds(260,70,100,20);
        this.add(tfPos);
        

        String[] nombres= {"Juan Patiño", "Oscar Carreño", "Edgar Quiroga", "Theo Gutierres", "Tomas Castro","Pablo Angarita","Pedro Fajardo","Sebastian Rueda","Lucia Jimenez","Martha Porras"};
        listaNombres = new JList(nombres);

        cbNombre = new JComboBox<>(nombres);
        cbNombre.setBounds(200,100,150,20);
        this.add(cbNombre);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    public String getNombre()
    {
        return tfNombre.getText();
    }
    public String getPos()
    {
        return tfPos.getText();
    }

}
