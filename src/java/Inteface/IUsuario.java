/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inteface;
import Pojo.Usuario;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author Rodrigo
 */
public interface IUsuario {
    
    public Usuario getByIdUsuario(Session session, Integer idProducto)throws Exception;
    
    public List<Usuario> getAll(Session session ) throws Exception;
    
    public Usuario getByCorreo(Session session , String correo )throws Exception;
            
}
