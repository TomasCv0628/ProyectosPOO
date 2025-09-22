package caso1Herencia.modelo;

public class Operacion
{
    protected double x;
    protected double y;
    protected double resultado;

    public Operacion(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.resultado = 0;
    }
    public double mostraResultado()
    {
        return this.resultado;
    }
}