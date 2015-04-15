/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.services;

import edu.eci.cosw.samples.model.Blueprint;
import edu.eci.cosw.samples.model.Point;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author hcadavid
 */
@Service
public class ServicesFacade {
   
    private static final Map<String,Blueprint> dummyBluePrints=new LinkedHashMap<>();
    
    static{
        dummyBluePrints.put("larecta", new Blueprint("larecta",new Point[]{new Point(0,0),new Point(10,10)}));
        dummyBluePrints.put("rayon",new Blueprint("rayon",new Point[]{new Point(20,20),
                                                      new Point(30,30),
                                                      new Point(45,80)
        }));
        dummyBluePrints.put("poligono1",new Blueprint("poligono1",new Point[]{new Point(3,44),
                                                      new Point(66,34),
                                                      new Point(75,33),
                                                      new Point(100,100)
        }));    
    }
    
    public void addNewBlueprint(String name,Blueprint bp){
        dummyBluePrints.put(name,bp);
    }
    
    public Set<String> getBlueprintNames(){
        return dummyBluePrints.keySet();
    }
    
    public Blueprint getBlueprintByName(String name){
        return dummyBluePrints.get(name);
    }
    
}
