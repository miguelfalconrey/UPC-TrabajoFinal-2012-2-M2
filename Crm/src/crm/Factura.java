// Ingreso de Facturas/Boletas de COMPRA

package crm;

import java.util.ArrayList;

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
}
