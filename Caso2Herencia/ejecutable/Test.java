package Caso2Herencia.ejecutable;

import javax.swing.JOptionPane;

import Caso2Herencia.modelo.Circulo;
import Caso2Herencia.modelo.Rectangulo;

public class Test 
{
    public static void main(String[] args) 
    {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valorde la altura: "));

        Rectangulo miRectangulo = new Rectangulo();
        miRectangulo.calcularAreaPerimetro(base, altura);
        JOptionPane.showMessageDialog(null,"El area del rectangulo es " + miRectangulo.mostraArea() + " y su perimetro es " + miRectangulo.mostrarPerimetro());

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio: "));

        Circulo mCirculo = new Circulo();
        mCirculo.calcularAreaPerimetro(radio);
        JOptionPane.showMessageDialog(null,"El area del circulo es " + mCirculo.mostraArea() + " y su perimetro es " + mCirculo.mostrarPerimetro());
    }    
}
