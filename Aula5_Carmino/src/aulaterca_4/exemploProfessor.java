package aulaterca_4;

import javax.swing.JOptionPane;

public class exemploProfessor {
    public static void main(String[] args) {
          
        float a; 

        a = Float.parseFloat(JOptionPane.showInputDialog("informe sua nota: ")); 

        if (a >= 7) { 

            JOptionPane.showMessageDialog(null, "Resultado: Aprovado"); 

        } else if (a >= 5 && a <= 7) { 

            JOptionPane.showMessageDialog(null, "Resultado: Recuperação"); 

        } else { 

            JOptionPane.showMessageDialog(null, "Resultado: Reprovado"); 

        } 

    } 

} 
