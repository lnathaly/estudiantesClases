/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.bean;

import a.com.interfaces.AbstractFacade;
import a.com.interfaces.ClasesFacadeLocal;
import a.com.entity.Clases;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LauraDesarrollo
 */
@Stateless
public class ClasesFacade extends AbstractFacade<Clases> implements ClasesFacadeLocal {
    @PersistenceContext(unitName = "a.com_estudiantesClases-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClasesFacade() {
        super(Clases.class);
    }
    
}
