package agh.ics.oop;

import java.util.*;

import static java.lang.Math.*;
import static java.util.Collections.shuffle;

public class GrassField extends AbstractWorldMap {

    static Map<Vector2d, Grass> grasses = new HashMap<>();

    public GrassField (int n){

        List<Vector2d> GrassPlacements = new ArrayList<>();

        for (int i = 0; i < sqrt(n * 10); i++) {
            for (int j = 0; j < sqrt(n * 10); j++) {
                GrassPlacements.add(new Vector2d(i, j));
            }
        }
        shuffle(GrassPlacements);
        boundaries.lowerendx=GrassPlacements.get(0).x;
        boundaries.lowerendy=GrassPlacements.get(0).y;
        boundaries.height=GrassPlacements.get(0).y;
        boundaries.width=GrassPlacements.get(0).x;

        for (int i = 0; i < n; i++) {
            grasses.put(GrassPlacements.get(i),new Grass(GrassPlacements.get(i)));
            boundaries.positionChanged(new Vector2d(0,0),GrassPlacements.get(i),this);
        }

    }
    @Override
    public boolean canMoveTo(Vector2d position) {
        return !super.isOccupied(position);
    }
    @Override
    public boolean isOccupied(Vector2d position) {
        boolean b=super.isOccupied(position);
        if(b){return true;}
        Object value=grasses.get(position);
        return value != null;
    }
    @Override
    public Object objectAt(Vector2d position){
        Object value=animals.get(position);
        if (value!=null){
            return value;
        }
        value=grasses.get(position);
        return value;
    }

}
