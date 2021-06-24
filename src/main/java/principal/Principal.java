/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controlador.Controlador;
import modelo.Calculadora;
import vista.FormCalculadora;

/**
 *
 * @author osval
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora mod = new Calculadora();
        FormCalculadora view = new FormCalculadora();

        Controlador ctrl = new Controlador(view, mod);
        ctrl.iniciar();
        view.setVisible(true);

    }

}
