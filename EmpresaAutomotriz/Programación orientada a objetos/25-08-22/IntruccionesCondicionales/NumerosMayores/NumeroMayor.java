package NumerosMayores;

import javax.swing.JOptionPane;

public class NumeroMayor {

    public static void main(String[] args) 
    {
        // Dados dos numeros enteros diferentes devolver el mayor
        // Variaables
        int x;
        int y;

        // intput
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese es primer número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese es segundo número: "));

        // processing

        if(x > y)
        {
            JOptionPane.showMessageDialog(null,x + " es mayor que " + y);
        }
        else
        {
            JOptionPane.showMessageDialog(null,y + " es mayor que " + x);
        }

        // end
        
        System.exit(0);
    }

}

