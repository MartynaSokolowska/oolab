
package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractWorldMap implements IWorldMap {
    protected int lowerendx;
    protected int lowerendy;
    protected int height;
    protected int width;
    protected static List<Animal> animals = new ArrayList<>();
    @Override
    public boolean canMoveTo(Vector2d position) {
        return !this.isOccupied(position);
    }

    @Override
    public boolean place(Animal animal) {
        if (canMoveTo(animal.position)) {
            animals.add(animal);
            return true;
        }
        return false;
    }
    @Override
    public boolean isOccupied(Vector2d position) {
        for (Animal animal: animals) {
            if (animal.position.equals(position))
                return true;
        }
        return false;
    }
    @Override
    public Object objectAt(Vector2d position){
        for (Animal animal: animals) {
            if (animal.position.equals(position))
                return animal;
        }
        return null;
    }
    public String toString() {
        return new MapVisualiser(this).draw(new Vector2d(lowerendx, lowerendy), new Vector2d(width,height));
    }

}