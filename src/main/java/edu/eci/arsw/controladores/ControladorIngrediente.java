/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.controladores;

import edu.eci.arsw.samples.model.Ingrediente;
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
@RequestMapping("/ingrediente")
public class ControladorIngrediente {

    @Autowired
    Servicios services;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String check() {
        return "REST API OK";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> agregarIngrediente(@RequestBody Ingrediente s) {
        services.agregarIngrediente(s);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Ingrediente> getIngredientes() {
        return services.getIngredientes();
    }

    @RequestMapping(value = "/{idIngrediente}", method = RequestMethod.GET)
    public Ingrediente getIdIngrediente(@PathVariable("idIngrediente") int nit) {
        return services.getIdIngrediente(nit);
    }

    @RequestMapping(value = "/nombresIngredientes/{tipoIngrediente}/{tipoForma}", method = RequestMethod.GET)
    public ArrayList<String> getNombresIngredientesPorTipo(@PathVariable("tipoIngrediente") int tipo, @PathVariable("tipoForma") String forma) {
        return services.getNombresIngredientes(tipo, forma);
    }
}
