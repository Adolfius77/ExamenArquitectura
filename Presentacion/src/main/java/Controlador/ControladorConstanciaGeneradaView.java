/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Alumno;
import Vista.ConstanciaGeneradaView;

/**
 *
 * @author USER
 */
public class ControladorConstanciaGeneradaView {
    private ConstanciaGeneradaView constanciaGeneradaView;

    public ControladorConstanciaGeneradaView(ConstanciaGeneradaView constanciaGeneradaView) {
        this.constanciaGeneradaView = constanciaGeneradaView;
    }

    
    
    public void solicitarGeneracion(Alumno alumno){
        Modelo.ConstanciaEstudios nuevaConstancia = new Modelo.ConstanciaEstudios("", new java.util.Date());
        nuevaConstancia.generarFolio();
        nuevaConstancia.estructurarDocumento();
        
        
    }
   
    
    
}
