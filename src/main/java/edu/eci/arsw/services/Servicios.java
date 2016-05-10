/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.services;

import edu.eci.arsw.samples.model.*;
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
    //Productos
    private static final ArrayList<Producto> productos = new ArrayList<>();
    //Pedidos
    private static final ArrayList<Pedido> pedidos = new ArrayList<>();

    static {
        //Pasteleria
        pasteleria.add(new Pasteleria(1, "nicol", "nico.co"));
        //Asistente pasteleria
        asistentes.add(new AsistentePasteleria("Henry", 1));
        //Sucursal
        sucursal.add(new Sucursal(1, 1, "ak", asistentes, pasteleria.get(0)));
        //Cliente
        cliente.add(new Cliente("Isabel", 1, "av", 311, "@bla"));
        //Inventario
        ingredientes.add(new Ingrediente("Vainilla", 1, 200, 1, "Circular"));
        ingredientes.add(new Ingrediente("Chocolate", 1, 200, 1, "Circular"));
        ingredientes.add(new Ingrediente("Arequipe", 1, 200, 1, "Circular"));
        ingredientes.add(new Ingrediente("Sin gluten", 1, 200, 1, "Circular"));
        ingredientes.add(new Ingrediente("Foundant", 2, 200, 1, "Circular"));
        ingredientes.add(new Ingrediente("Ice", 2, 200, 1, "Circular"));
        ingredientes.add(new Ingrediente("Gomitas", 3, 200, 1, "Circular"));
        ingredientes.add(new Ingrediente("Chispitas", 3, 200, 1, "Circular"));
        ingredientes.add(new Ingrediente("Chips Chocolate", 3, 200, 1, "Circular"));
             
        ingredientes.add(new Ingrediente("Chocolate", 1, 200, 1, "Cuadrada"));
        ingredientes.add(new Ingrediente("Arequipe", 1, 200, 1, "Cuadrada"));
        ingredientes.add(new Ingrediente("Vainilla", 1, 200, 1, "Cuadrada"));
        ingredientes.add(new Ingrediente("Sin gluten", 1, 200, 1, "Cuadrada"));
        ingredientes.add(new Ingrediente("Foundant", 2, 200, 1, "Cuadrada"));
        ingredientes.add(new Ingrediente("Ice", 2, 200, 1, "Cuadrada"));
        ingredientes.add(new Ingrediente("Gomitas", 3, 200, 1, "Cuadrada"));
        ingredientes.add(new Ingrediente("Chispitas", 3, 200, 1, "Cuadrada"));
        ingredientes.add(new Ingrediente("Chips Chocolate", 3, 200, 1, "Cuadrada"));
     
        ingredientes.add(new Ingrediente("Vainilla", 1, 200, 1, "Triangular"));
        ingredientes.add(new Ingrediente("Chocolate", 1, 200, 1, "Triangular"));
        ingredientes.add(new Ingrediente("Arequipe", 1, 200, 1, "Triangular"));
        ingredientes.add(new Ingrediente("Sin gluten", 1, 200, 1, "Triangular"));
        ingredientes.add(new Ingrediente("Foundant", 2, 200, 1, "Triangular"));
        ingredientes.add(new Ingrediente("Ice", 2, 200, 1, "Triangular"));
        ingredientes.add(new Ingrediente("Gomitas", 3, 200, 1, "Triangular"));
        ingredientes.add(new Ingrediente("Chispitas", 3, 200, 1, "Triangular"));
        ingredientes.add(new Ingrediente("Chips Chocolate", 3, 200, 1, "Triangular"));   
        
        inventario.add(new Inventario(1, sucursal.get(0), ingredientes));

    }

    //Pasteleria
    public void agregarPasteleria(Pasteleria pa) {
        pasteleria.add(pa);
    }

    public ArrayList<Pasteleria> getPastelerias() {
        return pasteleria;
    }

    public static Pasteleria getIdPasteleria(int id) {
        return pasteleria.get(id);
    }

    //Sucursal
    public void agregarSucursal(Sucursal su) {
        sucursal.add(su);
    }
    public ArrayList<Sucursal> getSucursales() {
        return sucursal;
    }
    public static Sucursal getIdSucursal(int id) {
        return sucursal.get(id);
    }

    //Cliente
    public void agregarCliente(Cliente cl) {
        cliente.add(cl);
    }
    public ArrayList<Cliente> getClientes() {
        return cliente;
    }
    public static Cliente getIdCliente(int id) {
        return cliente.get(id);
    }

    //Inventario
    public void agregarInventario(Inventario in) {
        inventario.add(in);
    }
    public ArrayList<Inventario> getInventarios() {
        return inventario;
    }
    public static Inventario getIdInventario(int id) {
        return inventario.get(id);
    }

    //Asistente pasteleria
    public void agregarAsistentePasteleria(AsistentePasteleria as) {
        asistentes.add(as);
    }
    public ArrayList<AsistentePasteleria> getAsistentesPasteleria() {
        return asistentes;
    }
    public static AsistentePasteleria getIdAsistentePasteleria(int id) {
        return asistentes.get(id);
    }

    //Producto
    public void agregarProducto(Producto as) {
        productos.add(as);
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public static Producto getIdProducto(int id) {
        return productos.get(id);
    }
    
    //Ingrediente
    public void agregarIngrediente(Ingrediente as) {
        ingredientes.add(as);
    }
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public static Ingrediente getIdIngrediente(int id) {
        return ingredientes.get(id);
    }
    public ArrayList<String> getNombresIngredientes(int tipo, String forma) {
        ArrayList<String> nombres = new ArrayList<>();
        for (int i = 0; i < ingredientes.size(); i++) {
            if (ingredientes.get(i).getTipo() == tipo && ingredientes.get(i).getForma().equals(forma)) {
                nombres.add(ingredientes.get(i).getNombre());
            }
        }
        return nombres;
    }
    
    

    //Pedido
    public void agregarPedido(Pedido as) {
        pedidos.add(as);
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public static Pedido getIdPedido(int id) {
        return pedidos.get(id);
    }
    
    

}

