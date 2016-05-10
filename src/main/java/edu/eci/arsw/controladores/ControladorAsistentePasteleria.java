/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.controladores;

import edu.eci.arsw.samples.model.AsistentePasteleria;
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
 * @author castellanosisa
 */
@RestController
@RequestMapping("/asistentePasteleria")
public class ControladorAsistentePasteleria {
    
    @Autowired
    Servicios services;
    
    
    @RequestMapping(value="/check",method = RequestMethod.GET)        
    public String check() {
        return "REST API OK";        
    }
    
    @RequestMapping(method = RequestMethod.POST)        
    public ResponseEntity<?> agregarAsistentePasteleria(@RequestBody AsistentePasteleria s) {       
        services.agregarAsistentePasteleria(s);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<AsistentePasteleria> getAsistentesPasteleria() {       
        return services.getAsistentesPasteleria();
    }
    
    @RequestMapping(value = "/{idSucursal}",method = RequestMethod.GET)        
    public AsistentePasteleria getIdAsistentePasteleria(@PathVariable("idAsistentePasteleria") int nit) {       
        return services.getIdAsistentePasteleria(nit);
    }

    
}
