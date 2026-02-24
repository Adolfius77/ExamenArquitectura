/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.ControladorConstanciaView;
import Modelo.Alumno;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class presentacion {
    public static void main(String[] args) {
        Alumno modeloAlumno = new Alumno(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Controlador.ControladorConstanciaView controlador = new ControladorConstanciaView(null, modeloAlumno);
        
        ConstanciaView vistaPrincipal = new ConstanciaView(controlador, modeloAlumno);
        
        vistaPrincipal.setLocationRelativeTo(null);
        vistaPrincipal.setVisible(true);
    }
}
