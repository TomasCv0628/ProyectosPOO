package mvc1_mayor_3_enteros.vista;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelResultados extends JPanel
{
    //------------------------- 
    // Atributos
    //-------------------------

private JTextArea taResultados;
private JScrollPane spResultado;

    //------------------------- 
    // Métodos
    //-------------------------


    // Metodo constructor

    public PanelResultados()
    {
        this.setLayout(null);
        this.setBackground(Color.white);

        // creacion y adicion de area de texto

        taResultados = new JTextArea();
        spResultado = new JScrollPane(taResultados);
        spResultado.setBounds(10,15,460,140);
        this.add(spResultado); 

        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");

        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);

        this.setBackground(Color.GRAY);
    }

    // metodos de acceso
    public void mostrarResultado(int mayor)
    {
        taResultados.append("\nEl numero mayor es: " + mayor);

    }
    // borrar
    public void borrar()
    {
        taResultados.setText("");
    }
}