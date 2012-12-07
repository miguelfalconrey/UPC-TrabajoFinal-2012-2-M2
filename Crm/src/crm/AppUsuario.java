package crm;

import java.util.ArrayList;

public class AppUsuario {

    ArrayList<Usuario> usuarios; //creacion de array de usuarios

    public AppUsuario() {
        usuarios = new ArrayList<Usuario>(); /* instanciando un array de objetos*/
    }
    
    //Metodo para validar los campos de la Clase (Campos del formulario)
    
    public void ValidacionDatos(String dni, String nombre, String apellidopaterno,
            String apellidomaterno, String usuario, String correo, String fechaingreso,
            String cargo, String rol, String contrasena, String creadopor,
            String fechadecreacion, String actualizadopor, String fechadeactualizacion) throws CRM_Exception {
        
        String mensaje ="";
        
        //Se validan que los campos no esten vacios
        if (dni==null || dni.isEmpty())
            mensaje += "DNI no puede ser nulo o vacio";
        if (nombre==null || nombre.isEmpty())
            mensaje += "Nombre no puede ser nulo o vacio";
        if (apellidopaterno==null || apellidopaterno.isEmpty())
            mensaje += "Apellido paterno no puede ser nulo o vacio";
        if (apellidomaterno==null || apellidomaterno.isEmpty())
            mensaje += "Apellido materno no puede ser nulo o vacio";
        if (usuario==null || usuario.isEmpty())
            mensaje += "Usuario no puede ser nulo o vacio";
        if (correo==null || correo.isEmpty())
            mensaje += "Correo no puede ser nulo o vacio";
        if (fechaingreso==null || fechaingreso.isEmpty())
            mensaje += "Fecha de ingreso no puede ser nulo o vacio";
        if (cargo==null || cargo.isEmpty())
            mensaje += "Cargo no puede ser nulo o vacio";
        if (rol==null || rol.isEmpty())
            mensaje += "Rol no puede ser nulo o vacio";
        if (contrasena==null || contrasena.isEmpty())
            mensaje += "Contraseña no puede ser nulo o vacio";
        if (creadopor==null || creadopor.isEmpty())
            mensaje += "Creador por no puede ser nulo o vacio";
        if (fechadecreacion==null || fechadecreacion.isEmpty())
            mensaje += "Fecha de creación no puede ser nulo o vacio";
        
        /*Los campos actualizadopor y fechadeactualizacion se deshabilitan en el formulario(deben ser igual
         * a vacio - null), ya que en estos campos recien se ingresaran datos cuando se haya realizado alguna
         * modificacion posterior a su registro*/
        
        if (actualizadopor != null)
            mensaje += "No se puede ingresar datos en campo actualizado por";
        if (fechadeactualizacion != null)
            mensaje += "No se puede ingresar datos en campo fecha de actualización";
        
        
        if (! mensaje.isEmpty())
            throw new CRM_Exception(mensaje);        
    }
    
    
    //Metodo para validar que no se repitan los codigos de usuario
    
    private void ValidacionDuplicidad(String usuario) 
            throws CRM_Exception {
        
        //En esta condición se usa el metodo buscar para verificar si el codigo de usuario ingresado existe o no
        
        if (BuscarUsuario(usuario) != null){
            String mensaje = "Usuario "+ usuario + " ya esta registrado.";
            throw new CRM_Exception(mensaje);
        }
    }
    
    //Funcion para ingresar un nuevo Usuario
    
    public boolean RegistrarUsuario(String dni, String nombre, String apellidopaterno,
            String apellidomaterno, String usuario, String correo, String fechaingreso,
            String cargo, String rol, String contrasena, String creadopor,
            String fechadecreacion, String actualizadopor, String fechadeactualizacion) throws CRM_Exception {

        boolean rpta = false;
        
        //Se llama a los metodos de validación antes de realizar el registro del usuario
        ValidacionDatos(dni, nombre, apellidopaterno, apellidomaterno, usuario, correo, fechaingreso, cargo,
                rol, contrasena, creadopor, fechadecreacion, actualizadopor, fechadeactualizacion);
        ValidacionDuplicidad(usuario);      
        
        //Se crea un nuevo objeto de la clase Usuario        
        rpta = usuarios.add(new Usuario(dni, nombre, apellidopaterno, apellidomaterno,
                usuario, correo, fechaingreso, cargo, rol, contrasena, creadopor,
                fechadecreacion, actualizadopor, fechadeactualizacion));
        
        return rpta;
    }
    
    //Metodo para buscar usuario registrado atraves de su codigo de usuario ("usuario")
    
    public Usuario BuscarUsuario(String usuario) {
        for (Usuario usu : usuarios) {
            if (usu.getUsuario().trim().equals(usuario)) {
                return usu;
            }
        }
        return null;

    }

    //Metodo para eliminar un usuario
    
    public void eliminarusuario(String usuario) {
        
        //Busca al usuario por su codigo
        Usuario usu = BuscarUsuario(usuario);
        //Elimina al usuario del arreglo de la lista
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
