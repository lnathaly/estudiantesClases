/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.controller;

import a.com.entity.Clases;
import a.com.entity.Estudiante;
import a.com.interfaces.ClasesFacadeLocal;
import a.com.interfaces.EstudianteFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author LauraDesarrollo
 */
@Named
@RequestScoped
public class controllerIndex implements Serializable{
    
    @EJB
    EstudianteFacadeLocal estudianteFacade;
    
    @EJB 
    ClasesFacadeLocal claseFacade;
    
    private int cedula;
    private String nombre;
    private String nombreC;
    private int duracion;

    public void crearEstudiante(){
      Estudiante es =new Estudiante (cedula, nombre);
      estudianteFacade.create(es);
    }
    
    public void crearClases (){
      Clases clases = new Clases(nombreC, duracion);
      claseFacade.create(clases);
    }
    
      
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
}
