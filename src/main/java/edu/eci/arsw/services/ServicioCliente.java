/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.services;


import edu.eci.arsw.samples.model.Cliente;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author hcadavid
 */
@Service
public class ServicioCliente {
   
    private static final Map<String,Cliente> cliente = new LinkedHashMap<>();
    
    static{
        cliente.put("1", new Cliente("isabel",1,"av",311,"@bla"));
    }
         
    public void agregarCliente(String nombre,Cliente cl){
        cliente.put(nombre,cl);
    }
    
    public Set<String> getIdClientes(){
        return cliente.keySet();
    }
    
    public Cliente getCliente(String id){
        return cliente.get(id);
    }
    
}
