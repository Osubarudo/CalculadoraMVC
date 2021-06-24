/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.Calculadora;
import vista.FormCalculadora;

/**
 *
 * @author osval
 */
public class Controlador implements ActionListener, KeyListener {
    
            private FormCalculadora view;
    private Calculadora model;

    public Controlador(FormCalculadora view, Calculadora model) {
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
        //this.view.menuSalir.addActionListener(this);
        this.view.txtNumeroUno.addKeyListener(this);
    }

    public void iniciar() {
        view.setTitle("MVC Calculadora");
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));

        if (view.btnSumar == ae.getSource()) {
            model.sumar();
            //JOptionPane.showMessageDialog(null, "Sumar");
        }

        if (view.btnRestar == ae.getSource()) {
            model.restar();
            //JOptionPane.showMessageDialog(null, "Restar");
        }

        if (view.btnMultiplicar == ae.getSource()) {
            model.multiplicar();
            //JOptionPane.showMessageDialog(null, "Multiplicar");
        }
        if (view.btnDividir == ae.getSource()) {
            model.dividir();
            //JOptionPane.showMessageDialog(null, "Dividir");
        }

//        if (view.menuSalir == ae.getSource()) {
//            JOptionPane.showMessageDialog(null, "Boton Salir");
//        }

        view.txtResultado.setText(String.valueOf(model.getResultado()));

    }

    @Override
    public void keyTyped(KeyEvent ke) {

        if (view.txtNumeroUno == ke.getSource()) {
            //JOptionPane.showMessageDialog(null, "Evento keyTiped");
            char c = ke.getKeyChar();
            if (ke.getKeyChar() == com.sun.glass.events.KeyEvent.VK_ENTER) {//Al presionar enter pasa el foco al siguiente campo
                view.txtNumeroDos.requestFocus();//hay que definir a que componente pasa el foco
            } else if (ke.getKeyChar() == com.sun.glass.events.KeyEvent.VK_BACKSPACE || ke.getKeyChar() == com.sun.glass.events.KeyEvent.VK_DELETE) {//lo utilizo para que no haga el sonido del beep al borrar
                //
            } else if (c < '0' || c > '9') {
                view.getToolkit().beep();
                ke.consume();
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public void keyTyped(KeyEvent e) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

 
    
    
}
