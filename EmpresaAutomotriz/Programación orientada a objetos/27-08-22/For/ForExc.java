package For;

import javax.swing.JOptionPane;

public interface ForExc {
    public static void main(String[] args) {
        // Variables 
        
        int n;
        int z;
        // Input

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de numeros a sumar: "));

        // Processing
        
        z = 0;
        for(int i = 1; i <= n; i++)
        {
            z = z + i;

        }
        JOptionPane.showMessageDialog(null,"La suma de los " + n + " primeros numeros es:" + z);
        System.exit(0);
    }
}
