/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfacturacion;

import java.util.ArrayList;

/**
 *
 * @author pcsiecon
 */
public class Factura {
    private int numero;
    private Cliente cliente;
    private String fecha;
    private ArrayList<DetalleFactura> items;

    public Factura(int numero, Cliente cliente, String fecha) {
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = fecha;
        // Crear la coleccion de detalles de factura
        items = new ArrayList<DetalleFactura>();
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void adicionarItem(int cantidad, Producto producto) {
        //  Crear el nuevo detalle
        DetalleFactura nuevoDetalle = new DetalleFactura(cantidad, producto);
        // Guardar el detalle en la coleccion de detalles
        items.add(nuevoDetalle);
    }

    public int getNumeroItems() {
        return items.size();
    }

    
    
}
