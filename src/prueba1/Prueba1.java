/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame v1 = new JFrame("Titulo de ventana");
        JButton b1 = new JButton("Cerrar");
       
        v1.addWindowListener(  new WindowAdapter(){
                                        public void windowClosing(WindowEvent e){
                                               System.exit(0);
                                        }
                                   } );
        
        v1.setSize(300,200);
        v1.setLayout(new FlowLayout());
        v1.add(b1);
        v1.setVisible(true);
    }
    
}
