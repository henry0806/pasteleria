
package edu.eci.cosw.samples.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Blueprint {

    private List<Point> points=null;
    
    public Blueprint(Point[] pnts){
        points=Arrays.asList(pnts);
    }
          
    public Blueprint(){
        points=new ArrayList<>();
    }

    public List<Point> getPoints() {
        return points;
    }
    
    public void addPoint(Point p){
        this.points.add(p);
    }
    
}
