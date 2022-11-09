package agh.ics.oop;

import java.util.List;

public class SimulationEngine implements IEngine{
    final private MoveDirection [] directions;

    SimulationEngine(MoveDirection [] directions, IWorldMap map, Vector2d [] vectors ){
        this.directions=directions;
        for (Vector2d vector : vectors) {
            map.place(new Animal(map, vector));

        }
    }
    List<Animal> animals=RectangularMap.animals;

    @Override
    public void run() {
        int n=animals.size();
        for (int i=0; i< directions.length; i++){
            animals.get(i%n).move(directions[i]);
        }
    }
}
