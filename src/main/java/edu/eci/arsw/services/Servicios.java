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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2092252
 */

@Service
public class Servicios {
    
    //Pasteleria
    private static final Map<String,Pasteleria> pasteleria = new LinkedHashMap<>();
    //Sucursal
    private static final Map<String,Sucursal> sucursal = new LinkedHashMap<>();
    private static final ArrayList<AsistentePasteleria> asistentes = new ArrayList<>();
    //Cliente
    private static final Map<String,Cliente> cliente = new LinkedHashMap<>();
    //Inventario
    private static final Map<String,Inventario> inventario = new LinkedHashMap<>();
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    
    static{
        //Pasteleria
        pasteleria.put("1", new Pasteleria(1,"nicol","nico.co"));
        //Sucursal
        sucursal.put("1" ,new Sucursal(1,1,"ak",asistentes,getPasteleria("i"), getInventario("1")));
        //Cliente
        cliente.put("1", new Cliente("isabel",1,"av",311,"@bla"));
        //Inventario
        ingredientes.add(new Ingrediente("Vainilla","masa",200,1));
        inventario.put("1", new Inventario(1, getSucursal("1"), ingredientes));
    }
    
    
    //Pasteleria
    public void agregarPasteleria(String nombre,Pasteleria pa){
        pasteleria.put(nombre,pa);
    }
    public Set<String> getIdPasteleria(){
        return pasteleria.keySet();
    }
    public static Pasteleria getPasteleria(String id){
        return pasteleria.get(id);
    }
    //Sucursal
    public void agregarSucursal(String numero,Sucursal su){
        sucursal.put(numero ,su);
    }
    public Set<String> getIdSucursal(){
        return sucursal.keySet();
    }
    public static Sucursal getSucursal(String id){
        return sucursal.get(id);
    }
    //Cliente
    public void agregarCliente(String nombre,Cliente cl){
        cliente.put(nombre,cl);
    }
    public Set<String> getIdClientes(){
        return cliente.keySet();
    }
    public static Cliente getCliente(String id){
        return cliente.get(id);
    }
    //Inventario
    public void agregarInventario(String numero,Inventario in){
        inventario.put(numero ,in);
    }
    public Set<String> getIdInventarios(){
        return inventario.keySet();
    }
    public static Inventario getInventario(String id){
        return inventario.get(id);
    }
    
    
    
}
