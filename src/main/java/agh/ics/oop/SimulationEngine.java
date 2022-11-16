package agh.ics.oop;


import java.util.List;

public class SimulationEngine implements IEngine{
    final private MoveDirection [] directions;
    IWorldMap map;
    SimulationEngine(MoveDirection [] directions, IWorldMap map, Vector2d [] vectors ){
        this.directions=directions;
        this.map=map;
        for (Vector2d vector : vectors) {
            map.place(new Animal(map, vector));

        }
    }
    List<Animal> animals = AbstractWorldMap.animals;

    @Override
    public void run() {
        int n=animals.size();
        for (int i=0; i< directions.length; i++){
            animals.get(i%n).move(directions[i]);
        }
    }
}
