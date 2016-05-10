/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.samples.model;


/**
 *
 * @author felipe
 */
public class Ingrediente {
   
    private String nombre;
    //tipos: 1=masa, 2=decorado, 3=adicion
    private int tipo;
    private int precio;
    private int tamaño;
    private String forma;

    

    public Ingrediente(String nombre, int tipo, int precio, int tamaño, String forma){
        this.nombre=nombre;
        this.tipo=tipo;
        this.precio=precio;
        this.tamaño=tamaño;
        this.forma=forma;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
}
