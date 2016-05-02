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
    private String tipo;
    private int precio;
    private int tamaño;

    public Ingrediente(String nombre, String tipo, int precio, int tamaño){
        this.nombre=nombre;
        this.tipo=tipo;
        this.precio=precio;
        this.tamaño=tamaño;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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

}
