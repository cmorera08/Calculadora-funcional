/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package c.morera.company;

import javax.swing.JFrame;

public class CalculadorFuncional {

    public static void main(String[] args) {
        // 1. Crear el marco/ventana flotante
        JFrame ventana = new JFrame("ProCalc 2.0");
        
        // 2. Crear una instancia de tu JPanel
        Interface miPanel = new Interface();
        
        // 3. Meter el JPanel dentro de la ventana
        ventana.add(miPanel);
        
        // 4. Configurar comportamientos de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();                     // Ajusta el tamaño al panel
        ventana.setLocationRelativeTo(null); // Centra en pantalla
        ventana.setVisible(true);            // Muestra la ventana
    }
}
