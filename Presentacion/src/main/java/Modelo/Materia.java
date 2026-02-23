/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Materia {
    private String nombreMateria;

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
    public String listarCargaAcademica(){
       return nombreMateria;
    }
    @Override
    public String toString() {
        return "Materia{" + "nombreMateria=" + nombreMateria + '}';
    }
    
}
