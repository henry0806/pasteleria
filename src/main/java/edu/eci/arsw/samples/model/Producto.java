/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.samples.model;


import java.util.ArrayList;

/**
 *
 * @author castellanosisa
 */
public class Producto {
    private int tipo;
    private Pasteleria pasteleria;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Pedido> pedidos;

    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Pasteleria getPasteleria() {
        return pasteleria;
    }

    public void setPasteleria(Pasteleria pasteleria) {
        this.pasteleria = pasteleria;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
