package agh.ics.oop;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class SimulationEngine implements IEngine,Runnable{
    final private MoveDirection [] directions;
    IWorldMap map;
    List<Animal> animals = new ArrayList<>();

    SimulationEngine(MoveDirection [] directions, IWorldMap map, Vector2d [] vectors ){
        this.directions=directions;
        this.map=map;
        for (Vector2d vector : vectors) {
            Animal Reks=new Animal(map, vector);
            if (map.place(Reks)){
                Reks.addObserver(map);
                if (this.map.getClass()== GrassField.class){
                    Reks.addObserver(map.boundaries);
                }
                animals.add(Reks);
            }
            else{
                throw new IllegalArgumentException("vector " + vector + " is already occupied or cannot be used.");
            }
        }
    }

    @Override
    public void run() {
        int n=animals.size();
        for (int i=0; i< directions.length; i++){
            System.out.println(map);
            System.out.println(directions[i]);
            try {
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            animals.get(i%n).move(directions[i]);

        }
    }
}
