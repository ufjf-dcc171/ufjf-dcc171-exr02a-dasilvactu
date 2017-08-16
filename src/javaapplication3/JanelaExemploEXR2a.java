/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
       
       private int n1;
       private int n2;
    public JanelaExemploEXR2a() throws HeadlessException {
        super("Soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        lblNumero1 = new JLabel("Entrada 1");
        txtNumero1 = new JTextField(20);
        lblNumero2 = new JLabel("Entrada 2");
        txtNumero2 = new JTextField(20);
        lblSaida = new JLabel("");
        add(lblNumero1);
        add(txtNumero1);
        add(lblNumero2);
        add(txtNumero2);
        add(lblSaida);
        
        txtNumero1.addActionListener(new Numero1Enter());
        txtNumero2.addActionListener(new Numero2Enter());
    }

    private class Numero2Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n2 = Integer.parseInt(txtNumero2.getText());
            lblSaida.setText(Integer.toString(n1+n2));
        }
    }

    private class Numero1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Integer.parseInt(txtNumero1.getText());
            txtNumero2.requestFocus();
        }
    }
 
   

}
