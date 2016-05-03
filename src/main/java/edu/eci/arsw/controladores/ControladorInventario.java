/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.controladores;

import edu.eci.arsw.samples.model.Inventario;
import edu.eci.arsw.services.Servicios;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2092252
 */

@RestController
@RequestMapping("/inventario")

public class ControladorInventario {
    
    @Autowired
    Servicios services;
    
    
    @RequestMapping(value="/check",method = RequestMethod.GET)        
    public String check() {
        return "REST API OK";        
    }
    
    @RequestMapping(method = RequestMethod.POST)        
    public ResponseEntity<?> agregarInventario(@RequestBody Inventario in) {       
        services.agregarInventario(in.getNumero()+"",in);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Set<String> getIdInventario() {       
        return services.getIdInventarios();
    }
    
    @RequestMapping(value = "/{idInventario}",method = RequestMethod.GET)        
    public Inventario getInventario(@PathVariable("idInventario") String numero) {       
        return services.getInventario(numero);
    }
}
