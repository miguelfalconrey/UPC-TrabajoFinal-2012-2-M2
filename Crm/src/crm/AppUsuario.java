
package crm;

import java.util.ArrayList;

public class AppUsuario {

    ArrayList<Usuario> usuarios; //creacion de array de usuarios
    public AppUsuario() {
    usuarios = new ArrayList<Usuario>(); /* instanciando un array de objetos*/
    }

    public boolean RegistrarUsuario(String dni, String nombre, String apellidopaterno,
    String apellidomaterno, String usuario, String correo, String fechaingreso,
    String cargo, String rol, String contrasena, String creadopor,
    String fechadecreacion, String actualizadopor, String fechadeactualizacion) throws CRM_Exception { //procedimiento publico en donde le damos los parametros

    boolean rpta = false;

    rpta = usuarios.add(new Usuario(dni, nombre, apellidopaterno, apellidomaterno, 
            usuario, correo, fechaingreso, cargo, rol, contrasena, creadopor, 
            fechadecreacion, actualizadopor, fechadeactualizacion));
        //creo un nuevo objeto de clase de Usuario
        return rpta;
    }
    
    public Usuario BuscarUsuario(String nombre) {
        for (Usuario usu : usuarios) {
            if (usu.getUsuario().trim().equals(nombre)) {
                return usu;
            }
        }
        return null;
<<<<<<< HEAD
=======
    }
    
    public boolean ValidarUsuarioContrasena(String usu, String contrasena){
        String mensaje = "";
        
        Usuario usuario = BuscarUsuario(usu);
        if(usuario==null){
            if (! mensaje.isEmpty())
            throw new CRM_Exception(mensaje);
        }
        
        return false;
>>>>>>> 20851cdc1a5a0df080afb9d85b1e4897e1d47235
    }

    public void eliminarusuario(String usuario) {
        Usuario usu = BuscarUsuario(usuario);
        usuarios.remove(usu);
        usuarios.indexOf(usu);
    }

    
    public void editarusuario(String dni, String nombre, String apellidopaterno,
            String apellidomaterno, String usuario, String correo, String fechaingreso,
            String cargo, String rol, String contrasena, String creadopor,
            String fechadecreacion, String actualizadopor, String fechadeactualizacion) {

        int index; //Para guardar el indice

        Usuario usu = BuscarUsuario(usuario);
        usu.setCargo(cargo);
        usu.setRol(rol);
        usu.setActualizadopor(actualizadopor);

        index = usuarios.indexOf(usu);
        usuarios.set(index, usu);
    }

    
    public boolean validarusuariocontrasena(String usuario, String contrasena) throws CRM_Exception {
        boolean rpta = false;
        Usuario usu = BuscarUsuario(usuario);

        if (usu == null) {
            String mensaje = "Usuario o contraseña incorrecta";
            if (!mensaje.isEmpty()) {
                throw new CRM_Exception(mensaje);
            }
            rpta = false;
        } else {

            if (usu.getContrasena().trim().equals(contrasena)) {
                rpta = true;

            } else {
                String mensaje = "Usuario o contraseña incorrecta";
                if (!mensaje.isEmpty()) {
                    throw new CRM_Exception(mensaje);
                }
                rpta = false;
            }
        }

        return rpta;

       
    }
}
