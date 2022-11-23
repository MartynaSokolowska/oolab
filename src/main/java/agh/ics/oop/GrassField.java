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
        lowerendx=GrassPlacements.get(0).x;
        width=GrassPlacements.get(0).x;
        lowerendy=GrassPlacements.get(0).y;
        height=GrassPlacements.get(0).y;
        for (int i = 0; i < n; i++) {
            grasses.put(GrassPlacements.get(i),new Grass(GrassPlacements.get(i)));
            lowerendx=min(GrassPlacements.get(i).x,lowerendx);
            lowerendy=min(GrassPlacements.get(i).y,lowerendy);
            width=max(GrassPlacements.get(i).x,width);
            height=max(GrassPlacements.get(i).y,height);
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
        if (value!=null){
                return true;
        }
        return false;
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

    @Override
    public String toString() {

        for (Animal animal:animals.values()) {
            lowerendx=min(animal.position.x,lowerendx);
            lowerendy=min(animal.position.y,lowerendy);
            width=max(animal.position.x,width);
            height=max(animal.position.y,height);
        }
        return super.toString();
    }
}
