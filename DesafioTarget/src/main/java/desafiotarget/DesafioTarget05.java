package desafiotarget;

import javax.swing.JOptionPane;

/**
 *
 * @author Gilson
 */
public class DesafioTarget05 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        
        char[] nFrase = frase.toCharArray();
        int k = nFrase.length;
        char [] f = new char[k];
        int n = 0;
        StringBuilder g = new StringBuilder();
                           
            for(int i=k-1; i>=0; i--)
            {            
                 f[n] = nFrase[i];
                 n++;                        
                                    
             }             
        JOptionPane.showMessageDialog(null,"Frase invertida: " + g.append(f));                
    }
}
