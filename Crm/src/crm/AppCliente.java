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
public class AppCliente {
    
    
    private ArrayList<Ent_Cliente> Ent_Cliente;

    public AppCliente() {
        Ent_Cliente = new ArrayList<Ent_Cliente>();
    }
    
    private void ValidaDatos(String Nombres, String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto)
        throws CRM_Exception{
        String mensaje = "";
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
    
        public void Registrar(String Nombres, String ApellidoPaterno, String ApellidoMaterno,
                String correo, String dni, String telefono, String fechaContacto)
        throws CRM_Exception {
        ValidaDatos(Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, fechaContacto);
        ValidaDuplicidad(dni);
        Ent_Cliente nuevo = new Ent_Cliente(Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, fechaContacto);
        Ent_Cliente.add(nuevo);
    }
        
    public int getCantidadClientes() {
        return Ent_Cliente.size();
    }

    public Ent_Cliente buscar(String dni) {
        for(Ent_Cliente cliente : Ent_Cliente)
            if (cliente.getDni().equals(dni))
               return cliente;
        return null;
    }
    
    
}
