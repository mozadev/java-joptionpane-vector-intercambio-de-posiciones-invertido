package posicion;

import javax.swing.JOptionPane;

public class posicion {

    public static void main(String[] args) {

        int num;
        String arreglointercambiado = "";

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));

        int[] notas = new int[num];
         int[] intercambiado = new int[num];
        

        for (int i = 0; i < notas.length; i++) {

            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor[" + i + "]"));

        }

        // intercambio 
        for (int i = 0; i < notas.length; i++) {
            intercambiado[i]=notas[notas.length-1-i];
            
        }
        
        // imprime
         for (int i = 0; i < notas.length; i++) {
           
                arreglointercambiado = arreglointercambiado + intercambiado[i] + " ";
            
        }
         
        JOptionPane.showMessageDialog(null, "arreglo intercambiado: " + arreglointercambiado);

    }

}

