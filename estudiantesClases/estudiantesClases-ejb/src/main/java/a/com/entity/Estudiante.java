/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author LauraDesarrollo
 */
@Entity
@Table (name =  "estudiante")
public class Estudiante implements Serializable{
    
    @Id
    @Column(name ="cedula")
    private int cedula;
    
    @Column(name = "nombre")
    private String nombre;
    
    @JoinTable(name = "estudiante_clase", joinColumns = {
        @JoinColumn(name = "id_estudiante", referencedColumnName = "cedula")}, inverseJoinColumns = {
        @JoinColumn(name = "id_clase", referencedColumnName = "codigo")})
    @ManyToMany
    private List<Clases> clasesList;

    public Estudiante() {
    }

    public Estudiante(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
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

    public List<Clases> getClasesList() {
        return clasesList;
    }

    public void setClasesList(List<Clases> clasesList) {
        this.clasesList = clasesList;
    }
    
    
}
