package modelo;

public class FechaDetallada extends Fecha
{
    public FechaDetallada(int d, int m, int a)
    {   
        super(d,m,a);
    }
    String[] meses = {"enero" , "febrero","marzo", "abril", "mayo", "junio", "julio","agosto","septiembre","octubre","noviembre","diciembre"};
    @Override
    public String toString()
    {
        return "Fecha: "+ dia + " de " + meses[mes - 1] + " de " +annio;
    }

}
