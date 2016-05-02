/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.arsw.samples.model;

import java.util.*;

/**
 *
 * @author felipe
 */
public class Cliente {
    
    private String nombre; 
    private int cedula; 
    private String direccion;
    private int telefono;
    private String correo;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Sucursal> sucursales;
    private Inventario asistente;
    
    public Cliente(String nombre, int cedula, String direccion, int telefono, String correo){
        this.nombre=nombre;
        this.cedula=cedula;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Inventario getAsistente() {
        return asistente;
    }

    public void setAsistente(Inventario asistente) {
        this.asistente = asistente;
    }
    
    
    
}
