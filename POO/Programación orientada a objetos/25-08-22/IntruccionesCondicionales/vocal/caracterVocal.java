package vocal;

import javax.swing.JOptionPane;

public class caracterVocal
{
    public static void main(String[] args) 
    {
        // Variables
        char x;
        // input

        x = JOptionPane.showInputDialog("Ingrese un carácter: ").charAt(0);

        // processing
        if (x == 'a' || x == 'e'||x == 'i'||x == 'o'||x == 'u'||x == 'A' || x == 'E'||x == 'I'||x == 'O'||x == 'U')
        {
            JOptionPane.showMessageDialog(null,x + " Si es una vocal");
        }
        else
        {
            JOptionPane.showMessageDialog(null,x + " No es una vocal");
        }

        //End
        System.exit(0);
    }
}
