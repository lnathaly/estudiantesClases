/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author LauraDesarrollo
 */
@Entity
@Table(name = "estudiante_notas")
@NamedQueries({
    @NamedQuery(name = "EstudianteNotas.findAll", query = "SELECT e FROM EstudianteNotas e"),
    @NamedQuery(name = "EstudianteNotas.findByCedula", query = "SELECT e FROM EstudianteNotas e WHERE e.cedula = :cedula"),
    @NamedQuery(name = "EstudianteNotas.findByNombre", query = "SELECT e FROM EstudianteNotas e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "EstudianteNotas.findByNombrec", query = "SELECT e FROM EstudianteNotas e WHERE e.nombrec = :nombrec"),
    @NamedQuery(name = "EstudianteNotas.findByNota1", query = "SELECT e FROM EstudianteNotas e WHERE e.nota1 = :nota1"),
    @NamedQuery(name = "EstudianteNotas.findByNota2", query = "SELECT e FROM EstudianteNotas e WHERE e.nota2 = :nota2"),
    @NamedQuery(name = "EstudianteNotas.findByNota3", query = "SELECT e FROM EstudianteNotas e WHERE e.nota3 = :nota3")})
public class EstudianteNotas implements Serializable {

    @NotNull
    @Column(name = "cedula")
    private int cedula;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nombrec")
    private String nombrec;
    @Column(name = "nota1")
    private Integer nota1;
    @Column(name = "nota2")
    private Integer nota2;
    @Column(name = "nota3")
    private Integer nota3;

    public EstudianteNotas() {
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

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }
    
}
