/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.samples.model;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Pedido {
    
    private int numPedido; 
    private int precioTotal; 
    private boolean pedidoListo; 
    private ArrayList<Producto> productos;
    private Sucursal sucursal;
    private Cliente cliente;
    
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isPedidoListo() {
        return pedidoListo;
    }

    public void setPedidoListo(boolean pedidoListo) {
        this.pedidoListo = pedidoListo;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
