package desafiotarget;

import javax.swing.JOptionPane;

/**
 *
 * @author Gilson
 */
public class DesafioTarget02 {
    
    static long Sequencia(int x){
        if (x<2){
            return x;
        }
        else return Sequencia(x-1) + Sequencia(x-2);
    }
       
   public static void main(String[] args){
       
       int numero = 0;
       boolean condicao = false;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
       
      
       
       for (int i = 0; Sequencia(i)<=numero;i++){
           
           System.out.println(Sequencia(i)+"\t");
           if(Sequencia(i)==numero){
                JOptionPane.showMessageDialog(null,"O número: " + numero + " pertence a sequência de Fibonacci");
                condicao = true;
                break;
           }            
       }  
      if(condicao!=true){
          JOptionPane.showMessageDialog(null,"O número: " + numero + " não pertence a sequência de Fibonacci");
      }
       
   }    
}
