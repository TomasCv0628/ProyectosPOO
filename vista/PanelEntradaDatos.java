package vista;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.Color;


public class PanelEntradaDatos extends JPanel
{
    private JLabel titulo;
    public JComboBox cbMunicipios;
    public JList listaMunicipios;
    public JRadioButton geografico;
    public JRadioButton cultural;
    public JRadioButton otros;

    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(Color.decode("#A2B38B"));

        titulo = new JLabel("JET");
        titulo.setBounds(125,30,50,20);
        this.add(titulo);

        String[] municip= {"Aguada" ,"Albania","Aratoca","Barbosa","Barichara","Barrancabermeja","Betulia","Bolívar","Bucaramanga","Cabrera","California","Capitanejo","Carcasí","Cepitá","Cerrito","Charalá","Charta","Chima","Cimitarra","Concepción","Confines","Contratación","Coromoro","Curití","El Carmen de Chucurí","El Guacamayo","El Peñón","El Playón","Encino","Enciso","Florián","Floridablanca","Galán","Gámbita","Girón","Guaca","Guadalupe","Güespa","Hato","Jesús María","Jordán","La Belleza","La Paz","Landázuri","Lebrija","Los Santos","Macaravita","Malaga","Matanza","Mogotes","Molagavita","Ocamonte","Oiba","Onzaga","Palmar","Palmas del Socorro","Páramo","Piedecuesta","Pinchote","Puente Nacional","Puerto Parra","Puerto Wilches","Rionegro","Sabana de Torres","San Andrés","San Benito","San gil","San Joaquín","San José de Miranda","San Miguel","San Vicente de Chucurí","Santa Bárbara","Santa Helena del Opón","Simacota","Socorro","Suaita","Sucre","Suratá","Tona","Valle de San José","Vélez","Vetas","Villanueva","Zapatoca"};
        listaMunicipios = new JList(municip);

        cbMunicipios = new JComboBox<>(municip);
        cbMunicipios.setBounds(65,80,150,20);
        this.add(cbMunicipios);

        geografico = new JRadioButton("Datos Geograficos");
        geografico.setBounds(50,120,180,30);
        add(geografico);

        cultural = new JRadioButton("Datos Culturales");
        cultural.setBounds(50,150,180,30);

        add(cultural);

        otros = new JRadioButton("Informacion Relevante");
        otros.setBounds(50,180,180,30);
        add(otros);

        
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
}
