/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.controladores;

import edu.eci.arsw.samples.model.Sucursal;
import edu.eci.arsw.services.Servicios;
import java.util.ArrayList;
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
@RequestMapping("/sucursal")
public class ControladorSucursal {
    @Autowired
    Servicios services;
    
    
    @RequestMapping(value="/check",method = RequestMethod.GET)        
    public String check() {
        return "REST API OK";        
    }
    
    @RequestMapping(method = RequestMethod.POST)        
    public ResponseEntity<?> agregarSucursal(@RequestBody Sucursal s) {       
        services.agregarSucursal(s);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Sucursal> getSucursales() {       
        return services.getSucursales();
    }
    
    @RequestMapping(value = "/{idSucursal}",method = RequestMethod.GET)        
    public Sucursal getIdSucursal(@PathVariable("idSucursal") int nit) {       
        return services.getIdSucursal(nit);
    }

    
}
