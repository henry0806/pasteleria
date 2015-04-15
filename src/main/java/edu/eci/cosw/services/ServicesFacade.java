/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.services;

import edu.eci.cosw.samples.model.Blueprint;
import edu.eci.cosw.samples.model.Point;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author hcadavid
 */
@Service
public class ServicesFacade {
   
    private static final List<Blueprint> dummyBluePrints=new LinkedList<>();
    
    static{
        dummyBluePrints.add(new Blueprint(new Point[]{new Point(0,0),new Point(10,10)}));
        dummyBluePrints.add(new Blueprint(new Point[]{new Point(20,20),
                                                      new Point(30,30),
                                                      new Point(45,80)
        }));
        dummyBluePrints.add(new Blueprint(new Point[]{new Point(3,44),
                                                      new Point(66,34),
                                                      new Point(75,33),
                                                      new Point(100,100)
        }));    
    }
    
    public void addNewBlueprint(Blueprint bp){
        dummyBluePrints.add(bp);
    }
    
    public List<Blueprint> getAllBlueprints(){
        return dummyBluePrints;
    }
    
}
