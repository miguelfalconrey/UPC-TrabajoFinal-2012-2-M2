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
public class AppProspecto {
    
    private ArrayList<Prospecto> Prospectos;

    public AppProspecto() {
        Prospectos = new ArrayList<Prospecto>();        
    }
    
    
    private void ValidaDatos(String nombres, String apellidopaterno, String apellidomaterno,
            String correo, String dni, String telefono, String fechaContacto, boolean estado)
        throws CRM_Exception {
        
        String mensaje = "";
        
        if (nombres==null || nombres.isEmpty())
            mensaje += "Nombre no puede ser nulo o vacio";
        if (apellidopaterno==null || apellidopaterno.isEmpty())
            mensaje += "Apellido Paterno no puede ser nulo o vacio";
        if (apellidomaterno==null || apellidomaterno.isEmpty())
            mensaje += "Apellido Materno no puede ser nulo o vacio";
        if (correo==null || correo.isEmpty())
            mensaje += "Correo no puede ser nulo o vacio";
        if (dni==null || dni.isEmpty())
            mensaje += "Dni no puede ser nulo o vacio";
        if (telefono==null || telefono.isEmpty())
            mensaje += "Telefono no puede ser nulo o vacio";        
        if (fechaContacto==null || fechaContacto.isEmpty())
            mensaje += "Fecha de contacto no puede ser nulo o vacio";
        if (estado==false)
            mensaje += "Prospecto no puede ser un cliente";
        if (! mensaje.isEmpty())
            throw new CRM_Exception(mensaje);
        }
    
    
    private void ValidaDuplicidad(String dni) 
            throws CRM_Exception {
        if (buscarProspecto(dni) != null){
            String mensaje = "DNI "+ dni + " ya esta registrado.";
            throw new CRM_Exception(mensaje);
        }
    }
    
    public void Registrar(String nombres, String apellidopaterno, String apellidomaterno,
            String correo, String dni, String telefono, String fechaContacto, boolean estado)
        throws CRM_Exception{
        
        ValidaDatos(nombres, apellidopaterno, apellidomaterno, correo, dni, telefono, fechaContacto, estado);
        ValidaDuplicidad(dni);
        
        Prospecto nuevo = new Prospecto(nombres, apellidopaterno, apellidomaterno, correo, dni, telefono, fechaContacto, estado);
        Prospectos.add(nuevo);
    }
        
    public int getCantidadProspectos() {
        return Prospectos.size();
    }

    public Prospecto buscarProspecto(String dni) {
        for(Prospecto prospecto : Prospectos)
            if (prospecto.getDni().equals(dni))
               return prospecto;
        return null;
    }
    
    public void editarProspecto(String Nombres, String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto, boolean estado) {

        int index; //Para guardar el indice

        Prospecto pro = buscarProspecto(dni);
        pro.setCorreo(correo);
        pro.setTelefono(telefono);
        pro.setEstado(estado);
        
        index = Prospectos.indexOf(pro);
        Prospectos.set(index, pro);
    }
    
    public void eliminarProspecto(String dni) {
        
        Prospecto pro = buscarProspecto(dni);
        
        Prospectos.remove(pro);
        
    }
       
}
