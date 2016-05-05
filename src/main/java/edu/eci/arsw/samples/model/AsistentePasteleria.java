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
public class AsistentePasteleria {
    private String nombre;
    private int cedula;
    private ArrayList<Cliente> clientes;

    public AsistentePasteleria(String nombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }  
    
}
