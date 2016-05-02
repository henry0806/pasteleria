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
public class Inventario {
    private int numero;
    private Sucursal sucursal;
    private ArrayList<Ingrediente> ingredientes;
    
    public Inventario(int numero, Sucursal sucursal,ArrayList<Ingrediente> ingredientes){
        this.numero = numero;
        this.sucursal = sucursal;
        this.ingredientes = ingredientes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    
}
