/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.services;

import edu.eci.arsw.samples.model.AsistentePasteleria;
import edu.eci.arsw.samples.model.Cliente;
import edu.eci.arsw.samples.model.Ingrediente;
import edu.eci.arsw.samples.model.Inventario;
import edu.eci.arsw.samples.model.Pasteleria;
import edu.eci.arsw.samples.model.Sucursal;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2092252
 */

@Service
public class Servicios {
    
    //Pasteleria
    private static final ArrayList<Pasteleria> pasteleria = new ArrayList<>();
    //Sucursal
    private static final ArrayList<Sucursal> sucursal = new ArrayList<>();
    
    //Cliente
    private static final ArrayList<Cliente> cliente = new ArrayList<>();
    //Inventario
    private static final ArrayList<Inventario> inventario = new ArrayList<>();
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    //Asistente pasteleria
    private static final ArrayList<AsistentePasteleria> asistentes = new ArrayList<>();
    
    static{
        //Pasteleria
        pasteleria.add(new Pasteleria(1,"nicol","nico.co"));
        //Sucursal
        sucursal.add(new Sucursal(1,1,"ak",asistentes,pasteleria.get(0)));
        //Cliente
        cliente.add(new Cliente("isabel",1,"av",311,"@bla"));
        //Inventario
        ingredientes.add(new Ingrediente("Vainilla","masa",200,1));
        inventario.add(new Inventario(1, sucursal.get(0), ingredientes));
        //Asistente pasteleria
        
    }
    
    
    //Pasteleria
    public void agregarPasteleria(Pasteleria pa){
        pasteleria.add(pa);
    }
    public ArrayList<Pasteleria> getPastelerias(){
        return pasteleria;
    }
    public static Pasteleria getIdPasteleria(int id){
        return pasteleria.get(id);
    }
    //Sucursal
    public void agregarSucursal(Sucursal su){
        sucursal.add(su);
    }
    public ArrayList<Sucursal> getSucursales(){
        return sucursal;
    }
    public static Sucursal getIdSucursal(int id){
        return sucursal.get(id);
    }
    //Cliente
    public void agregarCliente(Cliente cl){
        cliente.add(cl);
    }
    public ArrayList<Cliente> getClientes(){
        return cliente;
    }
    public static Cliente getIdCliente(int id){
        return cliente.get(id);
    }
    //Inventario
    public void agregarInventario(Inventario in){
        inventario.add(in);
    }
    public ArrayList<Inventario> getInventarios(){
        return inventario;
    }
    public static Inventario getIdInventario(int id){
        return inventario.get(id);
    }
    //Asistente pasteleria
    
    
}
