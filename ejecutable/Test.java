package ejecutable;

import controlador.Controlador;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        PlanTelefonia miPlanTel = new PlanTelefonia(null, 0, 0, 0);
        Controlador miControlador = new Controlador(miVentana, miPlanTel);
    }    
}
