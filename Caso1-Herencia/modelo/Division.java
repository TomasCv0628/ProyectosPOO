package caso1Herencia.modelo;

public class Division extends Operacion
{
    public Division(double x, double y)
    {
        super(x, y);
    }    
    public void dividir()
    {
        resultado = (x / y);
    }
}
