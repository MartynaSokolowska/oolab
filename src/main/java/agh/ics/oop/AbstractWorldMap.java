
package agh.ics.oop;

import java.util.HashMap;
import java.util.Map;

abstract class AbstractWorldMap implements IWorldMap {
    static Map<Vector2d, Animal> animals = new HashMap<>();

    @Override
    public boolean canMoveTo(Vector2d position) {
        return !this.isOccupied(position);
    }

    @Override
    public boolean place(Animal animal) {
        if (canMoveTo(animal.position)) {
            animals.put(animal.position,animal);
            return true;
        }
        throw new IllegalArgumentException("vector " + animal.position + " is already occupied or cannot be used.");

    }
    @Override
    public boolean isOccupied(Vector2d position) {
            return animals.get(position) != null;
    }
    @Override
    public Object objectAt(Vector2d position){
        return animals.get(position);
    }
    public String toString() {
        return new MapVisualiser(this).draw(new Vector2d(boundaries.lowerendx, boundaries.lowerendy), new Vector2d(boundaries.width,boundaries.height));
    }
    void positionChanged(Vector2d oldPosition, Vector2d newPosition,IWorldMap map){
        Animal animal=animals.get(oldPosition);
        animals.remove(oldPosition);
        animals.put(newPosition,animal);
    }

}