/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
public class JanelaExemploEXR2a extends JFrame {
       private final JLabel lblNumero1;
       private final JTextField txtNumero1;
       private final JLabel lblNumero2;
       private final JTextField txtNumero2;
       private final JLabel lblSaida;
    public JanelaExemploEXR2a() throws HeadlessException {
        super("Soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        lblNumero1 = new JLabel("Entrada 1");
        txtNumero1 = new JTextField(20);
        lblNumero2 = new JLabel("Entrada 2");
        JTextField txtNumero2 = new JTextField(20);
        lblSaida = new JLabel("Saída");
        add(lblNumero1);
        add(txtNumero1);
        add(lblNumero2);
        add(txtNumero2);
         
    
    }
 
   

}
