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
public interface IUsuario_Publicar {
    
    public boolean insert(Session session, IUsuario_Publicar  iUsuario_Publicar)throws Exception;
    
}
