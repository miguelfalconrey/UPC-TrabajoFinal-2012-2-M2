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
    
    private ArrayList<Ent_Prospecto> Ent_Prospecto;

    public AppProspecto() {
        Ent_Prospecto = new ArrayList<Ent_Prospecto>();
    }
    
    private void ValidaDatos(String EstadoProspecto, String Nombres,
            String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto)
        throws CRM_Exception{
        String mensaje = "";
        if (EstadoProspecto==null || EstadoProspecto.isEmpty())
            mensaje += "Estado no puede ser nulo o no puede ser vacio";
        if (Nombres==null || Nombres.isEmpty())
            mensaje += "Nombre no puede ser nulo o vacio";
        if (ApellidoPaterno==null || ApellidoPaterno.isEmpty())
            mensaje += "Apellido Paterno no puede ser nulo o vacio";
        if (ApellidoMaterno==null || ApellidoMaterno.isEmpty())
            mensaje += "Apellido Materno no puede ser nulo o vacio";
        if (correo==null || correo.isEmpty())
            mensaje += "Correo no puede ser nulo o vacio";
        if (dni==null || dni.isEmpty())
            mensaje += "Dni no puede ser nulo o vacio";
        if (telefono==null || telefono.isEmpty())
            mensaje += "Telefono no puede ser nulo o vacio";        
        if (fechaContacto==null || fechaContacto.isEmpty())
            mensaje += "Fecha de contacto no puede ser nulo o vacio";
        if (! mensaje.isEmpty())
            throw new CRM_Exception(mensaje);
        }
        
    private void ValidaDuplicidad(String dni) 
            throws CRM_Exception {
        if (buscar(dni) != null){
            String mensaje = "DNI "+ dni + " ya esta registrado.";
            throw new CRM_Exception(mensaje);
        }
    }
    
    public void Registrar(String EstadoProspecto, String Nombres,
            String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto)
        throws CRM_Exception {
        ValidaDatos(EstadoProspecto, Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, fechaContacto);
        ValidaDuplicidad(dni);
        Ent_Prospecto nuevo = new Ent_Prospecto(EstadoProspecto, Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, fechaContacto);
        Ent_Prospecto.add(nuevo);
    }
        
    public int getCantidadProspectos() {
        return Ent_Prospecto.size();
    }

    public Ent_Prospecto buscar(String dni) {
       // Busqueda secuencial por dni
        for(Ent_Prospecto prospecto : Ent_Prospecto)
            if (prospecto.getDni().equals(dni))
               return prospecto;
        return null;
    }
}
    
    

    

