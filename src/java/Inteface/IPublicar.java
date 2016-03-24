/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inteface;

import org.hibernate.Session;

/**
 *
 * @author Rodrigo
 */
public interface IPublicar {
    
    
    public boolean inserta(Session session, IPublicar iPublicar ) throws Exception;
    
    public IPublicar getUlmoRegistro(Session session )throws Exception;
    
    
}
