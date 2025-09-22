package controlador;

import vista.VentanaPrincipal;
import modelo.Reader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin)
    {
        this.venPrin = pVenPrin;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("buscar"))
        {
            venPrin.crearDialogoSec();
            String municipio = (String)this.venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem();
            venPrin.miDialogoSec.mostrarNombreMunicip(municipio);
            this.venPrin.miDialogoSec.agregarOyenteBoton(this);
        }
        if(comando.equals("atras"))
        {
            JOptionPane.showMessageDialog(null,"Regresando a la ventana principal" );
            this.venPrin.miDialogoSec.cerrarDialogoSec();
        }
        
        if(this.venPrin.miPanelEntradaDatos.geografico.isSelected())
        {
            Reader a = new Reader();
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"/Escritorio/ProyectoFinal2/municipios/"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"/1.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"/Desktop/ProyectoFinal2/municipios/"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"/1.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"\\Desktop\\ProyectoFinal2\\"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"\\1.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"\\Escritorio\\ProyectoFinal2\\"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"\\1.txt"));
    
        } 
        if(this.venPrin.miPanelEntradaDatos.cultural.isSelected())
        {
            Reader a = new Reader();
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"/Escritorio/ProyectoFinal2/municipios/"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"/2.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"/Desktop/ProyectoFinal2/municipios/"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"/2.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"\\Desktop\\ProyectoFinal2\\"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"\\2.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"\\Escritorio\\ProyectoFinal2\\"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"\\2.txt"));
        
        }
        if(this.venPrin.miPanelEntradaDatos.otros.isSelected())
        {
            Reader a = new Reader();
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"/Escritorio/ProyectoFinal2/municipios/"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"/3.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"/Desktop/ProyectoFinal2/municipios/"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"/3.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"\\Desktop\\ProyectoFinal2\\"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"\\3.txt"));
            venPrin.miDialogoSec.mostrarResultado(a.leerTxt(System.getProperty("user.home")+"\\Escritorio\\ProyectoFinal2\\"+ venPrin.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"\\3.txt"));
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}
