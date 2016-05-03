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
public class Sucursal {
    
    private int numero;
    private int telefono; 
    private String direccion; 
    private ArrayList<AsistentePasteleria> asistentes;
    private ArrayList<Pedido>pedidos;
    private ArrayList<Cliente>clientes;
    private Pasteleria pasteleria;
    private Inventario inventario;

    public Sucursal(int numero, int telefono, String direccion, ArrayList<AsistentePasteleria> asistentes, Pasteleria pasteleria, Inventario inventario) {
        this.numero=numero;
                this.telefono=telefono;
                this.direccion=direccion;
                this.asistentes=asistentes;
                this.pasteleria=pasteleria;
                this.inventario=inventario;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = direccion;
    }

    public ArrayList<AsistentePasteleria> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList<AsistentePasteleria> asistentes) {
        this.asistentes = asistentes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Pasteleria getPasteleria() {
        return pasteleria;
    }

    public void setPasteleria(Pasteleria pasteleria) {
        this.pasteleria = pasteleria;
    }

    
}
