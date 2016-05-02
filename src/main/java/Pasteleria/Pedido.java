/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pasteleria;

/**
 *
 * @author felipe
 */
public class Pedido {
    
    private int numPedido; 
    private int precioTotal; 

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
    private boolean pedidoListo; 
}
