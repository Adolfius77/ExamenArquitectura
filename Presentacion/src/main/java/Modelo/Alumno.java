/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author USER
 */
public class Alumno implements IObservable {

    private String nombre;
    private String matricula;
    private EstadoAcademico estado;
    private double promedio;
    private String semestre;

    private List<ProgramaEducativo> carrera;
    private List<Materia> materias;
    private List<IObserver> observadores;

    public Alumno(List<ProgramaEducativo> carrera, List<Materia> materias, List<IObserver> observadores) {
        this.carrera = carrera;
        this.materias = materias;
        this.observadores = observadores;
    }

    public void proporcionarIdentidad(String matriculaEncontrada) {
        if (matriculaEncontrada != null && !matriculaEncontrada.trim().isEmpty()) {

            this.matricula = "123";
            this.nombre = "Ana García López";
            this.promedio = 92.5;
            this.estado = EstadoAcademico.REGULAR;
            this.semestre = "7to semestre - Agosto/Diciembre 2023";

            if (this.carrera == null) {
                this.carrera = new java.util.ArrayList<>();
            }
            this.carrera.clear();
            this.carrera.add(new ProgramaEducativo("Ingeniería en Sistemas Computacionales", "2018"));

            if (this.materias == null) {
                this.materias = new java.util.ArrayList<>();
            }
            this.materias.clear();
            this.materias.add(new Materia("Desarrollo Web"));
            this.materias.add(new Materia("Base de Datos II"));
            this.materias.add(new Materia("Inteligencia Artificial"));

            notificarObservador("DATOS_ENCONTRADOS");
        }
    }

    public EstadoAcademico proporcionarEstadoAcadamico() {
        return this.estado;
    }

    @Override
    public void agregarObservador(IObserver obs) {
        this.observadores.add(obs);
    }

    @Override
    public void eliminarObservador(IObserver obs) {
        this.observadores.remove(obs);
    }

    @Override
    public void notificarObservador(String evento) {
        for (IObserver obs : observadores) {
            obs.actualizar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public EstadoAcademico getEstado() {
        return estado;
    }

    public void setEstado(EstadoAcademico estado) {
        this.estado = estado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public List<ProgramaEducativo> getCarrera() {
        return carrera;
    }

    public void setCarrera(List<ProgramaEducativo> carrera) {
        this.carrera = carrera;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<IObserver> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<IObserver> observadores) {
        this.observadores = observadores;
    }

}
