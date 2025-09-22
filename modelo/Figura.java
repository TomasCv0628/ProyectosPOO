package Caso2Herencia.modelo;

public class Figura 
{
    protected double perimetro;
    protected double area;
    
    public Figura()
    {
        this.perimetro = 0;
        this.area = 0;
    }
    public double mostraArea()
    {
        return this.area;
    }
    public double mostrarPerimetro()
    {
        return this.perimetro;
    }
}
