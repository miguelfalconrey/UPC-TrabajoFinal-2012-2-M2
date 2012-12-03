/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import java.util.ArrayList;

/**
 *
 * @author gerald
 */
public class AppUsuario {
    
    ArrayList<Usuario> usuarios; //creacion de array de usuarios

    public AppUsuario() {
        usuarios = new ArrayList<Usuario>(); /* instanciando un array de objetos*/
    }
    
    
    
    public boolean RegistrarUsuario(String dni, String nombre, String apellidopaterno, String apellidomaterno, 
            String usuario, String correo, String fechaingreso, String cargo, String rol, String contrasena,
            String creadopor, String fechadecreacion, String actualizadopor, String fechadeactualizacion)
            throws CRM_Exception{ //procedimiento publico en donde le damos los parametros
        
        boolean rpta = false;
        
        rpta = usuarios.add(new Usuario(dni, nombre, apellidopaterno, apellidomaterno, usuario, correo, fechaingreso,
                cargo, rol, contrasena, creadopor, fechadecreacion, actualizadopor, fechadeactualizacion));
        //creo un nuevo objeto de clase de Usuario
        
        return rpta;
        
    }
    
    
    public Usuario BuscarUsuario(String nombre){
        for (Usuario usu:usuarios){
            if(usu.getUsuario().trim().equals(nombre)){
                return usu;
            }
        }
        return null;
    }
    
    public boolean ValidarUsuarioContrasena(String usu, String contrasena){
        String mensaje = "";
        
        Usuario usuario = BuscarUsuario(usu);
        if(usuario==null){
            if (! mensaje.isEmpty())
            throw new CRM_Exception(mensaje);
        }
        
        return false;
    }
    
}
