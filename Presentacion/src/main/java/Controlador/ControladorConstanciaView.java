/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Alumno;
import Vista.ConstanciaView;

/**
 *
 * @author USER
 */
public class ControladorConstanciaView {
    private ConstanciaView constanciaView;
    private Alumno modeloAlumno;

    public ControladorConstanciaView(ConstanciaView constanciaView, Alumno modeloAlumno) {
        this.constanciaView = constanciaView;
        this.modeloAlumno = modeloAlumno;
    }
    
    public void buscarAlumno(){
        
    }
    @Override
    public String toString() {
        return "ControladorConstanciaView{" + "constanciaView=" + constanciaView + ", modeloAlumno=" + modeloAlumno + '}';
    }
    
    
}
