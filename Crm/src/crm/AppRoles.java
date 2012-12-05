package crm;

import java.util.ArrayList;

public class AppRoles {

    ArrayList<Roles> rol;
    ArrayList<Permisos> permiso;

    public AppRoles() {
        rol = new ArrayList<Roles>();
        permiso = new ArrayList<Permisos>();
    }

    public void RegistrarPermisos(String nombre, String modulo, boolean adicionar, boolean editar, boolean eliminar)
            throws CRM_Exception {
        ValidarExistencia(nombre);
        ValidaDatosPermisos(nombre, modulo, adicionar, editar, eliminar);
        ValidaDuplicidadPermisos(modulo);

        permiso.add(new Permisos(nombre, modulo, adicionar, editar, eliminar));
    }

    private void ValidaDatosPermisos(String nombre, String modulo, boolean adicionar, boolean editar, boolean eliminar) throws CRM_Exception {
        String mensaje = "";
        if (nombre == null || nombre.isEmpty()) {
            mensaje += "Nombre no puede ser nulo o vacio";
        }
        if (modulo == null || modulo.isEmpty()) {
            mensaje += "Apellido Paterno no puede ser nulo o vacio";
        }
        if (!mensaje.isEmpty()) {
            throw new CRM_Exception(mensaje);
        }
    }

    private void ValidaDuplicidadPermisos(String nombre)
            throws CRM_Exception {
        if (buscar(nombre) != null) {
            String mensaje = "El " + nombre + " ya esta registrado.";
            throw new CRM_Exception(mensaje);
        }

    }

    public Permisos buscarPermisos(String nombre) {
        for (Permisos usuario : permiso) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }


    public void RegistrarRoles(String nombre, String descripcion, String creadopor, String creadoel, String actualizadopor, String actualizadoel)
            throws CRM_Exception {
        ValidaDatosRoles(nombre, descripcion, creadopor, creadoel, actualizadopor, actualizadoel);
        ValidaDuplicidadRoles(nombre);

        rol.add(new Roles(nombre, descripcion, creadopor, creadoel, actualizadopor, actualizadoel));
    }

    private void ValidaDatosRoles(String nombre, String descripcion, String creadopor, String creadoel, String actualizadopor, String actualizadoel) throws CRM_Exception {
        String mensaje = "";
        if (nombre == null || nombre.isEmpty()) {
            mensaje += "Nombre no puede ser nulo o vacio";
        }
        if (descripcion == null || descripcion.isEmpty()) {
            mensaje += "Apellido Paterno no puede ser nulo o vacio";
        }
        if (creadopor == null || creadopor.isEmpty()) {
            mensaje += "Apellido Materno no puede ser nulo o vacio";
        }
        if (creadoel == null || creadoel.isEmpty()) {
            mensaje += "Correo no puede ser nulo o vacio";
        }
        if (actualizadopor == null || actualizadopor.isEmpty()) {
            mensaje += "Dni no puede ser nulo o vacio";
        }
        if (actualizadopor == null || actualizadopor.isEmpty()) {
            mensaje += "Telefono no puede ser nulo o vacio";
        }
        if (actualizadoel == null || actualizadoel.isEmpty()) {
            mensaje += "Fecha de contacto no puede ser nulo o vacio";
        }
        if (!mensaje.isEmpty()) {
            throw new CRM_Exception(mensaje);
        }
    }

    private void ValidaDuplicidadRoles(String nombre)
            throws CRM_Exception {
        if (buscar(nombre) != null) {
            String mensaje = "El " + nombre + " ya esta registrado.";
            throw new CRM_Exception(mensaje);
        }

    }

    public Roles buscar(String nombre) {
        for (Roles usuario : rol) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }    

    private void ValidarExistencia(String nombre) throws CRM_Exception {
        if (buscar(nombre) == null) {
            String mensaje = "El rol " + nombre + " no existe.";
            throw new CRM_Exception(mensaje);
        }
    }

       public void eliminarpermiso(String nombre) {
        Permisos pe = BuscarPermisos(nombre);
        permiso.remove(pe);
        permiso.indexOf(pe);
    }
       

}
