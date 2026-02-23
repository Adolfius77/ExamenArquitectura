/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class ProgramaEducativo {
    private String nombreCarrera;
    private String planEstudios;

    public ProgramaEducativo(String nombreCarrera, String planEstudios) {
        this.nombreCarrera = nombreCarrera;
        this.planEstudios = planEstudios;
    }
    public String detallarInformacionCarrera(){
        return nombreCarrera + " (Plan " + planEstudios + ")";
    }
  
    
}
