/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author USER
 */
public class ConstanciaEstudios {
    private String folioEmision;
    private Date fechaGeneracion;

    public ConstanciaEstudios(String folioEmision, Date fechaGeneracion) {
        this.folioEmision = folioEmision;
        this.fechaGeneracion = fechaGeneracion;
    }

    public void generarFolio(){
        System.out.println("generando folio......");
        this.folioEmision = "ORTEGA-2" + UUID.randomUUID().toString().substring(0, 4).toUpperCase();
    }
    public void estructurarDocumento(){
        System.out.println("estructurando documento....");
    }
    
    @Override
    public String toString() {
        return "ConstanciaEstudios{" + "folioEmision=" + folioEmision + ", fechaGeneracion=" + fechaGeneracion + '}';
    }

    public String getFolioEmision() {
        return folioEmision;
    }

    public void setFolioEmision(String folioEmision) {
        this.folioEmision = folioEmision;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
    
    
    
    
}
