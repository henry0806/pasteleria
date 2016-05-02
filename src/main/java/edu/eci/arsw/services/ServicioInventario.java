/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.services;

import edu.eci.arsw.samples.model.Ingrediente;
import edu.eci.arsw.samples.model.Inventario;
import edu.eci.arsw.samples.model.Sucursal;
import java.util.*;

/**
 *
 * @author castellanosisa
 */
public class ServicioInventario {
    private static final Map<String,Inventario> inventario = new LinkedHashMap<>();
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    
    static{
        ingredientes.add(new Ingrediente("Vainilla","masa",200,1));
        inventario.put("1", new Inventario(1, new Sucursal(), ingredientes));
    }
         
    public void agregarInventario(String nombre,Inventario in){
        inventario.put(nombre,in);
    }
    
    public Set<String> getIdInventarios(){
        return inventario.keySet();
    }
    
    public Inventario getInventario(String id){
        return inventario.get(id);
    }
}
